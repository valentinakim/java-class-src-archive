package my.day09.b.array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MoneyCommaMain3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("▷금액을 입력하세요(정수로만) => ");

		long money = Long.parseLong(sc.nextLine());
		
		
		DecimalFormat df = new DecimalFormat("#,###");
		String smoney = df.format(money);
		
		System.out.println(smoney);		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//Quiz. 배열 사용하여 숫자 세자리마다 콤마 찍기.(hint: 공백 제거 메소드 참조)
		
		System.out.print("▶금액을 입력하세요(정수로만) => ");
		String inputStr = sc.nextLine();	//	123456789		23456789
		
		int len = inputStr.length();		// len => 9			len => 8
		int commaCount = len/3;				// commaCount => 3	commaCount => 2
		
		if (len%3 == 0) commaCount-=1;		// commaCount => 3-1commaCount => 2
											//3의 배수이면 1 빼준다. 숫자의 맨 앞에는 콤마를 붙이지 않기 때문 (,123,456,789 이렇게 쓰지 않는다)
		
		char[] inputchArr = inputStr.toCharArray();

		/*
		 	-------------------------------------			----------------------------------
데이터값	 	| 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |			| 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
		 	-------------------------------------			----------------------------------
		
index		  0   1   2   3   4   5   6   7   8				  0   1   2   3   4   5   6   7	
		 	
		 */
		
		
		char[] outputChArr = new char[len+commaCount];	//new char[9+2];	new char[8+2]
		
		/*
		 	---------------------------------------------			-----------------------------------------
		 	| 1 | 2 | 3 | , | 4 | 5 | 6 | , | 7 | 8 | 9 |			| 2 | 3 | , | 4 | 5 | 6 | , | 7 | 8 | 9 |
		 	---------------------------------------------			-----------------------------------------
index   	  0   1   2   3   4   5   6   7   8   9   10			  0   1   2   3   4   5   6   7   8   9 	
콤마 들어올 index => 7번 3번													6번 2번	 
		 */
		
		int cnt = 0;
		for(int i=outputChArr.length-1, j=inputchArr.length-1; i>=0; i--, j-- ) {	//i는 인덱스번호. outputChArr.length가 11이기 때문에 1 감해준다
			//반복횟수가 4의 배수일 때마다 콤마를 찍어주면 됨
			cnt++;
			
			if(cnt%4 != 0) {
				outputChArr[i] = inputchArr[j];	// outputChArr[10] = inputChArr[8];
												// outputChArr[9] = inputChArr[7];
												// outputChArr[8] = inputChArr[6];
												
										
												// outputChArr[6] = inputChArr[5];
												// outputChArr[5] = inputChArr[4];
												// outputChArr[4] = inputChArr[3];
										
												// outputChArr[2] = inputChArr[2];
												// outputChArr[1] = inputChArr[1];
												// outputChArr[0] = inputChArr[0];
			}
			else {	//콤마 찍기
				outputChArr[i] = ','; // outputChArr[7] = ',';
									  // outputChArr[3] = ',';
				j++;		//콤마를 찍고 나서는 1 증가 시켜서 다시 index번호를 복귀시켜준다 콤마에는 숫자 데이터가 안 들어가기 떄문에
			}
		}//end of for------------------
		
		String result = "";
		for(int i=0; i<outputChArr.length; i++) {
			result += outputChArr[i];
		}
		
		System.out.println(result);
		
		
		
		
		sc.close();
		
	}

}
