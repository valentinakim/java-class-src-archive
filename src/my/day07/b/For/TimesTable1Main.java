package my.day07.b.For;

import java.util.Scanner;

public class TimesTable1Main {

	/*
	 * >> 몇단볼래? => 8엔터
	 * 
	 * === 8단 === 8*1=8 8*2=16 8*3=24 8*4=32 8*5=40 8*6=48 8*7=56 8*8=64 8*9=72
	 * 
	 * >> 또 하시겠습니까?[Y/N] = y엔터 또는 Y엔터
	 * 
	 * >> 몇단볼래? => 3엔터 (2~9 이외의 숫자나 문자 입력시 ex)1.34, 235, 모카(x)) >> 2단부터 9단까지만 가능합니다
	 * 
	 * 
	 * 
	 * === 3단 ===
	 * 
	 * >> 또 하시겠습니까?[Y/N] = n엔터 또는 N엔터 (Y,N이외의 문자 입력시) >> Y 또는 N 만 가능합니다
	 * 
	 * ==프로그램 종료==
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * === 레이블 이용하여 break; 하기 === 레이블명 뒤에는 : 을 붙이며 반드시 반복문 앞에 써야 한다
		 */
		outer:
		// ^^^레이블명
		for (;;) {
			try {
				System.out.print(">> 몇단볼래? => ");

				String strNum = sc.nextLine();
				int num /* 몇단인지 숫자입력 */ = Integer.parseInt(strNum);

				if (2 <= num && num <= 9) {
					// 해당 단 출력
					System.out.println("=== " + num + " ===");
					for (int i = 0; i < 9; i++) {
						System.out.println(num+"*"+(i+1)+"="+num*(i+1));						
					}

					for (;;) {
						System.out.print(">> 또 하시겠습니까?[Y/N]");
						String yn = sc.nextLine();

						// yn <== "n" 또는 "N"
						if ("N".equalsIgnoreCase(yn)) { // equalsIgnoreCase() => 대소문자 구분없이 데이터가 동일한지 판단
							sc.close(); // N을 입력하면 더이상 반복하지 않고 프로그램 종료가 되기때문에 여기서 스캐너를 닫아준다
							break outer; // 가장 바깥의 for문을 빠져나와야한다. 그래야 프로그램 종료됨. ==> 레이블 이용
						//  ^^^^^^^^^^^^ outer라고 선언된 for문을 빠져나감.
						}
						// yn <== "n" 또는 "Y"
						else if (!"Y".equalsIgnoreCase(yn)) { // Y,n 이외의 다른 문자열이 입력되었을때. yn이 "y","Y","n","N"를 제외한 글자. 바로
																// 위의 if문에서 N,n값에 대한 조건식이 있으므로
							break; // break;와 가장 가까운 for문을 빠져나간다.
						} else {
							System.out.println(">>Y 또는 N 만 가능합니다");
						}
					} // end of for-------------------------------

				}

				else {
					System.out.println(">> 2부터 9까지의 숫자만 입력가능합니다.");
				}

			} catch (NumberFormatException e) {
				System.out.println(">> 2부터 9까지의 숫자만 입력가능합니다.");
				break;
			}

		}

		System.out.println("\n== 프로그램 종료 ==");

	}

}
