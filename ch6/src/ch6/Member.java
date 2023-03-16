package ch6;

public class Member {
    String useid;            //아이디 useid ex)hong123
	String password;         //비밀번호 password ex)hong123@!
	String confirmPassword;  //비밀번호확인 confirmPassword ex)hong123@!
	String hp;                  //전화번호 hp ex)01012341234
	String address;          //주소 address ex)서울
	
	public Member(String useid, String password, String confirmPassword, String hp) {
		super();
		this.useid = useid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
	}

	public Member(String useid, String password, String confirmPassword, String hp, String address) {
		super();
		this.useid = useid;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.hp = hp;
		this.address = address;
	}

	boolean passwordAandConfirmPasswordEquals(){
		//문자열 비교 == 사용 하면 안됨
		//equals()
		return password.equals(confirmPassword);
	}
	
	
	
	
}
