package my.day08.b.DoWhile;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {

		
		// 입사문제
		/*
		  >> 알고 싶은 팩토리얼 수 입력 => 5
		  >> 5! ==> 5*4*3*2*1 = 120
		*/

		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			try {
				
				System.out.print(">> 알고 싶은 팩토리얼 수 입력 ==> ");
				int num = Integer.parseInt(sc.nextLine());
				
				if(num <= 0) {
					System.out.println("! 자연수만 입력하세요 !");
					continue;	//다시 try 문으로 올라간다
				}
				
				int result = 1;
				for(int i=num; i>0; i--) {
					result*=i;
				}//end of for---------------
				
				System.out.println(num+"! =" + result);
				
				
				break;
			} catch (NumberFormatException e) {
				System.out.println("! 정수만 입력하세요 !");
			}
			
		} while(true);
		
		sc.close();
		System.out.println("=== 프로그램 종료 ===");
	}

}
