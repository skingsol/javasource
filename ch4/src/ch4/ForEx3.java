package ch4;

import java.util.Iterator;
import java.util.Scanner;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할 대 사용
 * 종류 : for(주로 사용됨), while, do-while
 */
public class ForEx3 {

	public static void main(String[] args) {
		
		//팩토리얼
		//4!=4*3*2*1
		
		//
		
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 값을 구할 숫자 입력");
		int num = Integer.parseInt(sc.nextLine());
		int result = 1; // 곱셈 결과를 저장할 변수
		for (int i = 1; i <= num; i++) {
			result*=i;
		}
		System.out.printf("%d! = %d",num,result);
		
		
		
		
	}

}

