package my.day15.b.multiInterface;

public interface InterChild extends InterFather,InterMother{ //인터페이스를 상속 받기 위해서 implements를 쓴다 extends가 아님
	//여러 인터페이스의 다중 상속 가능
	
	void play();
	
}
