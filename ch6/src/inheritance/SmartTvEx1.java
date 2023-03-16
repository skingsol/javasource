package inheritance;

public class SmartTvEx1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
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
