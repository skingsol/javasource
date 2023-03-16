package ch6;
/*
 * 인스턴스 메소드 : 인스턴스(객체)를 생성하고 사용해야 한다
 * 클래스(static) 메소드 : 인스턴스(객체)를 생성하지 않고도 바로 사용이 가능하다
 *                    클래스명.메소드명() 예) tv.color();
 */
public class Mymath {
	// 멤버변수(인스턴스변수)
    long a, b;     ///////////////////////////////////////////////////////////////////////
    
    long add() {
    	return a + b;
    }
    long subtrat() {
    	return a - b;
    }
    long multiply() {
    	return a * b;
    }
    double divide() {
    	return a / b;
    }
    //////////////////////////////////↑인스턴스 변수를 사용한 사칙연산//////////////////////////////
    
    //↓ 기본형 매개변수(지역변수)를 이용한 사칙연산////////////////////////////////////////////////////
//    static long add2() {
//    	//static 메소드안에서는 인스턴스 변수를 바로 사용할 수 없음
//    	return a + b;
//    }
    
    static long add(long a, long b) {
    	return a + b;
    }
    
    static long subtrat(long a, long b) {
    	return a - b;
    }
    static long multiply(long a, long b) {
    	return a * b;
    }
    static double divide(long a, long b) {
    	return a / (double)b;
    }
    
    
    
}
