package my.day04.a.scanner;

import java.util.Scanner;

//혹은 import java.util.*; 라고 써도 된다. java.util 패키지에 있는 모든 클래스를 사용하겠다는 의미.

public class Scanner3Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		
		//예외처리
		try {
			String inputStr = sc.nextLine();
			
			//입력받은 문자열(String)을 int 타입으로 형변환 시켜주는 메소드
			int n = Integer.parseInt(inputStr) + 10;
						//			 		   ^ 사칙연산자(문자열 더하기가 아님). intputStr 값에 10을 더한 값이 나옴
			
			System.out.println("입력한 정수에 10을 더한 값 : " + n);		
		} catch (NumberFormatException e) {
			System.out.println(">>> 정수만 입력하세요 <<<");
			e.printStackTrace();    //콘솔상 어디가 오류인지 찾아서 출력해줌. 이걸 쓰지 않으면 따로 콘솔에 오류메세지를 출력하지 않는다.
		}
		
		
		
		
		
		sc.close();
		

	}

}
