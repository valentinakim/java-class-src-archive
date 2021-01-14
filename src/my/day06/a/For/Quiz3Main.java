package my.day06.a.For;

public class Quiz3Main {

	public static void main(String[] args) {
		
		System.out.println("1에서 10까지 출력하기");
		
		for(int i=0; i<10; i++) {
			String str = (i<9)?",":"";
			System.out.print((i+1)+str);
		}
		//1,2,3,4,5,6,7,8,9,10

		System.out.println("\n===========================");

		System.out.println("5부터 13까지 출력하기(반복횟수 10회)");
		//방법1
		for(int i=0, j=5; i<10; i++, j++) {	//처음 시작하는 숫자를 변수 j에 초기값으로 넣어준다
			String str = (i<9)?",":"";
			System.out.print(j+str);
		}
		System.out.println("");

		//방법2		
		for(int i=5; i<15; i++) {
			String str = (i<14)?",":"";
			System.out.print(i+str);
		}
		//5,6,7,8,9,10,11,12,13
		
		System.out.println("\n===========================");
		System.out.println("1부터 20까지의 숫자 중 3의배수만 출력하기");

		for(int i=1; i<=20; i++) {
			if(i%3 != 0) {
				continue;
			}			
			String str = (i<=17)?",":"";
			System.out.print(i+str);
		}
		//3,6,9,12,15,18
		System.out.println("");
		System.out.println("1부터 20까지의 숫자 중 3의배수의 더하기 연산식 출력");
		
		for(int i=1; i<=20; i++) {
			if(i%3 != 0) {
				continue;
			}			
			String str = (i<=17)?"+":"";
			System.out.print(i+str);
		}
		
		
		System.out.println("\n===========================");	
		System.out.println("1부터 20까지의 숫자 중 3의배수 더하기 연산식과 합계 출력");
		
		String result = "";
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%3 != 0) continue;
			String str = (i<=17)?"+":"";
			result += i+str;
			sum += i;
		}
		System.out.println(result+"="+sum);

	}//end of main-----------------------------

}
