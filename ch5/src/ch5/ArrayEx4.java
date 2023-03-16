package ch5;

public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열을 이용한 최댓값, 최솟값 구하기
		
		int score[] = {79,88,91,33,100,55,95};
		
		int min = score[0];
		int max = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if(min>score[i]) { min=score[i];
			}
			else if(max<score[i]) { max=score[i];
			
			}
		}
		System.out.println("최소 : "+min);
		System.out.println("최대 : "+max);
		
		System.out.println("최소, 최대의 평균값 : "+(min+max)/2);
		
	}

}
