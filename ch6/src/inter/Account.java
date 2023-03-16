package inter;
/* 인터페이스
 * 추상화 클래스
 * 추상 클래스보다 추상화 정도가 높음 => 일반메서드, 멤버변수 가질 수 없음
 * 기본 설계도
 * 인터페이스에 오는 변수는 final에서 와야 한다.
 */
public interface Account {
	int x=0, y=0;  //모든 멤버변수는 무조건 public static final (생략가능) 이다
//	void stop() {}  //오류 
    
	//모든 메서드는 public abstract(생략가능)이다  
	void stop();
	
	//단, static 메서드와 디폴트 메서드는 사용 가능(jdk8버전부터 가능)
	static void print() {}
	default void add() {}


}
