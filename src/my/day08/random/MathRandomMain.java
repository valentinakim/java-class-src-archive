package my.day08.random;

import java.util.Scanner;

public class MathRandomMain {

	public static void main(String[] args) {

		// === 랜덤한 정수를 뽑아본다 ===
		
		double random = Math.random();
		
		System.out.println("random => " + random);
		
		/*
		java.lang.Math.random() 메소드는 
        0.0 이상 1.0 미만의 실수(double)값을 랜덤하게 나타내어주는 메소드이다. 
                  즉, 0.0 <= 임의의 난수(실수) < 1.0
        
        
                  랜덤한 정수 = (int)(Math.random()*구간범위)+시작값;
        	== 1부터 10까지 중 랜덤한 정수를 얻어와 본다.==
         
         0.0        (int)(0.0*(10-1+1))+1         ==>  1
         0.23346438 (int)(0.23346438*(10-1+1))+1  ==>  3
         0.67835431 (int)(0.67835431*(10-1+1))+1  ==>  7
         0.99999999 (int)(0.99999999*(10-1+1))+1  ==> 10
         
         	== 3 부터 7까지중 랜덤한 정수를 얻어와 본다.==
         
         0.0        (int)(0.0*(7-3+1))+3         ==>  3
         0.23346438 (int)(0.23346438*(7-3+1))+3  ==>  4
         0.67835431 (int)(0.67835431*(7-3+1))+3  ==>  6
         0.99999999 (int)(0.99999999*(7-3+1))+3  ==>  7
        
        
        */
		
		int rand1 = (int)(Math.random()*10-1+1)+1;
		System.out.println("\n1부터 10까지 중 랜덤하게 발생한 값 : "+rand1);
		
		int rand2 = (int)(Math.random()*7-3+1)+3;
		System.out.println("3부터 7까지 중 랜덤하게 발생한 값 : "+rand2);
		
		int rand3 = (int)(Math.random()*('z'-'a'+1))+'a';
		System.out.println("a부터 z까지 중 랜덤하게 발생한 소문자 : "+(char)rand3);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// 인증키 구성 : 랜덤한 숫자3개, 랜덤한 소문자4개
		// 숫자 범위 : 0~9, 영문자 범위 : a~z
		int num = 0;
		String key = "";
		for(int i=0; i<3; i++) {
			num = (int)(Math.random()*9-0+1)+0;
			key += num;
		}
		for(int i=0; i<4; i++) {
			num = (int)(Math.random()*('z'-'a'+1))+'a';
			key += (char)num;
		}
				
		System.out.println("인증키 => " + key);
		
		

		
		
		
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//rand1 ==> 짝수인지 홀수인지 알아내기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("선택[1:홀수/ 0:짝수]");
		String select = sc.nextLine(); //"0" 또는 	"1"
		char ch = select.charAt(0);	   //'0'	 	'1'
									   //48		  	49
									   //48-'0'		49-'0'
										//48-48		49-48
										//0			1
		
		int selectedNum = ch-'0';	// 0 또는 1	char에서 int로 변환
						//   ^^^ char '0'은 int로 값이 48이다.
		int randNum = (int)(Math.random()*10-1+1)+1;

		String result = "";
		
		if(selectedNum == randNum%2)
			result = "맞추었습니다.";
		else 
			result = "틀렸습니다.";
		
		System.out.println(result+"랜덤하게 나온 수는 "+randNum+"입니다.");
		
		
		sc.close();
		
		
		
	}

}
