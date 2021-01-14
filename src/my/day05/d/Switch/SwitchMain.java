package my.day05.d.Switch;

import java.util.Scanner;

public class SwitchMain {

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
			
			// === switch문 ===
			switch (operator) { // "+" "-" "*" "/" "$$$$"
				case "+":	//operator 값이 "+" 와 같은 경우
					result = String.valueOf(num1 + num2);	//valueOf() -> int타입을 String 타입으로 변환. 괄호 안에 어떤 타입이 와도 String 타입으로 변환해줌.
					break;	//switch문을 빠져나가라
				case "-":	
					result = String.valueOf(num1 - num2);
					break;
				case "*":	
					result = String.valueOf(num1 * num2);
					break;
				case "/":	
					if(num2 == 0) {
						System.out.println(">> 분모에는 0이 올 수 없습니다. <<");
						sc.close();
						return;
					}
					else
						result = String.valueOf((double)num1 / num2);
					break;
	
				default:  // else와 같은 의미. operator 입력값이 사칙연산자 +,-,*,/ 가 아닌 이외의 값인 경우
					System.out.println(">> 사칙연산자(+ - * /)만 입력하세요 <<");
					sc.close();
					return;
				//	break;   return문으로 프로그램이 종료 되었으므로 break는 빼야한다
			} //end of switch
			
			
			
			System.out.println(num1 + operator + num2 + "=" + result);
			
			} catch (NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요 <<");
			}
				
		sc.close();

	} // end of main ---------------------------------------

}
