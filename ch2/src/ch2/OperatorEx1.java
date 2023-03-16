package ch2;

/* 연산자
* 1) 단항연산자
* 	+, -, ++, -- ~ !
* i = i+2; 를 간략히 쓰면 i+=2 이렇게 표현 가능
* 2) 이항연산자
* 	산술 : +, -, *, /, %, <<, >>, >>>
* 	비교 : >, <, >=, <=, ==(값이 같다면), !=(값이 같지 않다면)
* 	논리 : &&(and), ||(or), ^(xor), &(and), |(or)
* 3) 삼항연산자 : ? :
* 4) 대입연산자 : =	ex) a=4;
* 
* 
* 연산자 우선순위
* 5 + (3 * 4)
*/

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ++, -- : 전위, 후위에 위치
		// 전위 : 값이 참조되기 전에 증가시킴 j = ++i;
		// 후위 : 값이 참조된 후 증가시킴 j= i++;
//		int i=5;
//		i++; // i=i+1
//		System.out.printIn(i);
//		
//		i=5;
//		++i;
//		System.out.printIn(i);
		
		
		int i=5, j=0;
		j=i++; // ㄱ. j=i, ㄴ. i=i+1
		System.out.println("j=i++실행후 i="+ i + "j = "+j);
		
		
		i=5;
		j=0;
		j=++i; // ㄱ. j=i, ㄴ. i=i+1
		System.out.println("j=++i실행후 i="+ i + "j = "+j);
		
		// 1: true ==.false, false==>true
		// 피연산자가 boolean 값을 가질때만 사용
		//!true, !false, !3x
		boolean play=true;
		System.out.println("play="+play);
		System.out.println("!play="+!play);
		
				
	}

}
