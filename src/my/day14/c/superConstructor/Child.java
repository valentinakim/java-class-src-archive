package my.day14.c.superConstructor;

public class Child extends Parent {

	//field
	String name;
	
	//기본생성자
	public Child() {
		/*
		super();	//부모클래스의 기본 생성자. 굳이 직접 쓰지 않더라도 자식클래스 기본생성자에는 부모클래스의 기본 생성자가 생략되어있으며 기본적으로 무조건 호출 되어진다.
		System.out.println("== 확인용 Child 클래스의 기본생성자 호출함 ==");
		*/
		/*
		System.out.println("== 확인용 Child 클래스의 기본생성자 호출함 ==");
		super();	// super();를 나중에 호출하면 에러 발생. 부모 생성자는 생성자 내에서 항상 가장 먼저 나와야한다.
		 */
		name = "정재현";
		
	}
	
	//method
	void childInfo() {
		String info = "아이디 : "+super.id+"\n"
					+ "암 호 : "+super.passwd+"\n"
					+ "성 명 : "+this.name+"\n";
		
		System.out.println(info);
	}
	
}
