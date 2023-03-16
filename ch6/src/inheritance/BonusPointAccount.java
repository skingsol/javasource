package inheritance;

public class BonusPointAccount extends Account{
	//은행 + 보너스 포인트
	//보너스 포인트 = 예금액 * 1%
	private int bonusPoint;

	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		
	}
	
	//예금기능,
	//보너스 포인트 += 예금액 * 1%
	@Override
	public void deposit(int amount) {
		//예금하기기능 부모꺼에서 가져온 것
		super.deposit(amount);
		//보너스 포인트 += 예금액 * 1%
		bonusPoint += amount * 0.01;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
}
