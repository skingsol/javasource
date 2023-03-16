package inheritance;
/*
 *  오버로딩 : 하나의 클래스에 동일한 이름의 생성자or메소드를 작성하는 것
 *  - 메소드 오버로딩, 생성자 오버로딩
 *  오버라이딩 : (상속에서만 사용가능) 부모가 가지고 있는 메소드와 동일한 시그니처(리턴타입,메소드명,매개변수)를 자식이 가지고 있는 것
 *  - 부모가 제공해주는 기능 + 확장의 개념 / 아니면 새로운 기능 정의(목적은 같다)
 */

public class SubListString extends ListString {
    String name = "성춘향";
    
    @Override
    public void list() {
    	System.out.println(name + " 하위 클래스 이름");
    }
    
    public void writer() {
    	System.out.println("하위 클래스 name 값 "+this.name);
    	System.out.println("상위 클래스 name 값 "+super.name);
    	//list() 호출 - SubListString, ListString
    	list(); // =this.list();
    	super.list();
    }
    
    
    
}
