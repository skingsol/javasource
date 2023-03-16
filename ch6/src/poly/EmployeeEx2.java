package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		workPrint(employee);
		
		
		// 메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행된다
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("Ceo");
		workPrint(employee2);
		
		AdminStrator employee3 = new AdminStrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workPrint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workPrint(employee4);

	}
	//자식끼리 형재,자매라는 개념이 없고 남남이기 때문에 변수타입을 부모타입으로 받아야 자식끼리의 메소드가 오류나지 않는다.
//	Employee employee = new Employee2
//	Employee employee = new Employee3
	static void workPrint(Employee employee) {
		employee.work();
	}

}
