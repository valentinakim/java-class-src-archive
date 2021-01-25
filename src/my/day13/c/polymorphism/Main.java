package my.day13.c.polymorphism;

public class Main {

	// 다형성(Polymorphism) : 상속을 이용하여 여러 클래스 타입을 하나의 클래스 타입으로 다루는 기술
	// 자식클래스로 생성되어진 객체를 부모 클래스 타입으로 받을 수 있다는 것이 다형성이다.
	
	public static void main(String[] args) {

		Animal[] aniArr = new Animal[5];
		
		Dog dog = new Dog();				//보통은 해당 클래스에서 객체 생성
		//Animal ani1 = new Dog();	//가능	// 다형성 특성에 따른 부모 클래스에서 객체 생성
		//aniArr[0] = new Dog();	//가능	//Animal 배열 속에는 형태가 다양한 자식 클래스가 들어옴
		dog.setName("뽀삐");
		dog.setBirthYear(2010);
		dog.setWeight(5);
		
		aniArr[0] = dog;
		
		
		Cat cat = new Cat();
		//Animal ani2 = new Cat();	//가능
		//aniArr[1] = new Cat();	//가능
		cat.setName("톰");
		cat.setBirthYear(2017);
		cat.setColor("검정");
		
		
		aniArr[1] = cat;
		
		
		Duck duck = new Duck();
		//Animal ani3 = new Duck();	//가능
		//aniArr[2] = new Duck();	//가능
		duck.setName("도널드");
		duck.setBirthYear(2010);
		duck.setPrice(5000);
		aniArr[2] = duck;
		
		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] !=null)
				aniArr[i].showInfo();
		}
		
		
		
		
	}//end of main--------------------------------

}
