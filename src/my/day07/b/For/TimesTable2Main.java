package my.day07.b.For;

public class TimesTable2Main {
	/*
	 	== 구구단 ==	 
     2*1=2    3*1=3    4*1=4    ....   9*1=9		9행 8열
     2*2=4    3*2=6    4*2=8    ....   9*2=18
     2*3=6    3*3=9    4*3=12   ....   9*3=27
     2*4=8    3*4=12   4*4=16   ....   9*4=36
     2*5=10   3*5=15   4*5=20   ....   9*5=45
     2*6=12   3*6=18   4*6=24   ....   9*6=54
     2*7=14   3*7=21   4*7=28   ....   9*7=63
     2*8=16   3*8=24   4*8=32   ....   9*8=72
     2*9=18   3*9=27   4*9=36   ....   9*9=81
     */
	
	//row(행) => 줄  col(열) => 단
	public static void main(String[] args) {
		
		System.out.printf("%35s","== 구구단 ==");	//printf(); --> %s에 콤마 뒤 문자열을 넣는다. s는 스트링을 뜻함. %(숫자)s -> 숫자만큼 글자자리를 확보. 숫자가 음수라면 왼쪽정렬 
		System.out.print("\n");
		for(int row=1; row<=9; row++) {	//9행
			
			for(int col=2; col<=9; col++ ) {	//8열
				// System.out.print(col+"*"+row+"="+col*row+"\t");
				System.out.printf(col+"*"+row+"=%-4d",col*row);
											    // ^ decimal. 정수
												//%s, %d, %f(실수)
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
		
	}//end of main------------------------
}
