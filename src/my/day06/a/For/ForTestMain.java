package my.day06.a.For;

public class ForTestMain {

	public static void main(String[] args) {
		
		System.out.println(">> 1. break <<");
		
		for(int i=0; i<10; i++) {
			if(i == 5) break;	//반복 6번째일 때 반복을 멈춰라는 뜻. 0,1,2,3,4,5
								//반복문에서 break를 만나면 가장 가까운 반복문을 벗어난다
			System.out.println(i+1);
			
		}
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~\n");
		
		int cnt = 0;
		
		for(;;) {
			System.out.println(++cnt + "번째 반복");
			if(cnt == 5) {
				break;
			}
		}
		
		
		System.out.println("\n>> 2. continue <<");
		
		for(int i=0; i<10; i++) {
			if((i+1)%2 == 0)//출력하고자 하는 값이 짝수라면
				continue;	//아래로 실행하지말고 위의 증감식으로 올라가라. 아래 출력코드 건너뛰고 위의 i++ 증감식으로 실행순서가 이동된다.
							//continue를 만나면 실행순서가 밑으로 내려가지 않고 가장 가까운 반복문의 증감식으로 이동시켜준다.
			System.out.print((i+1)+" ");
		}
		
		

	}

}
