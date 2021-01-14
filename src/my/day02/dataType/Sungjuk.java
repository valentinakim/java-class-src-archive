package my.day02.dataType;

public class Sungjuk {
	
		/*
		      ※ 자료형의 종류

		1. 원시형 타입(Primitive Type)

		  1.1 정수형(byte, short, int, long)
		      -- 자바에서 정수형의 기본타입은 int 이다.
		      -- 그러므로 정수형의 값이 -2,147,483,648 ~ 2,147,483,647 범위를 벗어난 것이라면 반드시 숫자뒤에 소문자 l 또는 대문자  L 을 붙여야 한다.  
		      
		      byte (1byte == 8bit)  : -2^7  ~ 2^7-1  ==> -128 ~ 127 
		      short(2byte == 16bit) : -2^15 ~ 2^15-1 ==> -32,768 ~ 32,767
		      int  (4byte == 32bit) : -2^31 ~ 2^31-1 ==> -2,147,483,648 ~ 2,147,483,647  
		      long (8byte == 64bit) : -2^63 ~ 2^63-1 ==> -9,223,372,036,854,775,808 ~  9,223,372,036,854,775,807         
		      
		  1.2 실수형(float, double) 
		      float(4byte)  : 단정밀도   소수점이하 7자리까지 표현됨.     135.3246235
		      double(8byte) : 배정밀도   소수점이하 15~16자리까지 표현됨. 135.3246234502345642
		      -- 자바에서 실수형의 기본타입은 double 이다. 
		                    그러므로 실수값을 float 형태로 나타내기 위해서는 실수뒤에 반드시 소문자 f 또는 대문자 F를 붙여야 한다. 
		      
		  
		  1.3 문자형(char)
		     char : 자바는 유니코드 체계를 사용하므로
		                         문자형 타입인 char 는 2byte 이며, 범위는 0 ~ 65535 이다.
		                         그래서 char 타입에는 문자 1개 또는 숫자(0~65535)도 올 수 있다.              
		                         
		     UNICODE 표 참조 
		     http://www.tamasoft.co.jp/en/general-info/unicode.html                     
		  
		  === !!! 꼭 기억합시다 !!! ===
		  int(4byte) 아래의 크기인  byte(1byte), short(2byte), char(2byte) 타입이 
		       사칙연산(+ - * /)을 만나면 자동적으로 int 타입으로 자동 형변환이 발생된다.
		  
		  'A' => 65     'a' => 97
		  'B' => 66     'b' => 98
		  'C' => 67     'c' => 99
		  
		  '대문자' + 32 => 소문자에 해당하는 숫자
		  '소문자' - 32 => 대문자에 해당하는 숫자
		  
		  '0' => 48
		  '1' => 49
		  '2' => 50
		  '9' => 57
		  ' ' => 32
		  
		  
		  1.4 참(true) 또는 거짓(false)을 담아주는 boolean 타입 -- 크기가 1byte 이다.
		  
		     
		2. 참조형 타입(Reference Type)
		   --> 클래스 객체(==object ==instance) 타입   
		   --> 메모리상에 저장되어진 객체의 메모리 주소를 참조하는 것이다.
		   --> 참조형 타입(Reference Type) 메모리상에 크기는 4byte 를 차지한다.  

		     
		*/
	
		/*   
		      ※ === 변수의 명명규칙 ===
		       1. 변수명의 길이에는 제한이 없다. 
		       2. 대,소문자 구분이 있다.
		       3. 첫글자가 숫자는 안된다. 
		       4. 특수문자는 '_' 와 '$' 만 사용이 가능하다.
		       5. 예약어(예 package, import, public, class, String, int, float ....)는 변수명으로 사용불가하다.  
		       6.<권장사항이지 규칙은 아니다> 첫글자는 소문자로 시작하고 단어와 단어가 결합된 경우이라면 두번째 단어는 대문자로 시작하는것이 일반적이다.
		*/
	
	
	
	// 속성 == property == attribute == field

	String hakbun; //초기화값 null  학번	String값의 처음에 0이 온다면 문자열로 표시해줘야한다 
	String name;   //null 		  이름	String
	byte kor;	   //0	 		  국어(0~100)	숫자(정수)
	byte eng;	   //0         	  영어(0~100)	숫자(정수)
	byte math;	   //0 			  수학(0~100)	숫자(정수)
	
	char hakjum; // 학점 'A' 'B' 'C' 'D'. 초기화값 ' '
	char myName;
	
	// 기능, 행위 == behavior, method
	
	void showSungjuk() {
		short total = (short)(kor + eng + math);// 점수 범위 0 ~ 300
		//기본적으로 데이터 타입이 byte,short,char인 변수가 사칙연산을 하게 되면 int 값으로 변환되어 계산된다. ex) int total = kor+eng+math;
		/*강제형 변환(casting)
		 kor는 byte 타입인데  short 타입으로 바꾸고 싶다면 변수명 앞에 괄호로 타입명을 넣어준다 -> (short)kor		 
		
		short total = (short)kor + (short)eng + (short)math;  -> 에러. 각 변수는 short타입이지만 사칙연산을 거치면서 int변환이 되었다 따라서 오류
		short total = (short)(kor + eng + math);   ->이렇게는 가능
		 
		*/
		
		float avg1 = (float)(total/3.0);
		float avg2 = total/3.0F; 
		double avg3 = total/3.0;
		
		long money = 5000000000L; //기본적으로 정수는 int 타입을 취하므로 long 타입으로 나타내려면 마지막에 L표시를 해줘야한다
		
		
		String star = "";
		
		
		if(hakjum == 'A') {
			star = "☆☆☆☆☆";
		} else if(hakjum == 'B') {
			star = "☆☆☆☆";
		} else if (hakjum == 'C') {
			star = "☆☆☆";
		} else if (hakjum == 'D') {
			star = "☆☆";
		} else {			
			star = "☆";
		}
		
		
		if(avg1 >= 90) {
			star = "☆☆☆☆☆";			
		} else if(avg1 >= 80) {
			star = "☆☆☆☆";
		} else if (avg1 >= 70) {
			star = "☆☆☆";;
		} else if (avg1 >= 60) {
			star = "☆☆";
		} else {
			star = "☆";
		}
		
		
			
		
		System.out.println("===성적결과=== \n"
				+ "1. 학번 : " + hakbun + "\n"
				+ "2. 성명 : " + name + "\n"
				+ "3. 국어 : " + kor + "\n"
				+ "4. 영어 : " + eng + "\n"
				+ "5. 수학 : " + math + "\n"
				+ "6. 총점 : " + total + "\n"
				+ "7. 평균1 : " + avg1 + "\n"
				+ "8. 평균2 : " + avg2 + "\n"
				+ "9. 평균3 : " + avg3 + "\n"
				+ "10. 장학금 : " + money + "\n"
				+ "11. 학점 : " + hakjum + "\n"
				+ "12. 학점(☆)  :  " + star);
	
		/*  문자형 타입
		 	자바는 char 타입 표현시 유니코드를 사용
		 */
		
		
		 char ch1 = 44608;
		 char ch2 = 65;
		 char ch3 = 'a';
		 char ch4 = 'a'+1;		// char 타입도 사칙연산 만나면 int로 변환됨 a의 int 값은 97.
		 // 따라서 97+1 = 98. char = 98;은 char 타입으로 표시하면 b가 출력된다.
		 char ch5 = (char)(ch4 - 1);
		 //char ch5 = ch4 - 1; ->에러. ch4는 변수이므로 어떤 값이 올 지 모른다 char의 범위는 0~65585 까지 밖에 안됨. 따라서 int로 표시할 수가 없다. int 범위가 더 크므로.
		 //따라서 char타입으로 강제변환(casting) 해주면은 ch4에 char 타입 범위 내의 값이 온다는 것을 인식하고 계산하고 결과값을 char 타입 문자로 출력.
		 char ch6 = '\u2665';
		 
		 
		 System.out.println("\n === 문자형 ===");
		 System.out.println("ch1 : " + ch1);	//김
		 System.out.println("ch2 : " + ch2);	//A
		 System.out.println("ch3 : " + ch3);	//a
		 System.out.println("ch4 : " + ch4);	//b
		 System.out.println("ch5 : " + ch5);	//a
		 System.out.println("ch6 : " + ch6);	//♥
		 
		 
		 System.out.println("\n === boolean 형 ===");
		 		 	 
		 boolean bool = false;
		 
		 System.out.println("bool ==> " + bool);
		 
		 if(bool) {
			 System.out.println("현재 bool 변수의 값은  true입니다.");			 
		 } else {
			 System.out.println("현재 bool 변수의 값은 false입니다.");
		 }
		 
		 
		 
		 
	}
	
}

