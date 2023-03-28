package shop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static shop2.JdbcUtil.*;

public class ProductDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//전체 상품 조회 
	public List<ProductDTO> getList(){
		List<ProductDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			// 전체상품조회
			String sql = "SELECT * FROM product";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setProductId(rs.getInt("product_id"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setContent(rs.getString("content"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			Close(con, pstmt, rs);
		}
		return list;
	}
	
	//상품 추가
	public boolean insert(ProductDTO dto) {
		boolean status = false;
		
		try {
			con = getConnection();
			
			String sql = "INSERT INTO product(product_id, pname, price, content) ";
			sql+= "VALUES(?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getProductId());
			pstmt.setString(2, dto.getPname());
			pstmt.setInt(3, dto.getPrice());
			pstmt.setString(4, dto.getContent());
			
			int result = pstmt.executeUpdate();
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			Close(con, pstmt);
		}
		return status;
	}
	
	
}
