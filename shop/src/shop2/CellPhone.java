package shop2;

public class CellPhone extends Product {

	String carrier; //통신사정보 변수
	
	public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier =carrier;
		
	}

	 
	
	//CellPhone의 이름과 가격 출력 메소드 필요
	
	
	//통신사정보 출력 메소드 필요
	public void printExtra() {
		System.out.println("통신사 정보"+carrier);
	}
}
