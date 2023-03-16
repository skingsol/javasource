package ch2;


/* 연산자
* 1) 단항연산자
* 	+, -, ++, -- ~ !
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


public class OperatorEx3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode='A';
		System.out.println(charCode);
		
		if((charCode>=65) && (charCode<=90))
			System.out.println("대문자");
		
		
		int X=15;
		if(X > 10 && X < 20)
			System.out.println("X는 10~20사이에 있음");

	}

}


	
	
	
	
	///논리연산자 : true, false 를 주고 결과도 true, false로 나옴
	// &&(AND 결합) : X는 10보다 크고, 20보다 작다
	// 		         X > 10 && X < 20
	// ||(OR 결합) : I는 2의 배수 또는 3의 배수이다
	//			    I%2==0 || I%3==0
	// I는 2의 배수 또는 3의 배수이지만 6의 배수는 아니다
	// (I%2==0 || I%3==0) && I%6!=0
	
	