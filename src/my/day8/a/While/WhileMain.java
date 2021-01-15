package my.day8.a.While;

public class WhileMain {

	public static void main(String[] args) {
		/*
		 * === while 문 형식 ===
		 * 
		 * 변수의 초기화;
		 * 
		 * while(조건식) { 조건식이 참(true)이라면 반복해서 실행할 명령문을 실행하고, 조건식이 거짓(false)이라면 while의 { }
		 * 이부분을 빠져나간다.
		 * 
		 * 반복해서 실행할 명령문; 증감식; }
		 */

		int cnt = 5, loop = 0;

		while (loop < cnt) { // 0<5

			System.out.println((loop+1)+". 1씩 증가(1)");
			loop++;

		} // end of while---------------------
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		cnt = 5; loop = 0;
		while (loop++ < cnt) { // loop가 다른 연산 비교 후에 1 증가.

			System.out.println((loop)+". 1씩 증가(2)");	//위에 조건식에서 true 연산(?) 까지 끝내고 1 증가가 되었으므로 이 줄에서 loop는 1

		} // end of while---------------------
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		cnt = 5; loop = 0;
		while (loop < cnt) {	// loop = 0
			
			System.out.println((++loop)+". 1씩 증가(3)");	// 처음부터 1 증가. 따라서 loop=1 

		} // end of while---------------------
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		loop = 0;
		while (true) {

			System.out.println((++loop)+". 1씩 증가(4)");
			if(loop == 5) break;

		} // end of while---------------------

		System.out.println("== 프로그램 종료 ==");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		loop = 0;
		while ( !(++loop > 5) ) {
			//  ^^^^^^^^^^^^ !( ) 괄호 속에는 while반복문을 빠져나갈 조건식을 정의
			System.out.println(loop+". 1씩 증가 - !( ) 조건으로 반복문 빠져나가기");

		} // end of while---------------------
		
		/*
		 
		 	1. Hi. Oracle~~ 
		 	3. Hi. Oracle~~ 
		 	5. Hi. Oracle~~ 
		 	7. Hi. Oracle~~ 
		 	9. Hi. Oracle~~ 
		 	
		 */
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		loop=0;
		while(true) {
			if(++loop > 10)
				break;
			
			if(loop%2 == 0)
				continue;	// loop가 짝수일 때 실행순서가 아래로 내려가지않고  while문 조건식으로 올라간다
			System.out.println(loop+".Hi.Oracle~~");
		}

		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		
		//내가 짠 코드
		System.out.println("=== 5단만 출력하기 ===");
		
		loop=1; int dan=5;
		while(loop <10) {
			
			System.out.println(dan+"*"+loop+"="+dan*loop++);
		}
		
		//while문으로 구구단 한단 출력하는 방법
		//방법 1
		System.out.println("=== 5단만 출력하기 ===");
		
		loop=0;
		while(++loop < 10) {
			System.out.println("5*"+loop+"="+(5*loop));			
		}
		
		//방법 2
		System.out.println("=== 6단만 출력하기 ===");
		
		loop=0;
		while(true) {
			if(++loop > 9) break;
			System.out.println("6*"+loop+"="+(6*loop));
		}
		
		//방법 3
		System.out.println("=== 7단만 출력하기 ===");
		
		loop=0;
		while(!(++loop > 9)) {	//while문의 탈출조건을 쓴다.
			
			System.out.println("7*"+loop+"="+(7*loop));
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

		System.out.printf("%35s\n","=== 구구단 === ");
		
		// 9행 8열 row col
		
		int jul=0;
		dan=1;
		
		while(!(++jul > 9)) {	//9행
			
			
			while(!(++dan > 9)) {	//8열
				String str = (dan<9)?"\t":"\n";	//dan이 9보다 작으면 탭, 아니면 줄바꿈
				System.out.print( dan+"*"+jul+"="+(dan*jul)+str);
			}
			dan=1;
		}
		
		
		
		
		System.out.println("== 프로그램 종료 ==");
	}

}
