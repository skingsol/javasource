package ch1;

import java.util.Scanner;

public class VaribleEx1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("두 자리 정수를 입력해 주세요");
		
		//int num Integer.parseInt(sc.nextLine())를 두 줄로 나누어 줌
		String input=sc.nextLine();
		int num= Integer.parseInt(input);
		
		System.out.printf("입력숫자: %d",num);
		
	}
}
