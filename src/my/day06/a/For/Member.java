package my.day06.a.For;

public class Member {

	//field
	String id;
	String pwd;
	String name;
	
	//method
	
	boolean checkPwd(String pwd) {
				//  ^^^^^^^^^^^ 매개변수. 메인 메소드에서 매개값을 받는 역할을 한다
		// 8글자 이상 15글자 이하 영문자, 숫자, 특수기호가 혼합되어야함
		// pwd ==> "Ab123$" (글자수 미달) ==> false
		// pwd ==> "Ab123cdef" (특수기호 누락) ==> false
		// pwd ==> "Abcdefghi" (숫자 및 특수기호 누락) ==> false
		// pwd ==> "Abcdef@#$" (숫자 누락) ==> false
		// pwd ==> "Abcdef@#$567" ==> true
		
		//checkPwd메소드의 지역변수이므로 초기화 해줘야한다. boolean타입의 초기값은 false
		boolean alphabetFlag = false; // 영문자 깃발
		boolean numFlag = false;// 숫자 깃발
		boolean specialFlag = false;// 특수기호 깃발
		
		
		int length = pwd.length();	//입력받으 비밀번호의 문자열 길이
		
		if(8 <= length && length <= 15) {
			
			for(int i=0; i<length; i++) {
				char ch = pwd.charAt(i);	// 'A' ==> 65
				
				if(Character.isAlphabetic(ch+0)) { 	//문자열이 알파벳이라면 결과값이 true가 나옴
									//	  ^^^^ char 타입을 int 타입으로 변환시켜주기위해서. char는 사칙연산자를 만나면 int로 자동 형변환
					alphabetFlag = true;
				}
				else if (Character.isDigit(ch)) {
					numFlag = true;
				}
				else {
					specialFlag = true;
				}
			}
			
			if(alphabetFlag && numFlag && specialFlag) {
				return true;
			}
			else {
				return false;
			}
		}
		else {	//글자 길이가 8글자 이상 15이하가 아닌 경우
			return false;
		}
		
		
	}//end of checkPwd method----------------------------------
	
	
	
}
