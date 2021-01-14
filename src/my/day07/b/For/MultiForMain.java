package my.day07.b.For;

public class MultiForMain {

	public static void main(String[] args) {

		//다중 for문에 대해서
		
		/*
		 	abcdefg		3행 7열
		 	hijklmn
		 	opqrstu
		 */
		System.out.println("===다중 for문 이용===");
		char ch = 'a';
		
		for(int i=0; i<3; i++) {// 바깥 for문 ==> 행
					
		
			for(int j=0; j<7; j++) {// 내부 for문 ==> 열
				System.out.print(ch++);
				
			}
			
			System.out.print("\n");
			
		}
		
		
		
		System.out.println("\n===하나의 for문만 이용===");
		
		ch = 'a';
		
		for(int i=0; i<'u'-'a'+1; i++) {
			System.out.print(ch++);
			if((i+1)%7 == 0) {
				System.out.print("\n");
			}			
			
		}
		
		System.out.println("======================");
		
		/*
		 	[0,0][0,1][0,2]		4행 3열
		 	[1,0][1,1][1,2]
		 	[2,0][2,1][2,2]
		 	[3,0][3,1][3,2]		 	
		 */
		
		System.out.println("---내가 한 문제 풀이---");
		int num1 = 0;
		int num2 = 0;
		
		for(int i=0; i<4; i++) {
			
						
			for(int j=0; j<3; j++) {				
				num2++;		
				System.out.print("["+num1+","+num2+"]");
			}
			
			num1++;
			num2 =0;
			System.out.print("\n");

		}
		
		System.out.println("---선생님 풀이---");
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.print("\n");
		}
		
		

		System.out.println("======================");
		//continue continue와 가장 가까운 반복문의 증감식으로 이동
		//continue 레이블명; 레이블명으로 선언된 반복문의 증감식으로 이동
		/*
		 	[0,0][0,1][0,2]		3행 3열
		 	[1,0][1,1][1,2]
		 	[3,0][3,1][3,2]		 	
		 */
		System.out.println("---내가 한 문제 풀이---");

		num1=0;
		num2=0;
		
		
		for(int i=0; i<4; i++) {
			
			if(num1 ==2)
				continue;
			for(int j=0; j<3; j++) {				
				
				num2++;				
				System.out.print("["+num1+","+num2+"]");												
				}
						
			num1++;
			num2 =0;
						
			System.out.print("\n");
			
			}
		
		System.out.println("---선생님 풀이---");
		
		for(int i=0; i<4; i++) {
			if(i==2) continue;
			for(int j=0; j<3; j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.print("\n");
		}	

			
		
		
		System.out.println("======================");
		/*
		 	[0,0][0,2]		4행 2열
		 	[1,0][1,1]
		 	[2,0][2,2]
		 	[3,0][3,1]		 	
	 */
		
		
		System.out.println("---선생님 풀이---");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				if(j==1) continue;
				System.out.print("["+i+","+j+"]");
			}
			System.out.print("\n");
		}	
		
		// 탭 공백 띄우기 : \t
		System.out.println("안녕하세요\t내일\t또 뵐게요~~");
		
		/*
		 	501호	502호	503호	505호	원래는 5행 5열인데 continue로 건너뛰기
		 	301호	302호	303호	305호
		 	201호	202호	203호	205호
		 */

		System.out.println("---선생님 풀이---");
		
		for(int i=5; i>0; i--) {
			if(i==4) continue;
			for(int j=0; j<5; j++) {
				if((j+1)==4) continue;
				System.out.print(i+"0"+(j+1)+"호\t");
			}
			System.out.print("\n");
		}//end of for------------------	
		
		
		
		}

}
