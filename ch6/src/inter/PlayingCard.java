package inter;

public interface PlayingCard {
	public static final int SPADE = 4;
	final int DIAMOND = 3;  // = public static final int DIAMOND =3;
	static int HEART = 2;  // = public static final int HEART =2;
	int CLOVER = 2;       // = public static final int CLOVER =1;  같은 뜻이다. 생략가능함을 보여줌
	
	public abstract String getcardNumber();
	String getCardKind(); // = public abstract String getCardKind();
	

}
