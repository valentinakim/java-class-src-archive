package my.day04.b.scanner;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Score score = new Score();	//기본 생성자 호출
		
		
		
		
		 int inputType = 0;
		
		
		try {
			
			System.out.print("1. 학번 : ");
			score.stuNum = sc.nextLine();
			
			System.out.print("2. 성명 : ");
			score.name = sc.nextLine();

			
			
			// === 유효성 검사(올바른 데이터인지 틀린 데이터인지 검사하는것) ===
			
			//Integer.parseInt(String str);  
			//Byte.parseByte(String str);
			//Short.parseShort(String str)
			
			inputType = 1;	// inputType 값이 1이라면 국어, 영어, 수학성적을 입력하는 중이라고 본다.
			System.out.print("3. 국어 : ");
			
			byte kor = Byte.parseByte(sc.nextLine());
								//	  ^^^^^^^^^^^^^ 경우의 수 : "똘똘이" "2000" "-50" "90"
			
			 boolean bool = score.scoreCheck(kor);	//이 기능의 결과값은 true 혹은 false로 나옴
			 //				^^^^^^^^^^^^^^^^^^^^^ 문자열을 바이트 타입으로 변환
			 // 문자를 넣거나 byte 범위 이외의 숫자를 넣으면  오류가 나면서 catch 블록의 기능이 실행되면서 오류메세지가 출력된다.
			 // byte 범위 이내의 숫자이지만 0~100 범위 이외의 숫자라면 false. 0~100 범위 내의 숫자라면 true 
						 
			 
			 if(!bool) {
			 // ^^^^^^ bool이 false 입니까?	 (느낌표는 not을 의미)
				 sc.close();  //프로그램 종료 return문을 쓰기 전에 써줄 것.
				 return;	  //main 메소드에서 작업 중인 것을 종료하라는 의미. 즉, 프로그램을 종료하라는 의미
			 }	//true일 때 실행 블록. bool이 false가 맞아요. 그렇다면 이 블록을 실행.
			 else {
				 score.kor = kor; 
			 }
			 			 
			/*  위의 코드와 실행동작은 동일하지만 좀더 심플한 버전의 코드
			 if(!score.checkScore(kor)) {
			 	sc.close();
			 	return;
			 	}
			 else {
			 	score.kor = kor;
			 	}			 
			 */
			 
			 
			System.out.print("4. 영어 : ");
			byte eng = Byte.parseByte(sc.nextLine());
			
			bool = score.scoreCheck(eng);
			
			if(!bool) { 				
				 sc.close();
				 return;
			 } 
			 else {
				 score.eng = eng; 
			 }
			
			
			System.out.print("5. 수학 : ");
			byte math = Byte.parseByte(sc.nextLine());
			
			bool = score.scoreCheck(math);
			
			if(!bool) { 				
				 sc.close();
				 return;
			 } 
			 else {
				 score.math = math; 
			 }
			
			
			inputType = 2;	// inputType 값이 2이라면 나이를 입력하는 중이라고 본다.			
			System.out.print("6. 나이 : ");
			short age = Short.parseShort(sc.nextLine()); // "행복하세요" "9000000" "15" "25"
						
			
			if(!score.checkAge(age)) {
			 	sc.close();
			 	return;
			 	}
			 else {
			 	score.age = age;
			 	}		
			
			
			// 퀴즈 - score.showInfo(); 메소드 만들기
			
			/*
			 === 이순신님의 성적결과 ===
			 1. 학번
			 2. 이름
			 3. 국어성적 : 90
			 4. 영어성적 : 80
			 5. 수학성적 : 78
			 6. 총점 : 248
			 7. 평균 : 82.66666666667
			 8. 학점 : B
			 9. 나이 : 20세	 
			 
			 */
			
			
			score.showInfo();
			
			
			} catch (NumberFormatException e) {
				if(inputType == 1) {
					System.out.println("0~100 범위의 숫자를 입력하세요"); //byte 타입의 매개값을 입력하지 않았을 때 출력됨.
				}
				else if(inputType == 2) {
					System.out.println("나이 입력은 20 이상 50까지만 가능합니다.");
				}					
				e.printStackTrace();
			}

		sc.close();
		
	}

}
