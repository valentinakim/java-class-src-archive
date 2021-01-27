package my.day15.a.INTERFACE;

public class MainInterface {

	public static void main(String[] args) {
	
		//final변수 ==> 상수변수 (변수에 값을 한 번 넣으면 바꿀 수 없다)
		
		final double PI = 3.141592;	//원주율
		// PI = 9.0992;  //에러. 위의 final변수가 마지막. 값을 변경할 수 없다. 일반변수와 구분짓기 위해 대분자 표시하낟
		
		System.out.println("반지름이 5인 원의 원둘레 크기 => "+2*PI*5);
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		Triangle tri = new Triangle();
		Rectangle rt = new Rectangle();
		
		System.out.println("밑변 4, 높이 5인 삼각형의 넓이 => "+tri.area(4, 5));
		System.out.println("가로 4, 세로 5인 사각형의 넓이 => "+rt.area(4, 5));
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// == 다형성 (Polymorphism) ==
		//자식클래스로 생성되어진 객체를 부모 클래스의 타입으로 받을 수 있다.
		//특정한 인터페이스로 구현된 클래스의 객체를 특정한 인터페이스로 받을 수 있다 

		Figure fg1 = new Triangle();
		Figure fg2 = new Rectangle();
		Figure fg3 = new Circle();
		
		
		//Figure fgArr = new Figure[3];	//에러. 인터페이스는 클래스가 아니기 때문에 이런 식으로 객체를 생성할 수 없다
		
		System.out.println("밑변 4, 높이 5인 삼각형의 넓이 => "+fg1.area(4, 5));
		System.out.println("가로 4, 세로 5인 사각형의 넓이 => "+fg2.area(4, 5));
		System.out.println("반지름이 4인 원의 넓이 => "+fg3.circleArea(4));
			
		
	
	}//end of main----------------------------
	
}
