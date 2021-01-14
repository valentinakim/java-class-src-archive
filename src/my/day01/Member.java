package my.day01;

public class Member {
	
/*
	만약에 쇼핑몰 프로그램을 작성하고자 한다면
	회원, 제품, 장바구니, 주문내역 등의 부품이 필요함
	여기서 필요로 하는 부품의 설계도면을 "클래스"라고 한다.
*/
	
	//추상화란 필요한 속성 및 기능만 뽑아내는 것을 말함. -> 메소드를 만든다.
	//회원가입 -> 아이디, 비밀번호, 성명, 이메일, 전화번호, 주소, 마일리지, etc
	//위의 아이디, 비밀번호 등을 속성이라고 할 수 있다.  attribute == property == field == 속성
	
// 1) 인스턴스(instance)변수
//	인스턴스 변수는 서로 다른  instance끼리 공유하지 못하고 각자 자기의 instance 내에서만 사용하는 것이다.
// instance는 클래스가 메모리(RAM)에 올라가서 실제 사용가능한 객체로 되어진 상태를 말한다.
	
	String id;		// String은 문자열을 뜻하는 클래스(자료형)이다.
			  		//문자열 타입의 id라는 변수
	String pwd;		//비밀번호
	String name;	//성명
	String email;	//이메일
	
	//id, pwd, name, email <- 이것을 인스턴스(instance)변수라고 한다. 혹은 non static 변수라고도 함

// 2) static 변수
// 공유변수라고도 한다. 동일한 클래스로 생성되어진 서로 다른 instance들끼리 공유하는 변수.
// static 변수는 객체 안에 생성이 되는 것이 아니라 별도로 RAM안에 값이 저장됨. 따라서 해당 클래스 내의 객체들은 모두 사용할 수 있는 값임.
	
	static String address; //주소
	
	//behavior == 행위 == 기능 == method(메소드)
	//프로그램 상의 어떠한 기능/행위들을 의미한다
	//자바에서 괄호()를 입력하는 때 : 1.생성자(constructor) 2.메소드(method)
	//클래스명과 같으면 생성자
	public Member() {
		System.out.println("Member 클래스의 생성자 호출함");
		
	}
	
	//회원정보 조회 기능 만들기
	void showInfo() { // void는 instance 메소드. 해당 객체에 대한 정보만 보여줌.
		//void는 return타입이 없음을 의미. 리턴값이 있는 경우에는 어떤 타입의 값이 리턴되는지 반드시 적어줘야한다 ex) String, Boolean, etc..  
		System.out.println("=== 회원정보 ===\n"
				+ "1. 아이디 : " + id +"\n"
				+ "2. 암호 : " + pwd + "\n"
				+ "3. 성명 : " + name + "\n"
				+ "4. 이메일 : " + email);
		// \n : 줄바꿈
		//static 메소드에는 instance 변수를 사용할 수 없다. 공유가 안되기 때문. static 메소드에는 오로지 static 변수만 사용가능.
	}
	
}
