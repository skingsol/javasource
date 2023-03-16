package ch3;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// switch : if~else if~ else 대신 사용
		// switch의 case 안에는 블럭을 쓸 수 없음
//		switch (key) {
//		case value:
//			break;
//		case value:
//			break;
//		case value:
//			break;
//		default:
//			break;
//		}
		
//		if(점수>=90) {System.out.println("A");}
//		
//		else if(점수>=80) {System.out.println("B");}
//		else if(점수>=70) {System.out.println("C");}
//		else if(점수>=60) {System.out.println("D");}
//		else if(점수>=50) {System.out.println("E");}
//		else {System.out.println("F");} 
//		
//		switch (점수) {
//		case 90: //점수==90
//		case 91: //점수==90
//		case 92: //점수==90
//		case 93: //점수==90
//	
//		default:
//			break;
//		}
		
		int month=6;
		
//		switch (month) {
//		case 3: //month==3
//		case 4:
//		case 5:
//			System.out.println("현재 계절은 봄");
//			break; // 브레이크를 만나면 브레이크가 속해있는 블럭을 빠져나가게 한다
//		case 6: case 7: case 8:
//			System.out.println("현재 계절은 여름");
//			break;
//		case 9: case 10: case 11:
//			System.out.println("현재 계절은 가을");
//			break;
//		case 12: case 1: case 2:
//			System.out.println("현재 계절은 겨울");
//			break;
//
//		}
		
//		if (month==3||month==4||month==5) {System.out.println("현재 계절은 봄");
//		
//		}else if(month==6||month==7||month==8) {System.out.println("현재 계절은 여름");
//		
//		}else if(month==9||month==10||month==11) {System.out.println("현재 계절은 가을");
//		
//		}else if(month==12||month==1||month==2) {System.out.println("현재 계절은 겨울");
//		
//		}
		
		if (month==12 || month<=2) {System.out.println("현재 계절은 겨울");
		
		}else if(month>=9) {System.out.println("현재 계절은 가을");
		
		}else if(month>=6) {System.out.println("현재 계절은 여름");
		
		}else if(month>=3) {System.out.println("현재 계절은 봄");
		
		}
	}

}
