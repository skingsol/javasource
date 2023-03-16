package ch4;

import java.util.Scanner;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할 대 사용
 * 종류 : for(주로 사용됨), while, do-while
 */
public class ForEx2 {

	public static void main(String[] args) {
	//주사위 던지기
	
//		int dice=(int)(Math.random()*6)+1; //1~6사이의 임의의 수 만들기
//		System.out.println(dice);
//		
//		switch (dice) {
//		case 1:
//			System.out.println("1번");
//			break;
//		case 2:
//			System.out.println("2번");
//			break;
//		case 3:
//			System.out.println("3번");
//			break;
//		case 4:
//			System.out.println("4번");
//			break;
//		case 5:
//			System.out.println("5번");
//			break;
//		default:
//			System.out.println("6번");
//			break;
//		}
	
	
		for (int i = 0; i < 5; i++) {
			int dice1 = (int)(Math.random()*6)+1;
			System.out.print(dice1+" ");
		}
		
		//구구단 출력
		//5*1=5, 5*2=10
		
//		System.out.println();
//		int 오단=5;
//		for (int i = 1; i <= 9; i++) {
//			System.out.print(오단*i+" ");
//		}

		for (int i = 1; i < 10; i++) {
			System.out.printf("5 * %d = %d\n",i,(5*i));
		}
			
		
		// 사용자에게 출력을 원하는 구구단을 입력받아 구구단 출력
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 출력을 원하는 숫자 입력");
			
		int num=Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",num, i,(num*i));
		}
		
		//3의 배수와 5의 배수 합 구하기 (단 1~100사이의 숫자)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 || i%5==0) {
			sum+=i;}
		}
		System.out.println("3과 5의 배수 합"+sum);
		
		//3의 배수 합(단 9의 배수는 빼기)
		
		int 합 =0;
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%9!=0) {
			합+=i;
		}}
		System.out.println("3의 배수이지만 9의배수는 아닌 수의 합 "+합);
			
		
	}

}
