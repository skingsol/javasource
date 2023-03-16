package lang;

/* 자바에서 문자열 다루기
 * 1) String
 * 2) StringBuffer : 원본문자열을 직접적으로 변경하는 것이 가능함 / 멀티쓰레드 안전
 * 3) StringBuilder : 원본문자열을 직접적으로 변경하는 것이 가능함 / StringBuffer 똑같은데 멀티쓰레드 부분만 제거된 클래스
 * 
 */

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();     // initial capacity of 16 characters (= 버퍼의 크기가 16이다.)
		StringBuffer sb2=new StringBuffer(100);  // 버퍼의 크기가 100
		StringBuffer sb3=new StringBuffer("Hello");  // 버퍼의 크기는 문자열 길이만큼
		
		// StringBuffer sb4 = "Hello"; (불가능한 코드)
		System.out.println(sb2);
		System.out.println(sb3);
		
		// append() : 원본 문자열 뒤에 추가
//		sb2.append(false);
//		sb2.append("abc");
//		sb2.append('d');
//		=위와 같은식
		sb2.append(false).append("abc").append('d');
		System.out.println(sb2);
		
		// equals() 를 Object 가 넘겨준 상태(주소비교)로 사용		
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println("equals() "+sb3.equals(sb4));  //false로 나옴
		
		// 값비교를 해야 한다면? => String으로 변경
		String str1 = sb3.toString();
		String str2 = sb4.toString();
		System.out.println("String equals() "+str1.equals(str2));
		
		// delete(int start, int end) : 시작위치와 끝위치를 제외한 사이의 문자들을 제거
		StringBuffer sb5 = new StringBuffer("0123456");
		StringBuffer sb6 = sb5.delete(3, 6);
		System.out.println("sb5 "+sb5);
		System.out.println("sb6 "+sb6);
		
		// deleteCharat(int index) : index(순번) 의 위치의 문자를 제거 //index는 0부터 시작함
		sb5 = new StringBuffer("0123456");
		sb6 = sb5.deleteCharAt(4);
		System.out.println("sb5 "+sb5);
		System.out.println("sb6 "+sb6);
		
		// insert(int offset, 삽입할 값) : offset의 위치에 값을 삽입
		sb5.insert(4, "-");
		System.out.println(sb5);
		
		// replace()
		sb5 = new StringBuffer("0123456");
		sb5.replace(3, 6, "abc");
		System.out.println("replace() "+sb5);
		
		
		str2 = "0123456789";
		// 출력 9876543210
		for (int j = str2.length()-1; j >= 0; j--) {
			System.out.print(str2.charAt(j));
		}
		 //reverse() : 거꾸로 나열
		System.out.println();
		sb5 = new StringBuffer(str2);
		System.out.println(sb5.reverse());
		
		// setCharAt()
		sb5 = new StringBuffer("0123456");
		sb5.setCharAt(4, 'A');
		System.out.println("setCharAt() "+sb5);
		
		
		
	}
}
