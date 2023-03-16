
package ch3;
import java.util.Scanner;
public class IfEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적 90이상일때 A, 성적이 80이상일때 B, 70 C ...
//		if (조건1) {
//			//조건1 true 일때
//		}else if(조건2){
//			//조건2 true 일때
//		}else if(조건3) {
//			//조건3 true 일때
//		}

		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력");
		int 점수=Integer.parseInt(sc.nextLine());

		if(점수>=90) {System.out.println("A");}
	
		else if(점수>=80) {System.out.println("B");}
		else if(점수>=70) {System.out.println("C");}
		else if(점수>=60) {System.out.println("D");}
		else if(점수>=50) {System.out.println("E");}
		else {System.out.println("F");} 
		
	}

	
}
