package ch3;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+, -, *, /, %
		
		// 사용자로부터 두개의 피연산자와 연산자를 입력받기
		// 연산을 수행한 후 출력
		
		Scanner sc = new Scanner(System.in);
		// 5 - 3 = 2
		System.out.println("첫번째 수 입력");
		int num1 = Integer.parseInt(sc.nextLine());
		// 연산자 입력 op
		System.out.println("연산자 입력"); //""==>String 쌍따옴표를 넣으려면 string 활용
		String op = sc.nextLine();
		System.out.println("두번째 수 입력");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		switch (op) {
		case "+":// 위에서 말한 쌍따옴표 가져오려면 string 쓰는게 이 경우 +,-,*,/,% 등
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		case "%":
			result = num1%num2;
			break;
		default:
			break;
		}
		System.out.printf("%d %s %d =%d",num1,op,num2,result);
		
		
	}

}
