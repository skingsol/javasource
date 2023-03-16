package ch4;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		
		
		
		// 1~10까지 곱셈 결과 출력
		
		System.out.println();
		int mult=1;
		int m=1;
		while (m <= 10) { 
			mult*=m;  m++;
		}
		System.out.println("1~10의 곱 : "+mult);
		
		System.out.println();
		int sum=0, i = 1;
		while (i <= 10) {
			sum=sum+i; i++;
		}
		System.out.println("1~10의 합 : "+sum);
			
		}
		
	}





