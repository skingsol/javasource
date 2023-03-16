package lang;

/* 타입
 * 1번 기본형 : byte,short,int,long,float,double,boolean,char
 * 2번 참조형 : 배열, 클래스, 인터페이스
 */

public class WrapperEx1 {
	public static void main(String[] args) {
		//정수형을 다룰 때
		// 1번 기본형
		int a= 3;
		char ch = 'a';
		byte b = 4;
		float f = 4.15f;
		double d = 4.5;
		boolean b3 = false;
		long l = 123L;
		
		// 2번 참조형 : 클래스(인터페이스) 만들어져 있다 (메소드를 사용할 수 있다)
		Integer i = new Integer(3); //version 9 부터 이런 방식이 사라짐 아래와 같이 사용하면 됌
		Integer i2 = 3;
		Integer i3 = 3;
		Character ch2 = 'a';
		Byte b2 = 4;
		Float f2 = 4.15f;
		Double d2 = 4.5;
		Boolean b4 = false;
		Long l2=123l;
		
		System.out.println(i2.equals(i3));
		System.out.println(i2 == i3);
		
		System.out.println("문자형태의 숫자를 정수로 Inter.parseInt()"+Integer.parseInt("10"));
		System.out.println("문자형태의 숫자를 정수로 Double.parseInt()"+Double.parseDouble("10"));
//		Float.parseFloat(""); Boolean.parseBoolean("true"); Long.parseLong("10");
	}

}
