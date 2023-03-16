package ch6;
/*
 * 메소드 작성
 * 특정 작업을 수행하는 일련의 문장들을 하나로 묶어 놓은 것
 * 수학의 함수와 유사
 * 리턴(반환)타입 메소드명(){}을 가지고 있어야 한다
 * 리턴(반환)타입 메소드명(타입 변수명,.....){} 이런 형식이다
 * void(리턴타입),power(메소드명)이런 형식이다
 * void, 앞에서 사용했던 변수 타입 다 가능, 배열 가능,
 */
public class Tv2 {
    // 속성(property) ==> 멤버변수 로 표현
	// 크기, 길이, 높이, 색상, 볼륨, 채널.......
	String color; //색상을 저장하기 위한것
	int channel;  //채널을 저장하기 위한것
	boolean power;  //전원상태를 저장하기 위한것
	
	// 기능(function) ==> 메서드 라고 함
	// 켜기, 끄기, 볼륨업, 볼륨다운, 채널변경......
	// void : 메소드 실행이 끝난 후에 그냥 돌아감(리턴값이 없다는) 의미
	// 아래↓와 같은 형태를 메소드라고 함
	void power() {
		power = !power;
	}
	
	//채널을 하나 증가하고 현재 채널을 리턴
	// int : 메소드가 싱행이 끝난 후 int 값을 가지고 돌아간다는 의미
	int channelUp() {
		channel++;
		return channel;
	}
	
    void channelDown() {
		channel--;
	}
	
	
	
	
	
	
	
	
}
