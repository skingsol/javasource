package ch6;

public class TvEx1 {

	public static void main(String[] args) {
//		//클래스로 부터 객체를 만드는 과정을 "인스턴스화" 한다고 한다
//		//Tv 객체 생성
//		Tv tv = new Tv(); //클래스 이름이 객체를 생성할 것 앞으로 온다.
//		                  //클래스 이름 변수명= new 클래스 이름(); 이런 형식으로 된다는 것이다.
		//객체 선언
		Tv tv;             
		//객체 생성
		tv = new Tv();
		
		//객체가 가지고 있는 속성, 메소드를 사용하기 위해서는 .(dot)로 접근
		print(tv);  //주소
		
		//멤버변수 초기화하기
		tv.color = "black";
		tv.channel = 6;
		tv.power =true;
		
		//초기화 후 확인
		print(tv);
		
		//메소드를 호출 하기 ==> 메소드가 실행된다
		tv.channelUp();                           //<==호출식
		System.out.println("채널 "+tv.channel);    //<==프린트식(메소드가 호출되어 실행됬는지 확인해보기)
		tv.power();
		System.out.println("전원여부 "+tv.power);
		
		System.out.println();
		
		//두번째 티비 만들기
		Tv tv2 = new Tv();
		tv2.color="white";
		tv2.channel=11;
		
		//tv켜기, tv끄기
		tv2.power();     //<==파워 메서드를 호출하여 티비전원 켜기
		print(tv2);

		
	}
    static void print(Tv tv){
    	System.out.println("색상 "+tv.color);
		System.out.println("채널 "+tv.channel);
		System.out.println("전원여부 "+tv.power);	
    }
    
    
    
    
}
