package my.day05.c.IF;

public class IfMain {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		if(n1 == n2) {
			System.out.println(n1 + "은(는) " + n2 + "과(와) 같습니다.");
		}
		else {
			System.out.println(n1 + "은(는) " + n2 + "과(와) 같지 않습니다.");
		}

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		String name1 = "정재현";
		String name2 = "서영호";
		
		
		if(name1 == name2) {	// name1과 name2의 저장된 데이터 값 비교
			System.out.println(name1 + "은(는) " + name2 + "과(와) 같습니다.");
		}
		else {
			System.out.println(name1 + "은(는) " + name2 + "과(와) 같지 않습니다.");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		String name3 = new String("문태일");
		String name4 = new String("문태일");
		
		
		if(name3 == name4) {	//name3과 name4는 메모리 주소를 비교. 두 객체의 주소가 다르기 때문이 결과값이 false로 나온다
			System.out.println(name3 + "은(는) " + name4 + "과(와) 같습니다.");
		}
		else {
			System.out.println(name3 + "은(는) " + name4 + "과(와) 같지 않습니다.");
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		if(name3.equals(name4)) {	// name3과 name4의 저장된 데이터 값 비교.
			System.out.println(name3 + "은(는) " + name4 + "과(와) 같습니다.");
		}
		else {
			System.out.println(name3 + "은(는) " + name4 + "과(와) 같지 않습니다.");
		}
		
		
		
	}

}
