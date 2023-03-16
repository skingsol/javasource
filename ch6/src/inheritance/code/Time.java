package inheritance.code;
// 접근제어자를 사용하는 이유 ==> 캡슐화
// 외부로부터 데이터를 보호하기 위해서
// 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    // set메서드 : 매개변수에 지정된 값을 검사하여 조건에 맞을 때만
    //           멤버변수의 값을 변경함
    
    public void setHour(int hour) {
        if(hour < 0 || hour > 23) return;
        // 0 ~ 23일때만 실행
		this.hour = hour;
	}
    // get 메소드 : 멤버변수의 값을 읽는 목적
    public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		//0~59
		if(hour < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		//0~59
		if(hour < 0 || second > 59) return;
		this.second = second;
	}
    
    
    
    
    
}
