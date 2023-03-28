package shop2;
//상수만 가능, 모든메서드는 추상이다
public interface IShop {
	//pulic static abstract 자동으로 앞에 붙는다.
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();
}
