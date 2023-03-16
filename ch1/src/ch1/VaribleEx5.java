package ch1;

public class VaribleEx5 {
	public static void main(String[] args) {
		//접미사: L, f, d
		long big=100_000_000_000L;
		float f=0.14159f;
		double d=0.141592d; //d 생략가능
		
		//접두사: 0(8진수), 0x(16진수), 0b(2진수)
		int octNum=010; //8진수 10
		int hexNum=0x10; //16진수 10
		int binNum=0b10; //2진수 10
		System.out.println(octNum);
		System.out.println(hexNum);
		System.out.println(binNum);
		
		int i ='A';
		System.out.println(i);
		
		String name="hong";
		name=name+"77";
		//1.name값 가져오기 2. 문자 77을 연결하기 3. 연결한 값을 name에 담기
		System.out.println(name);
		
		String num=7+7+"7"; //=14+"7"
		System.out.println(num); //147
		
		
		int age=25;
		System.out.println("age="+age);
		System.out.printf("age=%10d\n",age);
		
		char ch1='a';
		String str1="abcd";
		double d1=3.141592;
		System.out.printf("ch1=%10c\n",ch1);
		System.out.printf("str1=%s\n",str1);
		System.out.printf("%-10s\n",str1); //왼쪽 정렬
		System.out.printf("str1=%10s\n",str1); 
		System.out.printf("d1=%10.3f\n",d1); //println은 이런 자릿수 조작같은 거 안됨.
	}
}
