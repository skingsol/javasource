package ch4;

import java.util.Iterator;

/* 반복문
 * 어떤 작업이 반복적으로 수행되도록 할 대 사용
 * 종류 : for(주로 사용됨), while, do-while
 */
public class ForEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ① int i = 0; 초기화
		// ② i < 10; 조건식 (*false 일때 반복문 종료*)
		// ③ 조건식이 true 일때 블럭안으로 진입 : 출력문(syso) 실행
		// ④ i++ 증감식 i=1
		// ⑤ i < 10;
		// ⑥ 조건식이 true 일때 블럭안으로 진입 : 출력문(syso) 실행
		// 이런식으로 조건식이 거짓이 될때까지 반복하게 됨
		for (int i = 0; i < 10; i++) {
			System.out.print(i+"  ");
		} // int i는 for 문안에서만 적용되는 지역변수 (블럭 밖에서 i를 활용할 수 없음)
		
		System.out.println();
		for (int i = 10;  0 < i ; i--) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i = 1;  i <= 10 ; i++) {
			System.out.print(i+"  ");
		}
		
		// 1 3 5 7 9 ~
		// i = i+2; 를 간략히 쓰면 i+=2 이렇게 표현 가능
		System.out.println();
		for (int i = 1;  i <= 10 ; i+=2) {
			System.out.print(i+"  ");
		}
	
//		int sum=10;
//		sum+=3 // sum=sum+3
		
		System.out.println();
		for (int i = 0; i < 3 ; i++) {
			System.out.print("hello"+" ");
		}
		
		System.out.println();
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+"  ");
		}
		
		System.out.println();
		for (int i = 1; i < 100; i+=2) {
			System.out.print(i+" ");
		}
		
// 1~10까지 덧셈 결과 출력

		System.out.println();
		int sum=0;
		for (int i = 1; i <= 10; i++) {
		sum+=i;
		}
		System.out.print("1~10 합 : "+sum);

		
		
		// 1~10까지 곱셈 결과 출력
		
		System.out.println();
		int mult=1;
		for (int i = 1; i <= 10; i++) {
			mult*=i;
		}
		System.out.println("1~10 곱 : "+mult);
		
		int trial=1;
		for (int i = 1; i < 10; i++) {
			trial=(trial*i%i)+i;
		}
		System.out.println("실험 결과 : "+trial);
	}

}
