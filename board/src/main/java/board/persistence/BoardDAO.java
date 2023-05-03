package board.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import board.domain.BoardDTO;

public class BoardDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	//DB서버 연결
	public Connection getConnection() {		
		try {
			
			Context ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
			Connection con = ds.getConnection();
			//DML 실행시 트랜잭션 관리를 직접 하겠음;
			con.setAutoCommit(false);
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//자원해제
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 게시글 등록
	// insertArticle(BoardDTO boardDTO)
	// re_ref : bno 동일한 값, re_lev : 0, re_seq : 0
	public boolean insertArticle(BoardDTO boardDTO) {
		boolean flag = false;
		
		try {
			
			con = getConnection();
			String sql = "INSERT INTO board(bno, name, password, title, content, attach, re_ref, re_lev, re_seq) ";
			sql += "VALUES(board_seq.nextval,?,?,?,?,?,board_seq.currval,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, boardDTO.getName());
			pstmt.setString(2, boardDTO.getPassword());
			pstmt.setString(3, boardDTO.getTitle());
			pstmt.setString(4, boardDTO.getContent());
			pstmt.setString(5, boardDTO.getAttach());
			pstmt.setInt(6, 0);
			pstmt.setInt(7, 0);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		
		return flag;
	}
	
	//board 전체 가져오기
	//bno,title,name,regdate,cnt
	public List<BoardDTO> getRows() {
		List<BoardDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "SELECT bno,title,name,regdate,cnt FROM board order by bno desc";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setTitle(rs.getString("title"));
				dto.setName(rs.getString("name"));
				dto.setRegDate(rs.getDate("regdate"));
				dto.setCnt(rs.getInt("cnt"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
		
	}
	// 게시글 상세보기
	public BoardDTO getRow(int bno) {
		BoardDTO dto = null;
		
		try {
			con = getConnection();
			
			String sql = "SELECT bno,name,title,content,attach FROM board WHERE bno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto = new BoardDTO();
				dto.setBno(rs.getInt("bno"));
				dto.setName(rs.getString("name"));
				dto.setTitle(rs.getString("title"));
				dto.setContent(rs.getString("content"));
				dto.setAttach(rs.getString("attach"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	// 조회수 증가
	// "UPDATE board SET cnt = cnt+1 WHERE bno=?";
	public boolean readCnt(int bno){
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "UPDATE board SET cnt = cnt+1 WHERE bno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				flag= true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	
	// 업데이트
	// title, content 수정 + attach(옵션)
	public boolean updateArticle(BoardDTO updateDto) {
		boolean flag = false;
		String sql = null;
		try {
			con = getConnection();
			if(updateDto.getAttach()==null) {
				sql = "UPDATE board SET title=?, content=? WHERE bno=? AND password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setInt(3, updateDto.getBno());
				pstmt.setString(4, updateDto.getPassword());
			}else {
				sql = "UPDATE board SET title=?, content=?, attach=? WHERE bno=? AND password=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, updateDto.getTitle());
				pstmt.setString(2, updateDto.getContent());
				pstmt.setString(3, updateDto.getAttach());
				pstmt.setInt(4, updateDto.getBno());
				pstmt.setString(5, updateDto.getPassword());
			}				
				
			int result = pstmt.executeUpdate();

			if (result > 0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return flag;
	}
	
	
	// 삭제하기
	public boolean delete(int bno, String password) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql = "DELETE FROM board WHERE bno=? AND password=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bno);
			pstmt.setString(2, password);
			
			int result = pstmt.executeUpdate();
			
			if (result>0) {
				flag= true;
				commit(con);
			}
			
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;	
	}
}