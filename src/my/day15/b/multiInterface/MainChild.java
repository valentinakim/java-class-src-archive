package my.day15.b.multiInterface;

public class MainChild {

	public static void main(String[] args) {

		Child cd1 = new Child();

		cd1.work();
		cd1.cook();
		cd1.play();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		InterFather infather = new Child();
		infather.work();
		
		
		InterMother inmother = new Child();
		inmother.cook();
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		InterChild inchild = new Child();
		inchild.work();
		inchild.cook();
		inchild.play();
		
		
		
		
	}

}
