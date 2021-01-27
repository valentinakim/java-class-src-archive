package my.day15.b.multiInterface;

public class Child implements InterChild {
	
	@Override
	public void work() {	//InterFather 인터페이스로부터 상속 받은 메소드
		System.out.println("아빠는 일합니다");
	}

	@Override
	public void cook() {	//InterMoher 인터페이스로부터 상속 받은 메소드
		System.out.println("엄마는 요리합니다");
	}

	@Override
	public void play() {	//InterChild 인터페이스로부터 상속 받은 메소드
		System.out.println("아이는 놉니다");
	}

}
