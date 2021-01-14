package my.day06.a.For;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Member mbr = new Member();

		/*
		System.out.println("mbr.id => " + mbr.id);
		System.out.println("mbr.id의 문자열 길이 => " + mbr.id.length());		//NullPointerException 에러
		/*
		/*
		"".length();	//""는 공백이 존재한다. 도트 연산자를 붙여서 메소드를 호출할 수 있다.
		null	//존재하지 않음. 도트 연산자를 사용할 수 없다.
		*/
		
		System.out.println(">>> 회원가입 <<<");
		System.out.print("1. 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("2. 비밀번호 (8글자 이상 15글자 이하 영문자, 숫자, 특수기호가 혼합되어야함): ");
		String pwd = sc.nextLine();
		
		System.out.print("3. 회원명 : ");
		String name = sc.nextLine();
		
		mbr.id = id;		//위의 스캐너로 입력받은 id 매개값을 mbr 객체의 id 필드에 저장
		
		/*
		System.out.println("mbr.id => " + mbr.id);
		System.out.println("mbr.id의 문자열 길이 => " + mbr.id.length());
		*/
		
		
		if (mbr.checkPwd(pwd)) {	//입력받은 pwd 값을 checkPwd 메소드에 입력해서 true 값이 나왔을때 비번 입력 기능 실행
			mbr.pwd = pwd;
		}
		else {
			System.out.println(">> 비밀번호는  8글자 이상 15글자 이하 영문자, 숫자, 특수기호가 혼합되어야합니다. <<");
			System.out.println("== 회원가입 실패 ==");
			sc.close();
			return;
		}
		
		
		mbr.name = name;
		
		if (mbr.id != null && mbr.id.length() > 0 && 
			mbr.pwd	!= null && /*length()를 알아볼 필요가 없다 위의 if조건문에서 통과를 해야만 이 if문에 올 수 있기 때문*/
			mbr.name != null && mbr.name.length() > 0) {
		//	^^^^^^^^^^^^^^^^^ 반드시  null이 아니여야한다는 조건을 먼저 써줄것. 그래야 length()를 사용할 수 있다	
			System.out.println("== 회원가입 성공!! ==");
		}
		else {
			System.out.println("== 회원가입 실패 ==");
		}
			
		
		
		
		sc.close();

	}


}
