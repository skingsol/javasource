package ch4;

import java.util.Scanner;

/* 중첩 for
 * for문 안에 for문 포함
 */
public class ForEx4 {

	public static void main(String[] args) {

		// **********
		// **********
		// **********
		// **********
		// **********
		
		// ① 바깥 for int i = 1;
		// ② i < 6;
		// ③ 안쪽 for int j = 0;
		// ④ j < 11;
		// ⑤ 블럭 안으로 진입 System.out.print("*");
		// ⑥ j++
		// ⑦ j < 10;
		// ⑧ true
		// ⑨ ⑥~⑧ 반복
		// ⑩ j가 10이 되면 안쪽 for false가 됨 ==> 안쪽 for 종료
		// ⑪ 바깥 for의 System.out.println(); 실행
		// ⑫ 바깥 for i++
		// ⑬ i < 6;
		// ⑭ true
		// ⑮ ⑫~⑭ 반복
		// i가 6이 되면 for 종료
		
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		// *
		// ***
		// ****
		// *****
		// ******
	
		for (int i = 1; i <= 5; i++) {
			
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		//4x+5y=60 의 모든 해를 구하기
		//단, x,y는 10 이하의 자연수
		//4*1+5*1=60 
		//4*1+5*2=60 
		//4*1+5*3=60 ...
		
		//4*2+5*1=60
		//4*2+5*2=60 ...
		
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				//60이 나오는 x,y 출력
				if(4*i+5*j==60) {System.out.printf("(%d, %d)\n",i,j);}
			}
			
		}

		
		// break;
		// 자신이 포함된 가장 가까운 반복문 벗어나게 됨(주로 if와 같이 사용됨)
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			if(i==5) break;
		}
		
		System.out.println();
		System.out.println();
		//continue
		//반복문 내에서만 사용
		//반복이 진행되는 도중에 continue 문을 만나면 반복문의 끝으로 이동하여 다음
		//반복으로 넘어감
		
		for (int i = 0; i < 10; i++) {
			if(i%3==0) continue;
			System.out.print(i);
		}
		
			
		}
	}



