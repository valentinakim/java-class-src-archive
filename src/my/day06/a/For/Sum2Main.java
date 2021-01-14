package my.day06.a.For;

import java.util.Scanner;

public class Sum2Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;	//sum은 누적 합계 값을 저장하는 변수. 0으로 초기화.
		String str = "";	//누적되어질 숫자와 +를 문자열로 결합해서 저장하는 변수. ""로 초기화.
		
		for(;;) {
			
		
		
			try {
				System.out.print("누적해야할 시작 숫자 => ");
				int startNum = Integer.parseInt(sc.nextLine());
				// startNum ==> 1	2	3
				
				System.out.print("누적해야할 마지막 숫자 => ");
				int endNum = Integer.parseInt(sc.nextLine());
				// endNum ==> 10	9	5
				
				
				
				int cnt = endNum - startNum + 1; // 반복해야할 횟수
				
				for(int i=0, j=startNum; i<cnt; i++, j++) {	//i는 반복하는 횟수
					
					if(i < cnt-1) {// 맨 마지막 숫자 제외하고 다 + 붙여주기					   
						str += j+"+";
					}
					else {
						str += j;
					}
					sum += j;	//sum=sum+j;  
				}
				
					
				
				/* 내가 한 퀴즈 풀이
				sum = 0;
				
				String str = "";
				for(int i=startNum; i<=endNum; i++) {
					if(i<endNum)
						str+=i+"+";		
					else {
						str+=i;
					}
					sum+=i;
				}
				
				System.out.println(str+"="+sum);
				*/
								
				break;	//위의 두 정수값을 잘못 넣으면은 아래에 오류메시지 출력 부분으로 넘어가서 오류메세지 출력 후 다시 try 실행문 첫째줄로 돌아가지만
						//올바르게 두 값을 넣으면은 break문을 만나면서 for문을 빠져나오게 된다.
				
			} catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요 <<");
			}
		
		}//end of for------------------		
		
		
		System.out.println(str+"="+sum);		
		
		
		
		
		sc.close();
		System.out.println("\n==프로그램 종료==");
	}

	
}
