package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버로드, 커넥션, select + DML 정의
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getcoConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password =  "TIGER";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
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

	// select - many : ArrayList 리턴
	public ArrayList<EmpDTO> getList(String ename){
		ArrayList<EmpDTO> list = new ArrayList<>();
		
		try {
			
			con = getcoConnection();
			//ename 이 홍길동인 사람 조회(empno, ename, job, hiredate)
			String sql = "SELECT empno, ename, job, hiredate FROM emp_temp WHERE ename=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ename);
			
			rs = pstmt.executeQuery();
			
			
			while(rs.next()) {
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setHiredate(rs.getDate(4));
				
				list.add(empDTO);			
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	// select - one : DTO 리턴
	public EmpDTO getRow(int empno) {
		EmpDTO empDTO = null;
		try {
			con = getcoConnection();
			
			// WHERE 절에 pk(primary key-기본키(중복불가, null 불가))가 조건으로 들어오는 경우 무조건 하나의 행이 나옴
			// empno(pk), deptno(pk)
			String sql = "SELECT empno, ename, job, sal, comm, deptno FROM emp_temp WHERE empno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setSal(rs.getInt(4));
				empDTO.setComm(rs.getInt(5));    //<== rs.getint("comm") 같이 필드명으로 작성해도됨 ( 숫자는 헷갈릴수 있음)
				empDTO.setDeptno(rs.getInt(6));		
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return empDTO;
	}
	
	// 급여 수정
	public boolean update(int sal, int empno) {
		boolean status = false;
		try {
			con = getcoConnection();
			//사번이 일치하면 급여 수정
			String sql ="UPDATE emp_temp SET sal=? WHERE empno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status = true;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}	finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//사원 삭제
	public boolean remove(int empno) {
		boolean status = false;
		
		
		try {
			con = getcoConnection();
			//empno 일치시 사원 삭제
			String sql = "DELETE FROM emp_temp WHERE empno=? ";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if (result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//사원추가
	public boolean insert(EmpDTO empDTO) {
		boolean status = false;
		try {
			con = getcoConnection();
			
			String sql = "INSERT INTO emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno) VALUES(?,?,?,?,sysdate,?,?,?) ";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setInt(5, empDTO.getSal());
			pstmt.setInt(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());
			
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
