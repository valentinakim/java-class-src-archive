package my.day02.dataType;

public class Main {
	
	
	public static void main(String[] args) {
		
		/*
		
		int hakbun1 = 20191234;
		int hakbun2 = 014543; //맨앞에 0으로 시작하면 8진수로 출력이된다
		
		String hakbun3 = "20191234";
		String hakbun4 = "0014543"; //문자열로 맨앞에 0이 나오는 값을 표시해줄 수 있다
		
		System.out.println("hakbun1 : " + hakbun1); //20191234
		System.out.println("hakbun2 : " + hakbun2); //6499 (8진수 출력)
		System.out.println("hakbun3 : " + hakbun3); //20191234
		System.out.println("hakbun4 : " + hakbun4); //0014543
		
		*/
		
		System.out.println("5/2 => " + (5/2));			// 정수/정수의 결과값은 정수(몫)로만 표시 5/2 => 2
		System.out.println("5/2.0 => " + (5/2.0));		// 정수/실수 결과값은 실수로 표시 5/2.0 => 2.5
		System.out.println("5.0/2 => " + (5.0/2));		// 정수/실수 결과값은 실수로 표시 5.0/2 => 2.5
		System.out.println("5.0/2.0 => " + (5.0/2.0));	// 실수/실수 결과값은 실수로 표시 5.0/2.0 => 2.5

		System.out.println("5%2 => " + (5%2));			// 5를 2로 나누었을 때의 나머지. 1
		
		
		Sungjuk lssSj = new Sungjuk();
		
		lssSj.name = "이순신";
		lssSj.hakbun = "091234";
		lssSj.kor = 68;
		lssSj.eng = 95;
		lssSj.math = 100;
		
		
		Sungjuk eomSj = new Sungjuk();
		
		eomSj.name = "엄정화";
		eomSj.hakbun = "109876";
		eomSj.kor = 78;
		eomSj.eng = 88;
		eomSj.math = 95;
		
		
		lssSj.showSungjuk();
		
		System.out.println("////////////////");
		
		eomSj.showSungjuk();
		
		//참조형 타입 예시
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~ \n");		

		System.out.println("lssSj => " + lssSj);
		// lssSj => my.day02.dataType.Sungjuk@15db9742
		
		System.out.println("eomSj => " + eomSj);
		//eomSj => my.day02.dataType.Sungjuk@6d06d69c

		Sungjuk hongSj = new Sungjuk();
		System.out.println("hongSj => " + hongSj);
		//hongSj => my.day02.dataType.Sungjuk@7852e922
		
		hongSj = eomSj;
		System.out.println("hongSj => " + hongSj);
		//hongSj => my.day02.dataType.Sungjuk@6d06d69c
		
		System.out.println("\n ~~~~~~~~~~~~~~~~~~~~ \n");
		
		hongSj.name = "EomJungHwa";		
		eomSj.showSungjuk();

		
	}
		

	
						

}