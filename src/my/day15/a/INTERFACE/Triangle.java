package my.day15.a.INTERFACE;

public class Triangle implements Figure{
	//Triangle 클래스는 Figure라는 interface를 implements(구현한다)한다는 뜻

	@Override
	public double area(double x, double y) {

		return x*y*0.5;
		
	}
	
	
}
