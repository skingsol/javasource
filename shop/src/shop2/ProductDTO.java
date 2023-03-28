package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString

//@Data //getter, setter, equals, caEqual, hashCode, toString, 기본생성자
public class ProductDTO {
	private int productId;
	private String pname;
	private int price;
	private String content;
}
