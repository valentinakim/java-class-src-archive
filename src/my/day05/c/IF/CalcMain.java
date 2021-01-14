package my.day05.c.IF;

import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		
		try {
					
			System.out.print("첫번째 정수 입력 => ");		
			int num1 = Integer.parseInt(sc.nextLine());
			
			System.out.print("두번째 정수 입력 => ");
			int num2 = Integer.parseInt(sc.nextLine());			
			
			System.out.print("사칙연산자 선택(+ - * /) => ");
			String operator = sc.nextLine();
			
			String result = "";
			
			if("+".equals(operator)) {
				result = String.valueOf(num1 + num2);
			}
			else if("-".equals(operator)) {
				result = String.valueOf(num1 - num2);
			}
			else if("*".equals(operator)) {
				result = String.valueOf(num1 * num2);
			}
			else if("/".equals(operator)) {
				if(num2 == 0) {
					System.out.println(">> 분모에는 0이 올 수 없습니다. <<");
					sc.close();
					return;
				}
				else
					result = String.valueOf((double)num1 / num2);				
			}
			else { //사칙연산자 이외의 문자를 입력하는 경우
				System.out.println(">> 사칙연산자(+ - * /)만 입력하세요 <<");
				sc.close();
				return;
			}
			
			//삼항 연산자
			/*
			  if(num2 == 0) {
			   result = "분모에는 0이 올 수 없습니다."
			   }
			   else
			   	 result = String.valueOf((double)num1 / num2);
			  
			 result = ("/".equals(operator) && num2 == 0) ? result : num1 + operator +num2 + "=" + result; 
													//      ^^^^^^ (분모 0 올수없습니다 메세지)			   ^^^^^^ String.valueOf((double)num1 / num2)
				System.out.println(result);
			 */
			
			
			System.out.println(num1 + operator + num2 + "=" + result);
			
			} catch (NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요 <<");
			}
				
		sc.close();
	} //end of main-----------------------------------------

}
