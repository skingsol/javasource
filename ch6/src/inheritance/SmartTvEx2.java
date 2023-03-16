package inheritance;

public class SmartTvEx2 {
	public static void main(String[] args) {
		//SmartTv2, Tv2, Object 인스턴스가 생성 <= 한줄의 코드로 3개의 객체 모두생성
		SmartTv2 stv = new SmartTv2(false,10);
		
		//상속여부 확인하기
		stv.channel = 10;
		stv.channelUp();
		System.out.println("현재채널 "+stv.channel);
		
		stv.power();
		System.out.println("전원상태 "+stv.power);
		
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");
		
		
		

	}

}
