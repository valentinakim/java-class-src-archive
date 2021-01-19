package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {

	// 현재시각을 출력하는 static 메소드 생성하기
	
	public static void currentTime() {
		Date now = new Date(); // 현재시각
		//JAVA API 문서 확인해볼것
		SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 2021-01-07 11:22:35
		String result = sdfrmt.format(now);
		System.out.println(result);
		
	}
	

	//===비밀번호가 규칙에 맞는지 틀리는지 알려주는 static 메소드 생성하기===
	// 비밀번호 규칙 : 8글자 이상 15글자 이하, 영문대문자, 영문소문자, 숫자, 특수기호가 혼합되어야만 한다.
	//규칙에 맞으면 true, 틀리면 false를 리턴
	
	public static boolean isCheckPasswd(String passwd) {
									// ^^^^^^^^^^^^^^^ 검사해야할 비밀번호를 파라미터로 받아온다
		
		// ex) "ab123cd#S".toCharArray();를 하면
		// {'a' 'b' '1' '2' '3' 'c' 'd' '#' 'S'} 으로 변환된다.
		
		char[] chArr = passwd.toCharArray();
			// ^^^^^^^^^^^^^ 리턴값을 char 타입 배열로 돌려준다
		/*
		------------------------------------
	 	| a | b | 1 |2 | 3 | c | d | # | S |
	 	------------------------------------
		*/
		
		
		if( 8 <= chArr.length && chArr.length <= 15 ) {
			
		
		
			boolean flagUpper = false; //영문대문자 표식을 위한 용도
			boolean flagLower = false; //영문소문자 표식을 위한 용도
			boolean flagDigit = false; //숫자 표식을 위한 용도
			boolean flagSpecial = false; //특수문자 표식을 위한 용도
			
			/*
			for(int i =0; i<chArr.length; i++) {
				char ch = chArr[i];
				
				if(Character.isUpperCase(ch)) {	//대문자인 경우
					flagUpper = true;
				}
				
				else if(Character.isLowerCase(ch)) {	//소문자인 경우
					flagLower = true;
				}
				
				else if(Character.isDigit(ch)) {	//숫자인 경우
					flagDigit = true;
				}
				
				else {	//특수문자인 경우
					flagSpecial = true;
				}
				
			}//end of for-------------------------
			*/
			
			//=== 또는 ===
			
			for(char ch : chArr) {
				if(Character.isUpperCase(ch)) {	//대문자인 경우
					flagUpper = true;
				}
				
				else if(Character.isLowerCase(ch)) {	//소문자인 경우
					flagLower = true;
				}
				
				else if(Character.isDigit(ch)) {	//숫자인 경우
					flagDigit = true;
				}
				
				else {	//특수문자인 경우
					flagSpecial = true;
				}
			}//end of for-----------------
		
			if(flagUpper && flagLower && flagDigit && flagSpecial) {
				return true;
			}
			else {	// 비번 글자수가 범위안에 들지만 대소문자,숫자,특수문자를 모두 섞어쓰지 않은 경우
				return false;
			}
			
			
		}//end of if------------------------
		
		else {	//비밀번호 길이가 범위를 벗어난 경우(8글자 미만 혹은 15글자 이상)
			return false;
		}
		
		
		
	} //end of public static boolean isCheckPasswd(String passwd)-----------------
	
	
	
	
}
