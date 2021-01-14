package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner5Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputStr = "";
		
		try {
			System.out.println("== 2개의 숫자를 입력받아서 더한 결과 알아보기 ==");
			
			System.out.print(">> 첫번째 정수 입력 : ");
			inputStr = sc.nextLine();	// 문자열 10 입력
			
			int num1 = Integer.parseInt(inputStr);	//10을 int 타입으로 변환
			
			System.out.print(">> 두번째 정수 입력 : ");
			inputStr = sc.nextLine();	// 문자열 20 입력
			
			int num2 = Integer.parseInt(inputStr);	//20을 int 타입으로 변환
			
			
			Calculator calc = new Calculator();
			String result = calc.plus(num1, num2);
			// 10+20=30
			System.out.println(result);
			
			result = calc.minus(num1, num2);
			System.out.println(result);
			
			result = calc.multiply(num1, num2);
			System.out.println(result);
			
			result = calc.devide(num1, num2);
			System.out.println(result);
			
			
			
			
		} catch (NumberFormatException e) {
			System.out.println(">> " + inputStr + "은(는) 정수가 아닙니다. 정수만 입력하세요 <<");
			
		}
		
				
		

		sc.close();
	}

}
