package ch6;

import java.util.Scanner;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		//입력값으로 GoodsStock 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("상품코드>> ");
//		String code = sc.nextLine();
//		System.out.println("재고수량>> ");
//		int stockNum = Integer.parseInt(sc.nextLine());
//		
//		GoodsStock Stock = new GoodsStock(code, stockNum);
//		System.out.println(Stock);
		
		//3개의 상품에 대해서 인스턴스를 생성해야 한다면?
		
		GoodsStock[] goods = new GoodsStock[3];
//		goods[0] = new GoodsStock("p1001",200);
//		goods[0] = new GoodsStock("p1002",150);
//		goods[0] = new GoodsStock("p1003",250);
//		위 세줄의 코드를 입력값으로 변경하고 싶다면
		
		for (int i = 0; i < goods.length; i++) {
			System.out.println("상품코드>> ");
			String code = sc.nextLine();
			System.out.println("재고수량>> ");
			int stockNum = Integer.parseInt(sc.nextLine());
			
			goods[i] = new GoodsStock(code,stockNum);
			System.out.println("---------------------------------");
		}
		
		//확인용 코드
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
			
		}
		for(GoodsStock good:goods) {
			System.out.println(good);
		}
		
		
	}

}
