package inheritance.code;

import modifier.Account;

public class Modifier1 {
	// 참조타입은 기본값이 null로 셋팅됨
	// = String str = new string("Hello"); 아래와같음
//	String str = "Hello";
	
    Account acc = new Account();
    
    int age; // 기본타입은 정수형 0 으로, 실수형일때는 0.0으로, boolena 일때는 false으로 셋팅됨
    
    private void print() {
    	
    	//Accont가 가지고 있는 aon 접근하고 싶다면?
    	String ano = acc.getAno();
    	System.out.println("ano : "+ano);
    	
    	acc.setAno("111-22");
    	System.out.println("ano : "+acc.getAno());
    	
    }
    public static void main(String[] args) {
    	// static 메소드에서 non-static 메소드 호출하기
    	// 1. 같은 static 으로 만들기
    	// 2. 객체 생성 후 접근하기
    	Modifier1 modifer1 = new Modifier1();
    	modifer1.print();
    	
	}    
}
