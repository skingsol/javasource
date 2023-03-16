package lang;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}
	
	//Object의 equals()비교가 주소를 비교함
	//eauals()를 그대로 쓰면서 값비교로 바꾸고 싶은 상황 => 오버라이드
	@Override
	public boolean equals(Object obj) {
	//instanceof : 특정객체의 인스턴스인지 확인하는 용도
		// obj가 Value 객체의 인스턴스냐?
		if(obj instanceof Value) {
			Value v = (Value) obj;
			
			if(this.value == v.value) {
				return true;
			}
		}
		
		return false;
	}

	
	//toString() : Object 는 패키지명.클래스명@hasCode값 으로 보통 나오는데
	//자손에서의 toString() : 인스턴스에 대한 정보를 문자열로 제공하는 목적으로 사용
	
@Override
public String toString() {
	return "Value [value=" + value + "]";
	
}
	
}
