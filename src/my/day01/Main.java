package my.day01;

//import my.day01.Member;
//동일 패키지에 있는 클래스는 import하지 않아도 된다 but 다른 패키지의 클래스를 사용하고 싶다면 반드시 import해야한다

public class Main {

	public static void main(String[] args) {
		
		//콘솔 프로그램의 실행은 main() 메소드에서 실행한다.
		
		//회원1
		Member lssmbr/*Member 클래스의 객체(==인스턴스)라고 한다*/ = new Member(); // 이순신 
		lssmbr.id = "leess";
		lssmbr.pwd = "abcd";
		lssmbr.name = "이순신";
		lssmbr.email = "leess@naver.com";
		//lssmbr.address = "서울시 마포구";
		Member.address = "서울시 마포구"; 		//Member클래스에서 공유해서 사용하는 String타입의 변수라는 뜻
		//static 변수 -> 클래스명.static변수명
		
		//회원2
		Member eomjhmbr = new Member(); //엄정화
		eomjhmbr.id = "eomjh";
		eomjhmbr.pwd = "qwer1234";
		eomjhmbr.name = "엄정화";
		eomjhmbr.email = "eomjh@gmail.com";
		//eomjhmbr.address = "경기도 군포시 오금로";
		
		//프로그램을 실행하면 RAM의 일부분을 lssmbr와 eomjhmbr라는 이름으로 메모리를 차지하게 된다.
		
		System.out.println(lssmbr); //my.day01.Member@15db9742
		System.out.println(eomjhmbr); //my.day01.Member@6d06d69c
		
		//@다음에 나오는 값은 16진수로 표시된 메모리(RAM)상의 위치(주소)값
		
		
		
		System.out.println("lssmbr 객체의 성명 : " + lssmbr.name);
		System.out.println("eomjhmbr 객체의 성명 : " + eomjhmbr.name);
		
		
		//System.out.println("lssmbr 객체의 주소 : " + lssmbr.address);
		//System.out.println("eomjhmbr 객체의 주소 : " + eomjhmbr.address);
		System.out.println("Member 클래스로 생성되어진 객체들이 공유해서 사용하는 변수인 주소 : " + Member.address);
		
		
		//lssmbr 인스턴스에 대한 회원정보 조회
		lssmbr.showInfo();
		
		
		//eomjhmbr 인스턴스에 대한 회원정보 조회
		eomjhmbr.showInfo();
				
	}

}
