package ch1;

public class VaribleEx8 {
	public static void main(String[] args) {
		
		int i =912346567;
		float f= (float)i; //같은 4byte여도 실수형(float)이 정수형(int)보다 더 많이 담을 수 있다.
		int i2=(int)f; //큰 타입을 작은 타입에 담을 대는 오류가 난다.=>변경 타입을 앞에 꼭 써야 한다.(casting)
		
		System.out.printf("i=%d\n",i);
		System.out.printf("f=%f i2=%d\n",f,i2);
		
		//자돟형변환: 변경 타입 생략 가능
		//byte=>int
		byte byteValue=10; 
		int intVal=byteValue; 
		System.out.printf("intVal=%d\n",intVal);
		//char=>int
		char charVal='a';
		intVal=charVal;
		System.out.printf("intVal=%d\n", intVal);
		System.out.printf("charVal=%c\n", charVal);
		
		//타입이 서로 다른 것을 연산하려면 더 큰 것으로...
		double d=5.5;
		double result=intVal+d;
		System.out.printf("result=%f\n",result);
		
		System.out.println("abc\tdef"); //\n:엔터 \t:탭
		System.out.println("abc\\def");
		System.out.println("c:\\");
	}
}
