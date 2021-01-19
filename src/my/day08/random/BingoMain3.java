package my.day08.random;

import java.util.Random;
import java.util.Scanner;

public class BingoMain3 {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100
		 * 
		 * 59 50 1번시도 50보다 큰값입니다.
		 * 
		 * 71 2번시도 71보다 적은값입니다.
		 * 
		 * 60 3번시도 60보다 적은값입니다.
		 * 
		 * 58 4번시도 58보다 큰값입니다.
		 * 
		 * 59 5번시도 빙고!! 5번만에 맞추었습니다.
		 * 
		 * 
		 */
		System.out.println("== 빙고게임 ==");
		
		Random rnd = new Random();
		
		int rndNum = rnd.nextInt(100 - 1 +1)+1;
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		do {
			System.out.print("1부터 100 사이의 숫자입력=> ");
			int inputNum = Integer.parseInt(sc.nextLine());
			cnt++;
			
			if(inputNum < rndNum) {
				System.out.println(inputNum+"보다 큰 수 입니다.");
			}
			else if(inputNum > rndNum) {
				System.out.println(inputNum+"보다 작은 수 입니다.");
			}
			else {
				System.out.println(">> 빙고! "+cnt+"번 만에 맞추었습니다. <<");
				sc.close();
				break;	//빙고 맞췄으면 반복문을 탈출해야함
			}
			
		} while (true);
	
	
	
	}//end of main----------------

}
