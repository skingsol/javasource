package collection;

import java.util.Arrays;

/*
 * Arrays 클래스
 *  - 배열을 다루는 데 유용한 메서드가 정의되어 있음
 *  - 모든 메서드는 static 임
 */

public class ArraysEx1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		// toString :  배열의 요소를 문자열로 출력
		System.out.println(arr); //주소나옴
		System.out.println(Arrays.toString(arr)); //값이나옴
		
		int arr2[][] = {{11,12},{21,22}};
		System.out.println(arr2); //주소나옴
		System.out.println(Arrays.toString(arr2));  //주소나옴
		
		// deepToString : 2차원 배열의 요소를 문자열로 출력
		System.out.println(Arrays.deepToString(arr2)); //값이나옴
		
		// equals() : 값 비교(두 배열에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false)
		String[] str1 = {"aaa","bbb"};
		String[] str2 = {"AAA","BBB"};
		System.out.println(Arrays.equals(str1, str2));
		
		// deepEquals() : 2차원 배열 값 비교
		String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2D, str2D2));
		
		int arr3[]=new int[5];
		// arr 배열을 arr3 복사
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[i];
		}
		System.out.println(Arrays.toString(arr3));
		
		// copyOf(원본배열, 복사할 개수), copyOfRange()
		int arr4[]= Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr4));
		
		int arr5[]= Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arr5));
		
		// copyOfRange(원본배열, 복사할 시작점, 복사할 끝위치) 끝위치의 값은 포함하지 않음
		int arr6[]= Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr6));
		
		
	}
}
