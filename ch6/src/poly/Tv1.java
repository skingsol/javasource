package poly;

public class Tv1 extends Product {
    public Tv1() {
    	super(100); //부모의 매개 변수를 받는 생성자를 호출
    }
    
    @Override //주소를 안나오게 오버라이드 사용
    public String toString() {
    	return "Tv";
    }
}
