package my.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		if(passwd == null)
			return false;
		
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

	
	//=== ,가 들어있는 숫자로 되어진 문자열의 ,를 제거 후 정수로 리턴시켜주는 메소드===/
	
	public static int delComma(String str) {
							//"2,000,000"
		do {
			int commaIndex = str.indexOf(",");
			
			if(commaIndex == -1)
				break;
			
			str = str.substring(0, commaIndex) + str.substring(commaIndex+1);
			//첫번째반복		"2" + "000,000" ==> "2000,000"
			//두번째반복		"2000" + "000" ===> "2000000"
		} while (true);
		
		return Integer.parseInt(str);	// 2000000
	}//end of public static int delComma(String str)----------------------
	
	// ===주민번호 7자리를 입력받아서 올바른 데이터인지 검사해주는 메소드

	public static boolean isCheckJubun(String jubun) {
		
		// "9501151" "9501152" "0105103" "0105104"
		
		if(jubun == null)	//jubun에 아무것도 입력 안했을때
			return false;
		
		
		char[] chArr = jubun.toCharArray();
		
		if(chArr.length != 7)	//7자리 입력 안했을때
			return false;
		
		for(int i=0; i<7; i++) {
			
			if(!Character.isDigit(chArr[i])) {	//숫자가 아닌 문자를 입력했을때
				return false;
			}
			
		}//end of for---------------------------
		
		
		if(!('1' <= chArr[6] && chArr[6] <= '4')) {		//맨 끝에 성별식별숫자를 1~4 이외의 숫자를 입력했을때
			return false;
		}
		
		
		// 월 => "01" ~ "12"
		int month = Integer.parseInt(jubun.substring(2, 4));
		// 1~12   01은 int로 바뀌면 1로 변환되어 출력된다
		
		if(!(1<=month && month <=12))
			return false;
		
		// 일 => "01" ~ "31"
		
		int day = Integer.parseInt(jubun.substring(4, 6));	// 1~31

		if(!(1<=day && day<=31))
			return false;
			
		//2월 > 30,31일 없음.
		if( month == 2 && 30<= day && day<= 31)
			return false;
		
		//31일이 없는 달(4,6,7,8,10,12)에 관한 코드 짜기
		
		
		
		
		//1900년대생은 1,2만 2000년대생은 3,4만 입력하는지 유효성 검사 코드 짜기
		
		
		
		
		return true;	//위의 모든 예외사항에 해당사항이 없으면 true를 리턴한다
		
		
	}//end of public static boolean isCheckJubun(String jubun)-----
	
	
	
	public static boolean isCheckJubun2(String jubun) {
		
		if(jubun == null) {
			return false;
		}
		// jubun ==> "9501151" "9501152" "0105103" "0105104"
		
		// 정규표현식(Regular Expression)이란?
		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
		
		//==1.정규표현식(Regular Expression) 패턴을 작성한다.===
		//Pattern p = Pattern.compile("^[0123456789][0-9][01][0-9]{3}[1-4]$"); // ^은 시작을 의미 $는 끝을 의미 []는 글자 1개가 들어오는것을 의미
								//    ^^^^^^^^^^^^ 0 또는 1 또는 2 또는 .... 8 또는 9만 들어온다는 뜻 [0-9]와 같은 의미
								// {3}는 [0-9]가 연이어서 3번 나온다는 뜻
		
		Pattern p = Pattern.compile("^\\d{2}[01]\\d{3}[1-4]$");
		// [0-9]와 \\d은 같은 뜻이다
		
		
		//==2.문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다.===
		Matcher m = p.matcher(jubun);
		
		//==3.판별하도록 한다.==
		//주어진 정규식 패턴과 일치하면 true, 일치하지 않으면 false를 리턴
		boolean b = m.matches();
		
		return b;
		
	}//end of public static boolean isCheckJubun2(String jubun)--------
	
	
	
}
