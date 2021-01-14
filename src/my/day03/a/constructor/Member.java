package my.day03.a.constructor;

public class Member {
	
	// 객체(부품)에는 필드와 메소드가 있다(속성과 기능)
	// field, attribute, property, 속성
	String userid;
	String passwd;
	String name;
	int age;
	int point;
	
	
	// **생성자(constructor)**
	/*
	 public Member() { //생성자명 옆 괄호 안에 아무것도 없을때
	 
		System.out.println(">> Member 클래스의 기본 생성자(default constructor)를 호출 했습니다. <<");
	}
	*/
	// 생성자를 명시하지 않아도 컴파일할 때 따로 오류는 발생하지 않는다 왜냐하면 굳이 명시하지 않아도 생성자 블록이 생략되어져 있다
	//public Member() {   }
	public Member() {
		
	}
	
	/* !!! 중요 !!! 파라미터 생성자가 선언되어 있으면 생략되어져있던 기본 생성자가 자동적으로 소멸되어 버린다. 따라서 파라미터 생성자가 있으면 기본 생성자를 반드시 
	명시 해줘야한다
	*/
		
	//파라미터 생성자
	
	// hongMbr 객체 생성할 때 어떻게 값을 받을 것인지. 생성자 선언.
	public Member(String userid, String passwd, String name, int age, int point) {
		//				 ^^^^^^ 지역변수. main메소드의 데이터를 받는다	 ^^^^^^^ 매개변수(Parameter)
		this.userid = userid; //this를 붙임으로써 해당 메소드의 지역변수명과 구분지어준다
		//   ^^^^^^위의 필드명
		// userid = userid; 지역변수명과 멤버변수명이 일치할 경우에 지역변수가 우선된다
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		this.point = point;
		//이 클래스(클래스 이름이 뭐가 되었든)의 인스턴스 변수에 지역변수 값을 넣어주겠다. 
		
	}
	
	 
	
		
	// behavior, 행위, 기능, method
	// 파라미터가 없고 리턴 타입도 없는 메소드 만들기 예제
	void showInfo() {
		System.out.println("=== " + name + "님의 회원정보 ===" + "\n"
				+ "1. 아이디 :" + userid + "\n"
				+ "2. 암호 : " + passwd +"\n"
				+ "3. 성명 : " + name +"\n"
				+ "4. 나이 : " + age +"\n"
				+ "5. 포인트 : " + point +"\n");		
	}
	
	// 파라미터가 있고 리턴 타입이 없는 메소드 만들기 예제
	void changeInfo(String userid, String passwd, String name, int age, int point) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
		
		this.point = point;
		
		System.out.println(">> 변경 후 정보조회하기 <<");
		showInfo(); //메소드 호출
		}
	
	
	// 파라미터가 있고 리턴 타입이 있는 메소드 만들기 예제

	
	String updateInfo(String userid, String passwd, String name, int age, int point) {
		
		String beforeInfo = ">> " + this.name + "님의 회원수정 하기전 <<" + "\n"
								//  ^^^^^^^^^ 아직 변경데이터를 넣기 전
								+ "1. 아이디 :" + this.userid + "\n"
								+ "2. 암호 : " + this.passwd +"\n"
								+ "3. 성명 : " + this.name +"\n"
								+ "4. 나이 : " + this.age +"\n"
								+ "5. 포인트 : " + this.point +"\n";

		//this.userid에 변경 후 값을 넣어주는 과정
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;		
		this.point = point;
						
		String afterInfo = ">> " + this.name + "님의 회원수정한 후 결과 <<" + "\n"
						+ "1. 아이디 :" + this.userid + "\n"
						+ "2. 암호 : " + this.passwd +"\n"
						+ "3. 성명 : " + this.name +"\n"
						+ "4. 나이 : " + this.age +"\n"
						+ "5. 포인트 : " + this.point +"\n";
		
		return beforeInfo + "\n" + afterInfo;
	}
	
	 
	
	
	
	
	
}

