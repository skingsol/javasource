package inter;

public class FighterEx {

	public static void main(String[] args) {
		//인터페이스는 인스턴스 생성 불가
		//인터페이스를 구현하는 클래스가 존재해야 의가 있다
		//Attackable attackable = new Attackable(); 는 (X)불가능
		
		//다형성
		Fightable fightable = new Fighter(); // 는 가능

	}

}
