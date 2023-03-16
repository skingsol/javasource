package abstr;

public abstract class Car {
	// 추상메소드는 구현부{}가 없다
    public abstract void drive();
    public abstract void stop();
	
    public void startCar() {
    	System.out.println("시동을 켭니다.");
    }
    public void stopCar() {
    	System.out.println("시동을 끕니다.");
    }
    
    //메소드 앞에 final 붙으면 오버라이딩 금지
    final public void run() {
    	startCar();
    	drive();
    	stop();
    	stopCar();
    }
}
