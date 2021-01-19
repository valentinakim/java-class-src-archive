package my.day08.random;

import java.util.Random;
import java.util.Scanner;

public class RandomMain2 {

	public static void main(String[] args) {

		// === 랜덤한 정수를 뽑아본다 ===
		
		// 보안상 Math.random()보다는 new Random();을 사용하는 것이 더 안전하다.
		
		Random rnd = new Random();
		
		//int rndNum = rnd.nextInt(마지막수 - 처음 수 +1)+처음수;
		
		int rand1 = rnd.nextInt(10 - 1 +1)+1;
		System.out.println("\n1부터 10까지 중 랜덤하게 발생한 값 : "+rand1);
		
		int rand2 = rnd.nextInt(7 - 3 + 1)+3;
		System.out.println("3부터 7까지 중 랜덤하게 발생한 값 : "+rand2);
		
		int rand3 = rnd.nextInt('z' - 'a' + 1)+'a';
		System.out.println("a부터 z까지 중 랜덤하게 발생한 소문자 : "+(char)rand3);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// 인증키 구성 : 랜덤한 숫자3개, 랜덤한 소문자4개
		// 숫자 범위 : 0~9, 영문자 범위 : a~z
		String key = "";
		for(int i=0; i<3; i++) {
			int num = rnd.nextInt(9 - 0 + 1)+0;
			key += num;
		}
		for(int i=0; i<4; i++) {
			int num = rnd.nextInt('z' - 'a' + 1)+'a';
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
		int randNum = rnd.nextInt(10 - 1 +1)+1;

		String result = "";
		
		if(selectedNum == randNum%2)
			result = "맞추었습니다.";
		else 
			result = "틀렸습니다.";
		
		System.out.println(result+"랜덤하게 나온 수는 "+randNum+"입니다.");
		
		
		sc.close();
		
		
		
	}

}
