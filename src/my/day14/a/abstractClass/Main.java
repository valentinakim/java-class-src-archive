package my.day14.a.abstractClass;

public class Main {

	// == 미완성 클래스 ==
	//미완성 클래스는 스스로 객체생성(인스턴스화)은 불가하지만 일반적인 자식클래스로 생성된 객체를 저장하는 용도로는 사용이 가능하다 
	
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
		
		
		//Animal ani = new Animal();
		//Animal은 미완성 클래스이므로 객체(인스턴스)를 생성할 수 없다
		//ani.cry();
		
		
		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] !=null)
				aniArr[i].showInfo();
		}
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0; i<aniArr.length; i++) {
			if(aniArr[i] !=null)
				aniArr[i].cry();
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			
		
		
	}//end of main--------------------------------

}
