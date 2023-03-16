package ch3;
import java.util.Scanner;
public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자를 입력해주세요");
			
			int input = Integer.parseInt(sc.nextLine());
			//string result = input%2==0?"짝수":"홀수";
			//System.out.println(result);
			
			//if~else
			String result = " ";
			if(input%2==0) {
				result = "짝수";
			}
			else { result = "홀수";
			}
			//result cannot be resolved to a variable(변수 선언 안했음)
			System.out.println(result);
	}

}
