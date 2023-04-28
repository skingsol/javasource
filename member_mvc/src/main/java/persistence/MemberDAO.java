package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.ChangeDTO;
import domain.MemberDTO;

public class MemberDAO {
	
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
	
	//로그인
	//아이디와 비밀번호 일치하면 아이디와 이름만 추출
	//SELECT userid, name FROM membertbl WHERE userid=? AND password=?
	
	public MemberDTO isLogin(String userid, String password){
		MemberDTO dto = null;
		try {
			con = getConnection();
			
			String sql = "SELECT userid, name FROM membertbl WHERE userid=? AND password=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO();
				dto.setUserid(rs.getString("userid"));
				dto.setName(rs.getString("name"));
			}			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return dto;
	}
	
	//회원가입
	//INSERT INTO membertbl VALUES('hong123','hong123@', '홍길동', '남', 'hong123@gmail.com');
	public boolean insert(MemberDTO dto) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql ="INSERT INTO membertbl(userid, password, name, gender, email) VALUES(?, ?, ?, ?, ?) ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getEmail());
			
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
	
	//회원 비밀번호 변경
	//"UPDATE membertbl SET password=?";
	public boolean update(ChangeDTO dto) {
		boolean flag = false;
		try {
			con = getConnection();
			String sql ="UPDATE membertbl SET password=? WHERE userid = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, dto.getConfirmPassword());
			pstmt.setString(2, dto.getUserid());
						
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
	
	//회원탈퇴 - 아이디와 비밀번호 일치시
	// "DELETE FROM membertbl WHERE userid=? AND password=?";
	public boolean delete(String userid, String password) {
		boolean flag = false;
		
		try {
			con = getConnection();

			String sql = "DELETE FROM membertbl WHERE userid=? AND password=?";

			pstmt = con.prepareStatement(sql);
			// ? 해결
			pstmt.setString(1, userid);
			pstmt.setString(2, password);

			int result = pstmt.executeUpdate();

			if (result > 0) {
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
	
	//중복아이디 검사
	//존재하는 아이디가 있다면 true 리턴 false 리턴
	public boolean duplicateId(String userid){
		
		boolean flag = true;
		
		try {
			con = getConnection();

			String sql = "SELECT COUNT(*) FROM membertbl WHERE userid=?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			rs = pstmt.executeQuery();

			if (rs.next()) {
				int cnt = rs.getInt(1);
				if(cnt >0 ) flag = false;
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	
	// 회원조회
	// "SELECT userid, password, name, gender, email FROM membertbl order by code desc";
}
