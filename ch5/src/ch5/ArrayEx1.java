package ch5;

public class ArrayEx1 {
/*배열 (array)
 *같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
 * int score1=98, score2=88,.....;
 * 
 * ==> int score[];  // 배열 선언
 * ==> score = new int[30]; // 배열 생성
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//연속된 공간에 int 값을 저장할 수 있는 30개의 공간 생성
		//index 를 이용해서 접근을 할 수 있음
		//int 타입은 0으로 초기화 됨(기본값이 0)
		int score[]=new int[30];
		
		System.out.println(score[0]); //0~29 인텍스로 접근
		System.out.println(score[15]);
		
		//새로운 값을 할당
		score[0]=98;
		score[1]=88;
		
		//배열 선언,생성,초기화
		//10명에 대한 점수를 배열로 다루기
		int score2[]= {98,88,78,68,50,65,45,60,55};
		
		System.out.println("5번째 학생 점수"+score2[4]);
		
		double score3[]= {98.54,88.354,78.54,68.684532,50.121,65,45.5213,60.1,55.32,65.3};
		
//		System.out.println("1번째 학생 점수"+score3[0]);
//		System.out.println("2번째 학생 점수"+score3[1]);
//		System.out.println("3번째 학생 점수"+score3[2]);
//		System.out.println("4번째 학생 점수"+score3[3]);
//		System.out.println("5번째 학생 점수"+score3[4]);
//		System.out.println("6번째 학생 점수"+score3[5]);
//		System.out.println("7번째 학생 점수"+score3[6]);
//		System.out.println("8번째 학생 점수"+score3[7]);
//		System.out.println("9번째 학생 점수"+score3[8]);
//		System.out.println("10번째 학생 점수"+score3[9]);

		System.out.println();
		
		System.out.println(score3.length);
		
		for (int i = 0; i < score3.length; i++) {
			System.out.println
			((i+1)+"번째 학생 점수"+score3[i]);
		}
		
		//char 5개를 담는 배열
		
		char 아무거나[]= {'a', 'b', 'c', 'd', 'e'};
		String 아무거[]= {"갤럭시","아이폰"};
		
		System.out.println(아무거[0]);
		
		//byte, char, short, int, long, float, double, boolean ==> 배열 타입 가능
		String strArr[]= {"abc","efg"};
		
		System.out.println(strArr[1]);
		
		
		
		
	}

}
