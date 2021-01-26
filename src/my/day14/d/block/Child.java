package my.day14.d.block;

public class Child extends Parent {
	
	//field (Main 실행시 첫번째 실행)
	String name = "홍길동";	//멤버변수의 초기화
	static int count;		//멤버변수의 초기화

	//== static 초기화 블럭== (Main 실행시 두번째 실행)
	static {
		// static 초기화 블럭은 인스턴스(객체)를 생성하기 전에 먼저 호출되어지며 오로지 1번만 호출된다(중요!)
		//주로 환경설정시 사용된다.
		
		
		System.out.println("*** Child 클래스의 'static 초기화 블럭' 호출됨 *** (2nd print)");
		count++;
		
		// name = "똘똘이";	//에러 발생. static 블록에 static 변수만 들어올 수 있고 인스턴스 변수를 쓸 수 없다 인스턴스화가 먼저 되어야만 인스턴스 변수를 쓸 수 있는데 이는 static 블록 생성 이후에 하므로 
		
	}
	
	// == instance(인스턴스) 초기화 블럭 == (Main 실행시 네번째 실행)
	{
		
		System.out.println("### Child 클래스의 인스턴스 초기화 블럭 호출됨 ### (4th print)");
		name = "서강준";
		
		
	}
	
	//== 생성자 ==
	public Child() {
		
		//super();	(Main 실행시 세번째 실행)
		
		//Main 실행시 다섯번째 실행
		System.out.println(">> 자식클래스인 Child 클래스의 기본생성자 호출됨 (5th print)");
		name = "한지민";
		
	}
	
	
}
