package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// ~~~DAO : DataBase 작업을 담당하는 클래스임
public class DeptDao {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// 커넥션을 위한 드라이버 로드
	static {
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		// 커넥션을 리턴 메소드
		public Connection getConnection() {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			
			try {
				con = DriverManager.getConnection(url, user, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;		
		}
		// close() : 자원닫기
		public void close (Connection con, PreparedStatement pstmt, ResultSet rs) {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
		public void close (Connection con, PreparedStatement pstmt) {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}
		
		
		//select-하나
		public DeptDTO getRow(int deptno) {
			//커넥션 가져오기
			con = getConnection();
			
			// sql 구문 작성하기
			String sql = "SELECT * FROM dept_temp WHERE deptno=?";
			DeptDTO dto = null;
			
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, deptno);
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
					
					//1번 방법
					//rs => DeptDTO에 담기										
//					deptno = rs.getInt(1);
//					String dname = rs.getString(2);
//					String loc = rs.getString(3);
//					
//					dto = new DeptDTO(deptno, dname, loc);				
					
					//2번 방법
//					return new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
					
					//3번 방법
					dto = new DeptDTO();
					dto.setDeptno(rs.getInt(1));
					dto.setDname(rs.getString(2));
					dto.setLoc(rs.getString(3));
					
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt, rs);
			}
			return dto;
		}
		 // select -all
		public ArrayList<DeptDTO> getRows() {
			
			ArrayList<DeptDTO> list = new ArrayList<>();
			
			try {		
				
				con = getConnection();
				
				String sql = "SELECT * FROM dept_temp";
				
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
//					System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
					
//					int deptno = rs.getInt(1);
//					String dname = rs.getString(2);
//					String loc = rs.getString(3);
//					DeptDTO dto = new DeptDTO(deptno, dname, loc);
					
//					list.add(new DeptDTO(rs.getInt(1), rs.getString(2), rs.getString(3)));			
					
					DeptDTO dto = new DeptDTO();
					dto.setDeptno(rs.getInt(1));
					dto.setDname(rs.getString(2));
					dto.setLoc(rs.getNString(3));		
					list.add(dto);
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt, rs);
			}
			return list;
	}//getRows 종료	
		
		// 새 부서 추가 메소드 
		public boolean insert(DeptDTO dto) {
			
			// insert 성공 여부를 담는 변수로 사용
			boolean status = false;
			
			try {
				
				con = getConnection();
				
				String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
				
				pstmt = con.prepareStatement(sql);
				
				//? 처리
				pstmt.setInt(1, dto.getDeptno());
				pstmt.setString(2, dto.getDname());
				pstmt.setString(3, dto.getLoc());
				
				int result = pstmt.executeUpdate();
				
				if(result > 0) status = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(con, pstmt);
			}
			return status;
		}	
	
	// 새 부서 추가 메소드 
	public boolean insert(int deptno, String dname, String loc) {
		
		// insert 성공 여부를 담는 변수로 사용
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			String sql = "insert into dept_temp(deptno, dname, loc) values(?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			//? 처리
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
		
	// 부서 정보 수정 메소드 
	public boolean update(String value ,int deptno, int updateNo) {
		boolean status = false;
		String sql = null;
		
		try {
			con = getConnection();
			if (updateNo ==1) {
				// 부서 수정
				 sql= "UPDATE dept_temp SET dname=? WHERE deptno=?";
			} else if(updateNo ==2) {
				// 위치 수정
				sql = "UPDATE dept_temp SET loc=? WHERE deptno=?";
			}
			
			pstmt = con.prepareStatement(sql);
			// ?처리 
			pstmt.setString(1, value);
			pstmt.setInt(2, deptno);		
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return status;
	}
	// 부서 정보 삭제 메소드
	public boolean remove(int deptno) {
		boolean status = false;
		
		try {
			con = getConnection();
			// deptno 일치한 부서 삭제
			String sql = "DELETE FROM dept_temp WHERE deptno=?";
			
			pstmt = con.prepareStatement(sql);
			// ?처리 
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
		
		
		
		
}

		
