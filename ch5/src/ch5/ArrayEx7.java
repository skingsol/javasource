package ch5;

/* 참조타입에서 특정한 값이 할당되지 않은 상태 : null
 * 
 * String : char 배열에 기능을 추가한 개념
 * 
 * 
 */

public class ArrayEx7 {

	public static void main(String[] args) {
		
		
		System.out.println(args[0]);
		
		//int numArr[] = new int[3];
		String name[] = new String[3];
		
		//String이란 = Class, 참조타입
		
//		System.out.println(name[0]); //null : 아직 어떠한 값도 할당 안됨 (참조타입이므로 주소만 할당되고 주소에 대한 값은 입력되지 않음)
		
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
		//초기화
		name[0]="Kim";
		name[1]="Park";
		name[2]="Yi";
		
		System.out.println(name[0]);
		System.out.println(name[0].charAt(1));
		
		
		String str = "ABCDE";
		
		System.out.println(str.charAt(3)); // ABCDE 중 0번째는 A, 3번째는 D
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(0));
		
		//*문자열(String) 비교 ==(!=) 을 사용하지 않음*
		//equals() (대소문자 포함 비교), equalsIgnoreCase() (대소문자 구분x) 사용
		System.out.println(str.equals("abcde"));
		System.out.println(str.equalsIgnoreCase("abcde"));
		
		System.out.println(str.equals("abcde")?"일치함":"일치하지 않음");
		
		if(str.equals("abcde")) {
			System.out.println("일치함");
		}else {
			System.out.println("일치하지 않음");
		}
		
		}
	
		
	}


