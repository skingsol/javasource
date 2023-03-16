package ch6;

public class StudentEx {

	public static void main(String[] args) {
		Student stu = new Student("홍길동",1,1,100,60,76);
	
		String msg = stu.info();  //<== info를 실행했을때 String값을 리턴해달라는 뜻(변수명은 중요하지않음msg)
		System.out.println(msg);
		//msg 출력시
		//홍길동,1,1,100,50,76,점수합계,평균
		System.out.println(stu);

//		
//		student2 객체 생성
//				Student2 stu2 = new Student2("성춘향", 80, 80, 76);
//				System.out.println("이름 : "+stu2.name);
//				System.out.println("총점 : "+stu2.getTotal());
//				System.out.println("평균 : "+stu2.getaAverage());
//				stu2.getTotal();
//				stu2.getaAverage();
//				//이름 : 성춘향
//				//총점 : 236
//				//평균 : 78.1223
//				System.out.println(stu2); //ch6.Student2@5aaa6d82
	}

}
