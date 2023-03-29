package shop2;

import static shop2.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;  

// JdbcUtil 클래스을 만든이유 : 드라이버로드, connection, close 반복작업을 하나의 클래스에 정의(모아서쓰기) 위해서 사용

public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//C(INSERT) R(SELECT) U(UPDATE) D(DELETE) 메소드 작성
	
	// 장바구니 ==> sorder 추가
	public boolean insert(int userId, int productId) {
		boolean status = false;
		
		try {
			con = getConnection();
			String sql = "INSERT INTO sorder(order_id, user_id, product_id, order_date) VALUES(order_seq.nextval,?,?,sysdate)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setInt(2, productId);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return status;
		
		
		
	}
	
	// 장바구니 조회 - 특정 회원
	public List<OrderDTO> carts(int userId){
		List<OrderDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			
			String sql = "SELECT u.user_id, u.name, t.info, p.product_id, p.pname, p.price, p.content, o.order_date ";
			sql += "FROM suser u, sorder o, paytype t, product p ";
			sql += "WHERE u.user_id = o.user_id AND u.pay_no = t.pay_no AND p.product_id = o.product_id AND u.user_id =?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			
			// ResultSet 결과 값 : user_id, name, info, product_id, pname, price, content, order_date ==> OrderDTO 담기
			// UserDTO : user_id,name, info
			// Product : product_id, pname, price, content 
			//			 order_date			
			while (rs.next()) {
				UserDTO userDTO = new UserDTO();
				userDTO.setUserId(rs.getInt(1));
				userDTO.setName(rs.getString(2));
				userDTO.setType(rs.getString(3));
				
				ProductDTO productDTO = new ProductDTO();
				productDTO.setProductId(rs.getInt(4));
				productDTO.setPname(rs.getString(5));
				productDTO.setPrice(rs.getInt(6));
				productDTO.setContent(rs.getString(7));
				
				OrderDTO orderDTO = new OrderDTO();
				orderDTO.setUserDTO(userDTO);
				orderDTO.setProductDTO(productDTO);
				orderDTO.setOrderDate(rs.getDate(8));
				
				list.add(orderDTO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Close(con, pstmt, rs);
		}
		return list;
	}
	
}
