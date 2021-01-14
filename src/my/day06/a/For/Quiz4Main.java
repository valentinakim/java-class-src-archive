package my.day06.a.For;

import java.util.Scanner;

public class Quiz4Main {

	public static void main(String[] args) {
		//스캐너 생성
		
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 정수 : 2
		// 두번째 정수 : 10
		
		// >> 결과 <<		
		// 2부터 10까지의 홀수의 합 : 24
		// 2부터 10까지의 짝수의 합 : 30
		
		for(;;) {
			
			try {
				
				System.out.print("첫번째 정수 : ");
				String strNum1 = sc.nextLine();
				int num1 = Integer.parseInt(strNum1);
				
				System.out.print("두번째 정수 : ");
				String strNum2 = sc.nextLine();
				int num2 = Integer.parseInt(strNum2);
				
				int holSum = 0;	//홀수의 누적의 합계를 저장하는 변수
				int jjakSum = 0; //짝수의 누적의 합계를 저장하는 변수

				
				// 홀수의 합
				for(;;) {
					// 홀수의 합을 구하는 경우, 첫번째 입력값이 strNum1 => 2 (짝수)라면
					// strNum1는 1을 더한후(즉, 3) 2씩 증가시켜주면 된다.
					
					// 홀수의 합을 구하는 경우, 첫번째 입력값이 strNum1 => 3 (홀수)라면
					// 바로 2씩 증가시켜주면 된다.
					if(num1%2 == 0) {	//첫번째 입력값이 짝수라면 ex) 2
						num1 = num1+1;	//num1 => 3
					}
					
					if(num1 <=  num2) {	// ex) (9 <= 10) (11 <= 11) 
						holSum += num1;	//누적 해주고  // holSum = 0 + 3 
						
					}
					else {
						break;
					}
					num1 +=2;		// 2증가	  // 5		
				}
				//num1 초기화
				num1 = Integer.parseInt(strNum1);
				
				// 짝수의 합
				for(;;) {
					// 짝수의 합을 구하는 경우, num1 => 1 (홀수)라면
					// num1는 1을 더한후(즉, 2) 2씩 증가시켜주면 된다.
					
					// 홀수의 합을 구하는 경우, 첫번째 입력값이 strNum1 => 3 (홀수)라면
					// 바로 2씩 증가시켜주면 된다.
					if(num1%2 != 0) {	//첫번째 입력값이 홀수라면 ex) 1
						num1 = num1+1;	//num1 => 2 (짝수)
					}
					
					if(num1 <=  num2) {	// ex) (9 <= 10) (11 <= 11) 
						jjakSum += num1;	//누적 해주고  // holSum = 0 + 2 
							
					}
					else {
						break;
					}
					num1 +=2;		// 2증가	  // 4		
				}
				
				System.out.println(">> 결과  <<");
				System.out.println(strNum1 + "부터 " + strNum2 + "까지의 홀수의 합 : " + holSum);
				System.out.println(strNum1 + "부터 " + strNum2 + "까지의 짝수의 합 : " + jjakSum);

				
				sc.close();
				break;
				} catch(NumberFormatException e) {
					System.out.println(">> 정수만 입력하세요 <<");
				}
		
		}//end of for--------------------
		
		
		
		
		
		
		

	}

}
