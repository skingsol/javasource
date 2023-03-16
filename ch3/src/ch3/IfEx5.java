package ch3;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 if
//		if(condition) {if(condition) {else {}}}
//		else {if(condition) {}}
		
//점수를 입력받아서 점수가 90이상이면 A 인데, 
//98이상이라면 A+, 94미만이라면 A-
//점수가 80이상이면 B인데,
//88 이상이라면 B+, 84미만 B-
//80 미만이라면 C
		
		Scanner sc = new Scanner(System.in);
		int score = Integer.parseInt(sc.nextLine());
		System.out.println("점수 입력 >>");
		char grade = ' ', opt='0';
		if (score>=90) {	
			grade='A';
			if(score>=98) {
				opt='+';
			}else if(score<94) {
				opt='-';
			}
		}else if(score>=80) {
			grade='B'; 
			if(score>=88) {opt='+';}
			else if(score<84) {opt='-';}
		}else {grade='C';}
		
		System.out.printf("당신의 학점은 %c%c", grade, opt);
	}

}
