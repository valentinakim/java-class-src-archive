package my.day04.a.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

//혹은 import java.util.*; 라고 써도 된다. java.util 패키지에 있는 모든 클래스를 사용하겠다는 의미.

public class Scanner2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 => ");
		
		
		//예외처리
		try {
			int inputNum = sc.nextInt();	//스캐너가 정수값을 입력받아서 매개 변수 inputNum에 값을 저장
			sc.nextLine();					//정수값 입력받은 후 스캐너는 종결자 이후 내용 모두 삭제
			
			System.out.println("입력한 정수 : " + inputNum);		//문자열과 저장된 inputNum의 매개값 출력
		} catch (InputMismatchException e) {
			System.out.println(">>> 정수만 입력하세요 <<<");
			e.printStackTrace();    //콘솔상 어디가 오류인지 찾아서 출력해줌
		}
		
		
		
		
		
		sc.close();
		

	}

}
