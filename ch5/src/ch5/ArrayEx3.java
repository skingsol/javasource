package ch5;

import java.util.Arrays;

public class ArrayEx3 {

	public static void main(String[] args) {
	
		//대괄호[]가 하나 있으면 1차원 배열
		//대괄호[]가 두개 있으면 2차원 배열 (행,열)
		
		int[] score= {100,88,100,100,90}; // 대괄호의 위치는 int 뒤에 와도, score 뒤에 와도 상관없다
		
		//배열 총합과 평균
		
		int sum=0;
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
			
			// 478/5 = 95
			// 478/5.0 = 95.6
			//(float)를 넣는 이유
			average=sum/(float)score.length;
		}
		System.out.println("총합 : " +sum);
		System.out.println("평균 : " +average);
		
		
		
		
		
		
		
	}

}
