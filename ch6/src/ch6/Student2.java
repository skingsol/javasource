package ch6;

public class Student2 {
	String name; //학생이름 name ex)홍길동
	int ban;
	int no;
	int kor;     //국어점수 kor ex)78
	int eng;     //영어점수 eng ex)65
	int math;    //수학점수 math ex)65
	
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		//점수 총계
		return this.kor+this.eng+this.math;
	}
	double getaAverage(){
		//평균
		return getTotal() / 3.0;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

//	@Override
//	public String toString() {
//		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
//				+ math + "]";
//	}
	
	
	//국어+영어+수학
//	String info() {
//		int sum = this.kor+this.eng+this.math;  //<==this 를 사용안해도 문제는 없다
//		double avg = (double)sum / 3;
//		
//		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
//		
//	}
	

	
	
	
	
	
	
	
	
	
	
	
}
