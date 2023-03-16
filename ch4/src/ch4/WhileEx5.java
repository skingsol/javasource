package ch4;

import java.util.Scanner;

public class WhileEx5 {

	public static void main(String[] args) {
		
		boolean run=true;
		int balance = 50000; //잔액 변수
		
		

		
		
		while (run) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔액|4.종료");
			System.out.println("----------------------");
			System.out.println("메뉴선택 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				//예금액 입력받기
				//잔액 = 잔액+예금액
				//현재 잔액 출력

				System.out.println("예금액 >>");
//				int 예금 = Integer.parseInt(sc.nextLine());
//				
//				balance=예금+balance;
				
				
				
				balance+=Integer.parseInt(sc.nextLine());
				//balance=balance+Integer.parseInt(sc.nextLine());
				
				System.out.println("현재 잔액 : " +balance);
				
				break;
			case 2:
				System.out.println("출금액 >>");
				int 출금 = Integer.parseInt(sc.nextLine());
				
				balance = balance - 출금;
				System.out.println("현재 잔액 : " +balance);
				break;
			case 3:
				System.out.println("현재 잔액 : " +balance);
				
				break;
			case 4:
				run=false;
				break;

			default:
				break;
			}
		}

		
		
	}
}




