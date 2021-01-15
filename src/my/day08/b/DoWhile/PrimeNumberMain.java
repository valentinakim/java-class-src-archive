package my.day08.b.DoWhile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeNumberMain {

	public static void main(String[] args) {
		
		// === 소수란? === 
		// 소수란? 1과 자기 자신으로밖에 나누어지지 않는 1 이외의 정수 
		// 예> 1 부터 10까지의 소수를 나타내면 
		//		    2%2 ==> 0   2 는 소수
		//		    3%3 ==> 0   3 는 소수
		//		    4%2 ==> 0   4 는 소수가 아님
		//		    5%5 ==> 0   5 는 소수
		//		    6%2 ==> 0   6 는 소수가 아님
		//		    7%7 ==> 0   7 는 소수
		//		    8%2 ==> 0   8 는 소수가 아님
		//		    9%3 ==> 0   9 는 소수가 아님
		//   10%2 ==> 0  10 는 소수가 아님  
		
		/*
	       ==실행결과==
		    ▷시작 자연수 : 1엔터
		    ▷끝 자연수 : 20엔터 
	     1 부터 20 까지의 소수는?
	     2,3,5,7,11,13,17,19
	     
	     1부터 20 까지의 소수의 개수? 8개  
	     
	     1부터 20 까지의 소수들의 합? 77 
	     
	     === 프로그램 종료 ===      
	   */
		
		Scanner sc = new Scanner(System.in);
		
		int startNum=0, lastNum=0;
		
		
		do {
			try {
			
				System.out.print(" ▷시작 자연수 : ");
				startNum = sc.nextInt(); //넣을 수 있는 입력값 경우의 수 : 1 , 1.345 , 모카
				sc.nextLine(); // nextInt()의 leak을 방지하기위해서..
				
				
				System.out.print(" ▷끝 자연수 : ");
				lastNum = sc.nextInt();
				sc.nextLine();
				
				if(startNum < 1 || lastNum < 1) {	// 두개중 하나가 자연수가 아니라면
					System.out.println(">> 입력값은 모두 자연수여야 합니다. <<\n");
				}
				else {	// startNum과 latNum 이 모두 1 이상의 값을 입력했다면
					break;	//올바르게 입력했다면  do while문 탈출
				}
			} catch (InputMismatchException e) {
				System.out.println(">> 자연수만 입력하세요 <<");
				sc.nextLine();
			}
		} while (true);	//무한반복문
		
		///////////////////////////////////////////////////////////////////
		
		// startNum ==> 1		5
		// lastNum ==> 20		20
		// 1부터 20까지의 소수 구하기
		
		String resultStr="";
		int cnt=0;
		int sum=0;
		
		
		for(int i=startNum; i<=lastNum; i++) {
			
			if(i==1)	//i가 소수인지아닌지 검사할 대상임. 
				continue;	//1은 소수가 아니므로 건너뛴다
			
			
			/*
			 	나누기를 했을 때 나머지가 얼마인지 일일이 검사를 한다.
			 	만약 i가 2라면 ==> 2는 소수
			 	만약 i가 3라면 ==> 3%2	소수
			 	만약 i가 4라면 ==> 4%2 ==0	소수가 아니다	4%3 검사할 필요 X
			 	만약 i가 5라면 ==> 5%2 5%3 5%4 	소수
			 	만약 i가 9라면 ==> 9%2 9%3 ==0	소수가 아니다	9%3 검사할 필요 X
			 	
			 */	
			
				boolean isSosu = true;
				
			 	for(int j=2; j<i; j++) {		//j는 분모에 들어갈 값
			 		if(i%j == 0) {	//검사대상인 i가 소수가 아닌 경우
			 			isSosu = false;		//소수가 아님을 표시한다
			 			break;		
			 		}
			 	}
			 	
			 	if(isSosu) {	//검사대상인 i가 소수라면
			 	// ^^^^^^ 위의 for문에서 정수가 소수여서 true가 되면 아래 실행문이 동작되면서 isSosu = false값이 저장된다
			 		cnt++;	//소수의 개수
			 		sum += i; 	//소수들의 누적합계;
			 		
			 		// 235711131719
			 		//,2,3,5,7,11,13,17,19
			 		// 2,3,5,7,11,13,18,19
			 		
			 		String comma = (cnt > 1)?",":"";	//두번ㄴ째 나오는 소수부터는 소수 앞에 콤마
			 		resultStr += comma + i; 
			 		
			 	}
			
		}//end of for---------------------
		
		
		
		System.out.println(startNum+"부터 "+lastNum+"까지의 소수는?\n"+resultStr);
		System.out.println(startNum+"부터 "+lastNum+"까지의 소수의 개수? "+cnt+"개");
		System.out.println(startNum+"부터 "+lastNum+"까지의 소수들의 합? "+sum);
		
		
		sc.close();
		System.out.println("=== 프로그램 종료 ===");

		
	}
}
