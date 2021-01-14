package my.day02;

//지역변수, instance변수의 차이점


public class Main01 {
	
	String id;
	String pwd;
	String name;
	String email;
	int age;  // 정수타입
	
	/* 멤버변수 = instance변수와 static변수를 합친 것
	 * instance 변수 및 static 변수는 초기화를 하지 않더라도 자동적으로 초기화가 되어진다. 지역변수는 반드시 해야함
	 * 정수 타입(byte, short, int, long)의 경우 0으로 초기화, 실수형 타입(float, double)의 경우 0.0으로 초기화
	 * String 타입의 경우 null로 초기화
	 * 문자형 타입(char)는 자동적으로 ' '으로 초기화
	 */
	
	
	
	void showInfo1() {
		//지역변수(Local Variable) 반드시 초기화(==데이터에 값을 부여하는것)가 필요하다.
		//블록 내에서만 사용되며 해당 블록 실행이 끝나면 자동적으로RAM에서 소멸/삭제되어진다.
		int hopeMoney = 5000;
		
		String shopeMoney = "오천만원";
		
		System.out.println("===회원정보=== \n"
				+ "1. 아이디 : " + id + "\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 성명 : " + name + "\n"
				+ "4. 이메일 : " + email + "\n"
				+ "5. 나이 : " + age + "\n"
				+ "6. 희망급여 : " + hopeMoney + "\n"
				+ "7. 희망연봉 : " + shopeMoney);
	
		
	/* 1. 문자열 + 문자열 
	   	ex) "안녕하세요" + " 반갑습니다" ==> 안녕하세요 반갑습니다
	   2. 문자열 + 숫자
	   	ex) "안녕하세요" + 25 ==> 안녕하세요25
	   	ex) 20 + 30 + "안녕" ==>50안녕
	   3. 20 + 30 ==> 50
	   	ex) "20" + 30 ==> 2030
	*/
	
	}
	
	String showInfo2() {
		int hopeMoney = 4000;
		
		return "===회원정보=== \n"
				+ "1. 아이디 : " + id + "\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 성명 : " + name + "\n"
				+ "4. 이메일 : " + email + "\n"
				+ "5. 나이 : " + age + "\n"
				+ "6. 희망급여 : " + hopeMoney;
	}
	
	
	public static void main(String[] args) {
		
		Main01 ma1 = new Main01();  //인스턴스화(==객체생성)
		
		ma1.id = "leess";
		ma1.pwd = "qwer1234";
		ma1.name = "이순신";
		ma1.email = "leess@naver.com";
		ma1.age = 25;
		
		ma1.showInfo1();
		System.out.println("//////////");
		
		String info1 = ma1.showInfo2();
		// showinfo2의 리턴값을 info2로 받는것(info2에 저장되는것)
		
		System.out.println(info1);
		
		System.out.println("+++++++++++");
		
		Main01 ma2 = new Main01();  //인스턴스화(==객체생성)
		
		ma2.showInfo1();
		
		System.out.println("+++++++++++");
		
		String info2 = ma2.showInfo2();
		System.out.println(info2);
		
		
		
		
		
	}

}
