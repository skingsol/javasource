package ch6;

public class MymathEx {

	public static void main(String[] args) {
		
		//Math.random();   <== 이것도 static 메소드이다
		
		//static 메소드 호출
		//클래스명.메소드명()
		System.out.println(Mymath.add(200L, 300L));
		System.out.println(Mymath.subtrat(200L, 300L));
		System.out.println(Mymath.multiply(200L, 300L));
		System.out.println(Mymath.divide(1000L, 300L));
        
		
		//인스턴스 메소드 호출
		Mymath math = new Mymath();
		math.a = 200L;
		math.b = 100L;
		System.out.println(math.add());
		System.out.println(math.subtrat());
		System.out.println(math.multiply());
		System.out.println(math.divide());
	}

	
	
	
	
	
	
}
