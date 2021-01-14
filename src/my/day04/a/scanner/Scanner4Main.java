package my.day04.a.scanner;

import java.util.Scanner;

public class Scanner4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("== 2개의 숫자를 입력받아서 더한 결과 알아보기 ==");
		
		String inputStr = ""; //try 블록 안에서 쓰면 지역변수가 되어지기 때문에  catch 블록에서 사용할 수가 없다. 
							  //따라서 두 블록 밖에서 이 필드 초기화를 시켜주면 두 블록 둘다 사용가능
		
		try {
			System.out.print("1. 첫번째 정수 : ");
			inputStr = sc.nextLine();
			int num1 = Integer.parseInt(inputStr);
			
			System.out.print("2. 두번째 정수 : ");
			inputStr = sc.nextLine();
			int num2 = Integer.parseInt(inputStr);
			
			System.out.println(">> 더한결과 : " + num1 + "+" + num2 + "=" + (num1 + num2));
			
		} catch(NumberFormatException e) {
			System.out.println(">> " + inputStr + "은(는) 정수가 아니므로 정수로 입력하세요! <<");
			
		}
		
		

		sc.close();
	}

}
