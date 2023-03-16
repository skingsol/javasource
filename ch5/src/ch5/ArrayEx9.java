package ch5;

public class ArrayEx9 {

	public static void main(String[] args) {
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};

		//과목별 총점
		int KorTotal=0, EngTotal=0, MatTotal=0;
		
		System.out.println("==================================");
		System.out.println("번호 | 국어 | 영어 | 수학 | 총점 | 평균");
		System.out.println("==================================");
		
		
		for (int i = 0; i < score.length; i++) {
			int sum=0; //개인별 총점
			KorTotal+=score[i][0];
			EngTotal+=score[i][1];
			MatTotal+=score[i][2];
			
			//번호
			System.out.printf("%3d",i+1);
			
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];
				
				
				
				//점수
				System.out.printf("%6d",score[i][j]);
			}
			//평균 = sum/3.0
			float avg=sum/(float)score[i].length;
			System.out.printf("%6d %6.1f\n",sum,avg);
			
			
			
		}
		System.out.println("==================================");
		System.out.printf("총점 %5d %5d %5d",KorTotal,EngTotal,MatTotal);
		
	}

}
