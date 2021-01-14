
package my.day03.b.operator;

public class OperatorMain {
	
	int n2 = 15;	// 인스턴스 변수. 클래스 내에서 모두 사용된다
	
	public static void main(String[] args) {
		
		// === 연산자 === //
		
		// 1. 산술연산자 + - * / %(나머지)
		int n = 10;		//main 메소드 내에서만 사용되는 지역변수
		System.out.println("n+3=" + (n+3));		// n+3=13
		System.out.println("n-3=" + (n-3));		// n-3=7
		System.out.println("n*3=" + (n*3));		// n*3=30
		System.out.println("n/3=" + (n/3));		// n/3=3	정수/정수=정수(몫)
		System.out.println("((double)n)/3=" + ((double)n)/3);		// n/3=3.3333333333333335  (실수 표시)
		//					 ^^^^^^^^^ n을 먼저 실수로 표시 후 3으로 나누기
		System.out.println("n%3=" + (n%3));		// n%3=1
		
		// 2. 증감연산자 ++ --
		
		int a=7, b=3;
		/* 혹은 아래처럼 표시
		 int a=7;
		 int b=3;
		 */
		System.out.println("a => " + a);	//a => 7
		
		// a = a+1; 또는 a++; 같은 말임
		a++;
		System.out.println("a => " + a);	//a => 8
	
		++a;
		System.out.println("a => " + a);	//a => 9
		
		System.out.println("b => " + b);	//b => 3 
		
		// b = b-1; 또는 b--; 같은 말임
		b--;		
		System.out.println("b => " + b);	//b => 2
		
		
		--b;
		System.out.println("b => " + b);	//b => 1
		
		
		
		// !!! 반드시 암기할 것 !!!
		// 후위증감연산자(a++; b--;) : 다른 연산을 다 마친 이후에 1씩 증감한다
		// 전위증감연산자(++a; --b;) : 맨 먼저 1씩 증감을 마친 이후에 다른 연산을 한다
		int x=10, y=10;
		int z=++x;	// ++x; x=x+1; z=11;
		System.out.println("z => " + z);	//11
		System.out.println("x => " + x);	//11
		
		
		z=y++;	// z=y; z=10; y++; y=y+1; y=11
		System.out.println("z => " + z);	// z => 10
		System.out.println("y => " + y);	// y => 11
		
		
		
		// 3. 논리연산자	&(and) |(or)  &&  ||
		/* 수학에서 ∧(and) ∨(or) 
		    T ∧ T ∧ F ==> F
		 	T ∧ T ∧ T ==> T
		 	
		 	T ∨ T ∨ F ==> T
		 	T ∨ T ∨ T ==> T
		 	F ∨ F ∨ F ==> T		 
		 */
		
		int c=50, d=60, e=70;
		
		// &&, ||
		
		boolean bool = (c > d) && (d < e) && (c == e);	//T ∧ T ∧ F ==> F
		System.out.println("bool => " + bool); //bool => false
		// false && 스킵 (결과값이 처음부터 나오면 그 뒤는 연산하지 않고 종료된다)
		
		
		bool = (c > d) || (d < e) || (c == e);	//T ∨ T ∨ F ==> T
		System.out.println("bool => " + bool); //bool => true
		// false || true || 스킵

		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		// &, |
		bool = (c > d) & (d < e) & (c == e);
			 // false  & true    & false (최종 결과값 처음부터 나오든말든 관계없이 끝까지 연산한다)
		System.out.println("bool => " + bool); //bool => false
		
		bool = (c > d) | (d < e) | (c == e);
			//  false  |  true   |   false
		
		
		/*
		 	if(조건) {
		 	 실행해야할 명령;
		 	 }
		 	 ==> 조건이 참일때만 실행문 구동. 거짓이면 구동하지 않음.
		 */
		
		
		
		int n1=10;		
		
		if(n1 < 20) {
			// true
			System.out.println(">> n1은 20보다 작습니다.");
		}
		
		
		// ============= 퀴즈 ===============
		
		System.out.println("\n~~~~~ 퀴즈1 ~~~~~~\n");
		int i=1;    
		int j=i++;  /* i=i+1; i=2; j=2 */
		      
		if( (i > ++j) & (i++ == j) ) { /* (1 > 3) & (2 == 2); false & true >> false */
		//   j=2  2>2 &	  2  == 2	 i=3
		//		false &		true
		// (false)
			i=i+j;
		}
		      
		System.out.println("i="+i);  // i=3
		      
		i=1;    
		j=i++;  /* j=i; j=1; i++; i=2; */
		      
		if( (i > ++j) && (i++ == j) ) {	/* (1 > 3) >> false */   
		//   	 j=2
		//   2 > 2
		//   false	  && 
			i=i+j;
		}
		      
		System.out.println("i="+i);  // i=2
		      
		System.out.println("\n~~~~~ 퀴즈2 ~~~~~~\n");
		      
		int m1=0; 
		n1=1;

		if( (m1++ == 0) | (n1++ == 2)  ) {	/* false or true >> true */
		// 	0 == 0	
		//	true		|   1 == 2 false
		//	m1=1;			n1=2; 
		// 앞에 연산을 다 하고 결과값(true, false) 나온 후에 +1 증가한다 따라서 m1=1
			m1=42;
		}
		      
		System.out.println("m1=>"+m1 + ", n1=>"+n1); // m1 = 42, n1 = 1

		      
		m1=0; 
		n1=1;
		if( (m1++ == 0) || (n1++ == 2) ) {	/* true */ 
		//   0 == 0 true|| 스킵 
		//   m1=1;
			
		     m1=42;
		}
		      
		System.out.println("m1=>"+m1 + ", n1=>"+n1);	// m1 = 42, n1 = 1 
	
		// 4. 비교연산자
		// == 같다, != 같지 않다
		
		// 5. 할당연산자 (연산 후 대입 연산자)
		int no = 1;
		no+=3; // no = no + 3;
		System.out.println("no=" + no); // no=4
		
		no-=2; // no = no - 2; 위에서 no=4가 나왔으므로 4-2를 하면된다
		System.out.println("no=" + no); // no=2
		
		no*=5; // no = no * 5;
		System.out.println("no=" + no); // no=10
		
		no/=4; // no = no / 4;
		System.out.println("no=" + no); // no=2
		
		no%=3; // no = no % 3;
		System.out.println("no=" + no); // no=2
		
		
		// 6. 삼항연산자
		/*
		  변수선언 = (조건식)?값1:값2    
		 초기화할 때 사용되어짐
		 조건식이 true이면 값1을, false면 값2를 변수에 넣는다
		 */
		int num1=50, num2=60;
		int num3=(num1 > num2)?num1:num2;
		
		System.out.println("num3 => " + num3);	//num3 => 60
		
		
		
		
		
	}
	
}
