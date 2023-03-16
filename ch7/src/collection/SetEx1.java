package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			set.add(String.valueOf(i));
		}
		
		// 중복을 허용하지않음 중복시 자동으로 추가하지 않음
		set.add("9");   // <==중복데이터인 9를 넣어보기  =>결과 : 안넣어짐
		
		System.out.println(set);
		
		//for / while
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
