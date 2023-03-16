package ch6;

public class Square {
    //정사격형 넓이
	int sideLength;
	//속성
	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}
	
	
	//넓이
	int getArea() {
		return sideLength * sideLength;
	}
}
