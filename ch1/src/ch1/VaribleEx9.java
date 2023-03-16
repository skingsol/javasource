package ch1;

public class VaribleEx9 {
	public static void main(String[] args) {
		int i=4; //i의 유효범위는?? 메인 메소드 안에서만 사용 가능: 지역변수
		
		{
			int j=5; //j의 유효범위는??
			System.out.println(j);
		}
//		System.out.println(j); //j는 유효범위 벗어남
		System.out.println(i); 
	}
}
