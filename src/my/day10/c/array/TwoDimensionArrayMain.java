package my.day10.c.array;

public class TwoDimensionArrayMain {

	public static void main(String[] args) {

		//===1차원 배열===
		int[] subjectArr = new int[5];
		
		/*
		 
		 
					---------------------
		index =>	| 0 | 1 | 2 | 3 | 4 | 	1행 5열
				 	---------------------
			 
		 
		 
		 
		 
		 
		 */
		
		//===2차원 배열===
		int[][] pointArr = new int[4][3];
				
		/*
		 
		 
					-------------------------------
		index =>	| [0][0] | [0][1] | [0][2] | 	4행 3열
					-------------------------------
					| [1][0] | [1][1] | [1][2] | 
					-------------------------------
					| [2][0] | [2][1] | [2][2] | 
					-------------------------------
					| [3][0] | [3][1] | [3][2] |
				 	-------------------------------

	 	*/
		
		
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;

		pointArr[1][0] = 40;
		pointArr[1][1] = 50;
	//	pointArr[1][2] = 60;	값을 넣지않으면 방(인덱스)에 0이 들어간다

		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
	//	pointArr[3][0] = 100;
	//	pointArr[3][1] = 110;
	//	pointArr[3][2] = 120;

		
		System.out.println("pointArr.length => "+pointArr.length);
		// pointArr.length => 4
		//이차원배열명.length => 행의길이가 나온다.

		System.out.println("pointArr[0].length => "+pointArr[0].length);
		// pointArr[0].length => 3
		//이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
		
		System.out.println("pointArr[1].length => "+pointArr[1].length);
		// pointArr[1].length => 3
		//이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
		
		System.out.println("pointArr[3].length => "+pointArr[3].length);
		// pointArr[3].length => 3
		//이차원배열명[행의인덱스].length => 그 행에 존재하는 열의 길이가 나온다.
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<pointArr.length; i++) {	//행
			
			for(int j=0; j<pointArr[i].length; j++) {	//열
				String str=(j<pointArr[i].length-1)?",":"";
				System.out.printf("%2d%s", pointArr[i][j], str);
			}// end of for----------------

			System.out.print("\n");
			
		}// end of for----------------
		

		System.out.println("\n================ 성적 결과 ================\n");

						//  국어,영어,수학
		int[][] scoreArr = {{90,80,70},		//한 중괄호가 한 사람의 시험 성적
							{80,85,76},
							{85,70,90},
							{60,80,50}};	// 4행 3열. 학생 수 4명 시험과목 3개

		int[] totalArr = new int[scoreArr.length];		// 각 학생들의 총점을 저장
		
		int[] subjectTotalArr = new int[3];		// 각 학생들의 총점을 저장
		//각 과목별 총점을 저장시켜두는 곳
		//subjectTotalArr[0] = 0
		//subjectTotalArr[1] = 0
		//subjectTotalArr[2] = 0
		
		
		//1. 각 학생별로 총점을 나타내어 보자
		for(int i=0; i<scoreArr.length; i++) {
			
			int sum=0;
			for(int j=0; j<scoreArr[i].length; j++) {
				
				sum += scoreArr[i][j];
				
			}//end of for---------------------
			
			totalArr[i] = sum;
			
			
		}//end of for---------------------
		
		
		for(int total : totalArr) {
			System.out.println(total);
		}
		
		/*
		 240
		 241
		 245
		 190 
		 
		 */
		
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		
		System.out.println("== Quiz 과목별 총점 구하기 ==");
		System.out.println("== 내가 한 문제 풀이 ==");
		// 내가 한 문제 풀이
		for(int i=0; i<scoreArr[0].length; i++) {
			
			//국어 총합
			/*
			scoreArr[0][0]
			scoreArr[1][0]
			scoreArr[2][0]
			scoreArr[3][0]
			*/
			//영어 총합
			/*
			scoreArr[0][1]
			scoreArr[1][1]
			scoreArr[2][1]
			scoreArr[3][1]
			*/
			
			//수학 총합
			/*		
			scoreArr[0][2]
			scoreArr[1][2]
			scoreArr[2][2]
			scoreArr[3][2]
			*/
			int sum = 0;
			for(int j=0; j<scoreArr.length; j++) {
				sum += scoreArr[j][i];				
			}//end of for-----------------------
					
			subjectTotalArr[i]=sum;
			
		}
		
		for(int subjectTotal : subjectTotalArr) {
			System.out.println(subjectTotal);
		}
		
		
		System.out.println("=== 각 과목별 평균 ===");
		System.out.println("----------------------");
		System.out.println("국어\t영어\t수학");
		System.out.println("----------------------");
		
		String result = "";
	      for(int total : subjectTotalArr) {
	         double avg = Math.round( ((double)total/scoreArr.length) * 10)/10.0;
	         result += avg+"\t";
	      }
	      
	      System.out.println(result);
		
		
	      System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

	      	//===2차원 배열===
			int[][] numArr = new int[4][];	//4행 null열
					
			/*
			numArr[0][0] = 10;	// 열의 크기를 설정하지 않았으므로 NullPointerException 오류
				numArr[0][1] = 20;
				numArr[0][2] = 30;
			*/
			
			numArr[0] = new int[3];	// 0행 열 3개
			numArr[1] = new int[2]; // 1행 열 2개
			numArr[2] = new int[4]; // 2행 열 4개
			numArr[3] = new int[3]; // 3행 열 3개

			numArr[0][0] = 10;
			numArr[0][1] = 20;
			numArr[0][2] = 30;
			
			numArr[1][0] = 40;
			numArr[1][1] = 50;
//			numArr[1][2] = 60;	// 존재하지 않는 열 ArrayIndexOutOfBoundsException 오류

			numArr[2][0] = 70;
//			numArr[2][1] = 0;   //값을 안 넣어주더라도 default로 0이 들어간다
			numArr[2][2] = 90;
			
			
			for(int i=0; i<numArr.length; i++) {
				
				for(int j=0; j<numArr[i].length/*열 수*/; j++) {
					String str =(j<numArr[i].length-1)?",":"";
					System.out.printf("%2d%s",numArr[i][j],str);
				}
				System.out.print("\n");
			}//end of for-----------------------------
			
			
 	        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
 	        
			int[][] numArr2 = { {10,20,30},
								{40,50},
								{70,0,90,0},
								{0,0,0}};

			for(int i=0; i<numArr2.length; i++) {
				
				for(int j=0; j<numArr2[i].length/*열 수*/; j++) {
					String str =(j<numArr2[i].length-1)?",":"";
					System.out.printf("%2d%s",numArr2[i][j],str);
				}
				System.out.print("\n");
			}//end of for-----------------------------
			
			
	}//end of main

}
