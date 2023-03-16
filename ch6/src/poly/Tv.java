package poly;

// 다형성(polymorphism) : 여러가지 형태를 가질 수 있는 능력 (상속일때만 가능)
//                      상속일때만 가능
//                      하나의 참조 변수로 여러 타입의 객체를 참조할 수 있는 것 
//                      조상 타입의 참조변수로 자손 타입의 객체를 다룰 수 있는 것
public class Tv {
    // 속성(property) ==> 멤버변수 로 표현
	// 크기, 길이, 높이, 색상, 볼륨, 채널.......
	String color; //색상을 저장하기 위한것
	int channel;  //채널을 저장하기 위한것
	boolean power;  //전원상태를 저장하기 위한것
	
	// 기능(function) ==> 메서드 라고 함
	// 켜기, 끄기, 볼륨업, 볼륨다운, 채널변경......
	// 아래↓와 같은 형태를 메소드라고 함
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
    void channelDown() {
		channel--;
	}
	
	
	
	
	
	
	
	
}
