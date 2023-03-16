package ch6;
/* 변수와 메서드에 static 이 붙으면 같은 static 끼리는 문제가 없음
 * static 이 붙지 않은 변수나 메서드를 호출하려면 객체생성(인스턴스생성) 후에 가능하다
 * 
 */
public class MemberCall {
    //인스턴스 변수 (객체변수)
	int iv=10;
	//static 변수 (클레스변수)
    static int cv=20;
    
    //인스턴스 변수 = 클래스변수
    int iv2 = cv;
    //클래스변수 = 인스턴스 변수
    //인스턴스 변수의 값을 클래스 변수에 대입 불가
//    static int cv2 = iv;   <==클래스 변수와 인스턴스 변수의 생성시기가 달라서 안된다. new를 이용하여 인스턴스 생성을 해야 가능해짐
    
    static void staticMethod1() {
    	System.out.println(cv);
//    	System.out.println(iv); ==> new 이후에만 가능
//    	instanceMethod1();
    }
    
    void instanceMethod1() {
    	System.out.println(cv);
    	//iv와 instanceMethod1()은 생성되는 시기가 같아서 가능함
    	System.out.println(iv);
    }
    
    
    
    
    
}
