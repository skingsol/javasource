package poly;

public class ProductEx {

	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer buyer = new Buyer();
		
		//Tv 구매하다
//		Tv1 tv1 = new Tv1();
//		buyer.buy(tv1);   아래와 같은 코딩
		buyer.buy(new Tv1()); //왼쪽과 오른쪽이 같을때 간편화 가능
		
		//Computer 구매하다
		Computer computer = new Computer();
		buyer.buy(computer);
		
		
		System.out.println("현재 남은 돈은 "+buyer.money+" 만원입니다.");
		System.out.println("현재 보너스 점수는 "+buyer.bonusPoint+" 점 입니다.");
		

	}

}
