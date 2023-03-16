package ch1;

import java.util.Scanner;

public class VaribleEx6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//사용자로부터 두 개의 피연산자를 입력받기
		System.out.print("첫 번째 수를 입력해 주세요: ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 수를 입력해 주세요: ");
		int num2=Integer.parseInt(sc.nextLine());
		
		//사칙연산 결과 출력
		System.out.printf("덧셈: %d\n",num1+num2);
		System.out.printf("뺄셈: %d\n",num1-num2);
		System.out.printf("곱하기: %d\n",num1*num2);
		System.out.printf("나누기: %d\n",num1/num2);
	}
}
