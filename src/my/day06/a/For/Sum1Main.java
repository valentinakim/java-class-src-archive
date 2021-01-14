package my.day06.a.For;

public class Sum1Main {

	public static void main(String[] args) {

		// 누적의 합 구하기
		
		// 0+1 ==> 1번 반복
		// 0+1+2 ==> 2번 반복
		// 0+1+2+3 ==> 3번 반복
		// 0+1+2+3+4 ==> 4번 반복
		// 0+1+2+3+4+5 ==> 5번 반복
		// 0+1+2+3+4+5+6 ==> 6번 반복
		// 0+1+2+3+4+5+6+7 ==> 7번 반복
		// 0+1+2+3+4+5+6+7+8 ==> 8번 반복
		// 0+1+2+3+4+5+6+7+8+9 ==> 9번 반복
		// 0+1+2+3+4+5+6+7+8+9+10 ==> 10번 반복
		
		
		// 0+1+2+3+4+5+6+7+8+9+10 == 55

		int sum = 0;
				
		for (int i=1; i<=10; i++) {
			sum+=i;	// sum = sum + i;
			
					// sum = 0 + 1;
					// sum = 0 + 1 + 2;
					//		^^^^^^ 첫번째 반복했을 때의 sum값							
		}
						
		System.out.println("1부터 10까지의 누적 합계 : " + sum);	 	//1부터 10까지의 누적 합계 : 55
		
		
		
		
		
		System.out.println("\n====퀴즈 (내가 풀이한 것)====");
		
		int sum2 = 0;
		
		for (int i=1; i<=10; i++) {
			sum2+=i;			
			System.out.print(i+"+");
			if(i == 10) {
				System.out.println("="+sum2);
			}
		}
		
		
		System.out.println("\n====퀴즈 (선생님 풀이)====");

		sum = 0;
		
		String str = "";
		for(int i=1; i<=10; i++) {
			if(i<10)
			str+=i+"+";		// str+=i; str=str+i ==>  str=""+1+"+" ==> "1+"
							// str="1"+2; "12"					str = "1+"+2+"+";  "1+2+"
							// str="12"+3; "123"				str = "1+2+"+3+"+"; "1+2+3+"
							// ....................
							// str="1+2+3+4+5+6+7+8+9"+10;	
			else {
				str+=i;
			}
			sum+=i;
		}
		
		System.out.println(str+"="+sum);
		
		// 1+2+3+4+5+6+7+8+9+10=55
		
		
		
	}

}

