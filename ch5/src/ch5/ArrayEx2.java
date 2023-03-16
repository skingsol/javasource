package ch5;

import java.util.Arrays;

public class ArrayEx2 {
/*기본타입 - byte, char, short, int, long, float, double, boolean
 * 참조타입 - String(클래스), 배열(Array) {맨 앞글자가 대문자}
 * 참조타입은 stack 형 메모리, heap 형 메모리를 쓴다
 * stack형은 메모리상의 특정 방을 만들어 변수에 대한 값을 저장해놓는 형식
 * heap형은 메모리상의 주소와 변수 값을 대입시켜 각 변수에 대응하는 주소값에 방을 만드는 방식이다.
 * heap형 메모리의 변수에 관련된 주소는 System.out.println.(score); 과 같은 방식으로 확인할 수 있다.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[]=new int[5];
		
		for (int i = 0; i < score.length; i++) {
			score[i] = i*10;
		}
		
		System.out.println(score);
		System.out.println(Arrays.toString(score));
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		System.out.println();
		
		//향상된 for문
		for(int i:score) {
			System.out.println(i);
		}
		
		
		int iArr2[] = new int[10];
		//1~10의 임의의 숫자를 생성해서 배열에 저장
		
		
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(iArr2));
		
		char 아무거나[]= {'a', 'b', 'c', 'd', 'e'};
		System.out.println(아무거나);
		
		String 아무거[]= {"갤럭시","아이폰"};
		System.out.println(아무거);
		
		
		
	}

}
