package my.day05.a.wrapper;

import java.util.Scanner;

/*
=== *** wrapper 클래스 *** ===

------------------------------------------------
  기본자료형(원시형, primitive)     wrapper 클래스
------------------------------------------------
 byte                           Byte 
 short                          Short
 int                            Integer  
 long                           Long
 char                           Character
 float                          Float
 double                         Double
 boolean                        Boolean 
 ------------------------------------------------
 
  기본자료형(원시형)은 데이터 저장 및 4칙연산 에서만 사용하는 것이고, 
 wrapper 클래스는  데이터 저장 및 4칙연산 뿐만아니라 
  아주 다양한 기능의 메소드가 제공되므로 다방면으로 사용되어진다. 
*/


public class WrapperMain {

	public static void main(String[] args) {
		
		char ch = 'a';
		System.out.println("ch => " + ch);	// ch=>1
		System.out.println(ch+1); // (int)ch+1		97
		System.out.println( (char)(ch-32));	//(int)ch-32	97-32	A
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
		Character chr = new Character('a');
		System.out.println("chr => " + chr);
		System.out.println(chr+1);
		System.out.println( (char)(chr-32));	// 'A'
		
		System.out.println( (char)('a'-32));
		System.out.println(Character.toUpperCase('a'));		//'A'
								//   ^^^^^^^^^^^ 입력받은 글자를 대문자로 바꾸어줌
		System.out.println(Character.toLowerCase('A'));		//'a'
								//   ^^^^^^^^^^^ 입력받은 글자를 소문자로 바꾸어줌
		System.out.println(Character.toUpperCase(97));		//65	int값을 넣어줬으므로 결과값도 int값으로 출력됨
		System.out.println(Character.toLowerCase(65));		//97

				
		char ch2 = '#';
		
		if( ch2 == 67 ) {	//char 타입은 비교연산자( == != > < >= <=)를 만나면 자동적으로 int 타입으로 형 변환됨
			System.out.println("자바 어렵");
		}
		
		if( 65 <= ch2 && ch2 <= 90 ) {	//대문자인지 알아보기
			System.out.println("ch2는 대문자입니다.");			
		}
		else if(97 <= ch2 && ch2 <= 122) {	//소문자인지 알아보기
			System.out.println("ch2는 소문자입니다.");		
		}
		else if(48 <= ch2 && ch2 <= 57) {	//숫자인지 알아보기
			System.out.println("ch2는 숫자입니다.");		
		}
		else {	//기타문자인지 알아보기
			System.out.println("ch2는 기타문자입니다.");		
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				
		if(Character.isUpperCase(ch2)) {	//대문자인지 알아보기
		// Character 클래스의 isUpperCase라는 static 메소드 이용. 매개변수 ch2의 대문자 여부를 boolean값으로 나타낸다.
			System.out.println(ch+" 는 대문자입니다.");			
		}
		else if(Character.isLowerCase(ch2)) {	//소문자인지 알아보기
			System.out.println(ch+" 는 소문자입니다.");		
		}
		else if(Character.isDigit(ch2)) {	//숫자인지 알아보기
			System.out.println(ch2+" 는 숫자입니다.");		
		}
		else {	//기타문자인지 알아보기
			System.out.println(ch2+" 는 기타문자입니다.");		
		}
		
		// charAt() 예시
		
		String str = "Baby";
		char ch1 = str.charAt(0);	//'B'
		System.out.println(ch1);	//'B'
		ch1 = str.charAt(3);		//'y'
		System.out.println(ch1);	//'y'
		
		
		//////////////////////
		
		//////퀴즈////
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("한글자만 입력하세요 => ");	
		
		/* String input = sc.nextLine(); //nextLine(); 자체가 String 타입이기 때문에 String 타입 변수에 담을 필요가 없다
		char ch5 = input.charAt(0); 
		*/
		
		char ch5 = sc.nextLine().charAt(0);
				
		if(Character.isUpperCase(ch5)) {	//대문자인지 알아보기
			// Character 클래스의 isUpperCase라는 static 메소드 이용. 매개변수 ch2의 대문자 여부를 boolean값으로 나타낸다.
				System.out.println("입력하신 " + ch5+"은(는) 대문자입니다.");			
			}
			else if(Character.isLowerCase(ch5)) {	//소문자인지 알아보기
				System.out.println("입력하신 " + ch5 + "은(는) 소문자입니다.");		
			}
			else if(Character.isDigit(ch5)) {	//숫자인지 알아보기
				System.out.println("입력하신 " + ch5 +"은(는) 숫자입니다.");		
			}
			else {	//기타문자인지 알아보기
				System.out.println("입력하신 " + ch5 +"은(는) 기타문자입니다.");		
			}		
		
	
		sc.close();
		
		// Boxing(박싱, 포장을 하는것) 이란 ?
	    // ==> 기본자료형(boolean, byte, short, int, long, char, float, double)으로 되어진 변수를 
	    //     객체타입인 Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)   
	    //     타입의 객체로 만들어주는 것을 말한다.
		
		System.out.println("== 오토박싱, 오토언박싱에 대해서");
		
		int a1 = 10;
		Integer a2 = new Integer(a1); // Boxing
		int b2 = 10;
		// Integer b2 = a1; //auto boxing
		// System.out.println("b2 => " + b2);
		
		// UnBoxing(언박싱, 포장을 푸는것) 이란?   
	    // ==> Wrapper 클래스(Boolean, Byte, Short, Integer, Long, Character, Float, Double)로 
	    //     되어져 있는 객체를 기본자료형(boolean, byte, short, int, long, char, float, double)으로 
	    //     만들어주는 것을 말한다
		
		
		Integer a3 = new Integer(20);
		int a4 = a3.intValue();		//언박싱
		System.out.println("a4 => " + a4);
		
		int a5 = new Integer(20);		//오토 언박싱
		System.out.println("a5 => " + a5);
		
		
		Double db1 = new Double(1.234567);
		double db2 = db1.doubleValue();		//언박싱
		System.out.println("db2 => " + db2);
		
		double db3 = new Double(1.234567);	//오토 언박싱
		System.out.println("db3 => " + db3); // db3 => 1.234567
		
		
	
	} 
		
	
		//////////////////////////////
		
	
		
		



}
