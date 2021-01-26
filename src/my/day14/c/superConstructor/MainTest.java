package my.day14.c.superConstructor;

public class MainTest {

	public static void main(String[] args) {

		Child child = new Child();
		//자식클래스의 기본생성자를 호출.
		
		//이것은 Child의 부모 클래스인 Parent 클래스의 기본생성자가 먼저 호출된 후 자식클래스인 Child의 기본생성자가 호출되어짐.
		child.childInfo();
		
	}

}
