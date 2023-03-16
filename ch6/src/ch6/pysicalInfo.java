package ch6;

public class pysicalInfo {
    //생성자 오버로딩
	//오버로딩 : 한 클래스에 동일한 이름의 메소드, 생성자가 존재하는것을 말함
	
	String name;
	int age;
	float height;
	float weight;
	
	//////////////////////////////생성자 오버로딩///////////////////////////////////
	//생성자 이름은 같아야함
	//매개변수의 개수 또는 타입이 달라야 함
	
	public pysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public pysicalInfo(String name, int age, float height, float weight) {
//		super();
		
//		this.name = name;
//		this.age = age;
		this(name,age);      // <== 생성자에서 다른 생성자 호출할때 이런식으로 사용
		this.height = height;
		this.weight = weight;
//		this(height,weight);  // <== 가장첫줄에서만 가능하기 때문에 현재는 불가능하다
	}
	
	public pysicalInfo(int age, String name, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public pysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	///////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
}
