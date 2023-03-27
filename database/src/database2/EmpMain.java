package database2;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpMain {

	public static void main(String[] args) {
		EmpDAO empDAO = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while (flag) {
			System.out.println("--------------------------");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 삭제");
			System.out.println("3. 사원 급여 수정");
			System.out.println("4. 사원 조회(사번)");
			System.out.println("5. 사원 조회(이름)");
			System.out.println("6. 종료");
			System.out.println("--------------------------");
			
			// 메뉴번호 입력받기
			System.out.print("메뉴번호 입력 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			// switch 작성
			switch (menu) {
			case 1:
				EmpDTO empDTO = new EmpDTO();
				System.out.println("추가할 사원정보 입력");
				System.out.print("사원번호 입력 >>");
				empDTO.setEmpno(Integer.parseInt(sc.nextLine()));
				System.out.print("사원명 입력 >>");
				empDTO.setEname(sc.nextLine());
				System.out.print("직무 입력 >>");
				empDTO.setJob(sc.nextLine());
				System.out.print("매니저번호 입력 >>");
				empDTO.setMgr(Integer.parseInt(sc.nextLine()));
				System.out.print("급여 입력 >>");
				empDTO.setSal(Integer.parseInt(sc.nextLine()));
				System.out.print("추가수당 입력 >>");
				empDTO.setComm(Integer.parseInt(sc.nextLine()));
				System.out.print("부서번호 입력 >>");
				empDTO.setDeptno(Integer.parseInt(sc.nextLine()));
				
				System.out.println(empDAO.insert(empDTO)?"사원 정보 추가 성공":"사원정보 추가 실패");
				
				break;
			case 2:
				//삭제할 empno 입력받기
				System.out.println("삭제할 사원번호 입력");
				System.out.print("사원번호 >> ");
				int empno = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.remove(empno)?"사원 번호 삭제 성공":"사원번호 삭제 실패");
				
				break;
			case 3:
				//empno, sal 입력받기
				System.out.println("수정할 정보 입력");
				System.out.print("사원번호 >> ");
				empno = Integer.parseInt(sc.nextLine());
				
				System.out.print("수정급여 >> ");
				int sal = Integer.parseInt(sc.nextLine());
				System.out.println(empDAO.update(sal, empno)?"급여 변경 성공":"급여 변경 실패");
				
				break;
			case 4:
				System.out.print("사원 번호 입력 >> ");
				empno = Integer.parseInt(sc.nextLine());
				
				// EmpDTO 가 null 상태일 수 있음
				EmpDTO dto = empDAO.getRow(empno);
				//출력
				if(dto!=null) {
				System.out.println("\n*** 사원정보 조회 ***");
				System.out.println("사원번호 : "+dto.getEmpno());
				System.out.println("사원명 : "+dto.getEname());
				System.out.println("직무 : "+dto.getJob());
				System.out.println("급여 : "+dto.getSal());
				System.out.println("추가수당 : "+dto.getComm());
				System.out.println("부서번호 : "+dto.getDeptno());
				System.out.println();
				}else {
					System.out.println("사원번호를 확인해 주세요");
				}
				
				break;
			case 5:
				//이름 받기
				System.out.print("사원 이름 입력 >> ");
				String ename = sc.nextLine();
				
				// ArrayList<EmpDTO>가 빈 상태 or 데이터가 담겨있는 상태
				ArrayList<EmpDTO> list = empDAO.getList(ename);
				
				//empno, ename, job, hiredate
				System.out.println();
				if(list.isEmpty()) {
					System.out.println("조회 사원이 없습니다.");
				}else {
					System.out.println("사번\t사원명\t직무\t입사일");
					System.out.println("--------------------------");
					for (EmpDTO empDTO1 : list) {
						System.out.print(empDTO1.getEmpno()+"\t");
						System.out.print(empDTO1.getEname()+"\t");
						System.out.print(empDTO1.getJob()+"\t");
						System.out.print(empDTO1.getHiredate()+"\n\n");
				}
			}
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("번호를 다시 입력해 주세요");
				break;
			}
		}

	}

}
