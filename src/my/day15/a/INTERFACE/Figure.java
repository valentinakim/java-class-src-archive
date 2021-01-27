package my.day15.a.INTERFACE;

public interface Figure {

	// === 인터페이스(interface)란? === //
	// 오로지 미완성메소드(추상메소드)와 field는 final변수로만 이루어진 것을 말한다.
	// 그리고 미완성메소드(추상메소드)와 field의 접근제한자는 public 으로만 되어진다.
	// 미완성메소드(추상메소드) 생성시 !public abstract! 이 생략되어져 있다.
	// field 생성시 public final 이 생략되어져 있다.
	
	//field ==> public final이 생략이 되어져 있다
	
	/*public final*/ double PI = 3.141592;
	//^^^^^^^^^^^^ field 선언할 때 앞에 생략되어있음

	//method
	public abstract double area(double x, double y);
	//또는 double area(double x, double y);
	//interface는 반드시 abstract method만 써야하고 접근제한자도 public만 사용.
	//인터페이스 implements한 클래스에서 반드시 메소드 오버라이딩 해야한다
	//protected abstract double area(double x, double y ); //에러 발생. protected 쓸 수 없다.
	
	
	
	
	
	
}
