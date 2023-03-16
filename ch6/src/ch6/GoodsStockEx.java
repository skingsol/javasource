package ch6;

public class GoodsStockEx {

	public static void main(String[] args) {
		// 티셔츠 상품관리
		// 객체 생성
		// 객체 생성시 생성자가 자동으로 호출됨
		GoodsStock goods = new GoodsStock("p123456",150); //매개 변수를 가진 생성자 호출
		//(x)The constructor GoodsStock() is undefined
		// 초기화 어떻게 할거냐?
		// 생성자로 만들어보기

		System.out.println("현재 재고 수량"+goods.stockNum);
		
		//상품 판매 10개
		
		goods.subtractStock();
		
	}

}
