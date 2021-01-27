package my.day15.a.INTERFACE;

public class Circle implements Figure{

	@Override
	public double area(double x, double y) {
		return 0;
	}
	//이 클래스에서 area 메소드를 사용하지 않아도 메소드는 있어야한다 실행부분은 없어도
	

	@Override
	public double circleArea(double r) {

		return 3.14592*r*r;
	}

}
