package my.day05.d.Switch;

public class Score {
	
	//field
	String stuNum;
	String name;
	int kor;
	int eng;
	int math;
	
	
	
	//method
	int total() {
		return kor+eng+math;
	}
	
	float avg() {
		return Math.round(total()/3.0f*10)/10.0f;	//swtich문에서 float 타입을 사용할 수 없기 때문에 
		
	}
	
	String grade() {		
		
		// avg() ==> 100.0	96.7	91.3	90.0 ==> "A"
		// avg() ==> 89.7	81.3	80.0 		 ==> "B"
		// avg() ==> 79.7	71.3	70.0 		 ==> "C"
		// avg() ==> 69.7	71.3	60.0		 ==> "D"
		// avg() ==> 나머지				 		 ==> "F"
		
		// (int)avg() ==> 100	96	91	90	 ==> "A"
		// (int)avg() ==> 89	81	80		 ==> "B"
		// (int)avg() ==> 79	71	70 		 ==> "C"
		// (int)avg() ==> 69	71	60		 ==> "D"
		// (int)avg() ==> 나머지				 ==> "F"

		// (((int)avg())/10) ==> 100/10	96/10	91/10	90/10 ==> "A"
		// (((int)avg())/10) ==> 89/10	81/10	80/10		  ==> "B"
		// (((int)avg())/10) ==> 79/10	71/10	70/10		  ==> "C"
		// (((int)avg())/10) ==> 69/10	61/10	60/10		  ==> "D"
		// (((int)avg())/10) ==> 나머지			   			  ==> "F"
		
		// (((int)avg())/10) ==> 10		9		9		9	  ==> "A"
		// (((int)avg())/10) ==> 8		8		8			  ==> "B"
		// (((int)avg())/10) ==> 7		7		7			  ==> "C"
		// (((int)avg())/10) ==> 6		6		6			  ==> "D"
		// (((int)avg())/10) ==> 나머지			   			  ==> "F"
		
		String grade = "";
		
		switch (((int)avg())/10) {	// ()괄호속에 쓸 수 있는 데이터 타입 : String, byte, short, int, char
									// 실수타입(float, double) 쓸 수 없다 key와 value값이 정확히 일치해야만 실행문이 동작되지만 실수 타입에는 오차의 여지가 있어서..
									// long 타입도 X
			case 10:
			case 9:		// (((int)avg())/10) / 값이 10 또는 9라면 
				grade = "A";
				break;
				
			case 8:
				grade = "B";
				break;
			
			case 7:
				grade = "C";
				break;
				
			case 6:
				grade = "D";
				break;							
				
			default:
				grade = "F";
				break;
			}
			
			return grade;
					
	}
	
	// 학점이 "A" 라면 "놀이공원이용권, 치킨, 피자, 아이스크림"
	// 학점이 "B" 라면 "치킨, 피자, 아이스크림"
	// 학점이 "C" 라면 "피자, 아이스크림"
	// 학점이 "D" 라면 "아이스크림"
	// 학점이 "F" 라면 "꿀밤3대"
	
	String gift() {
		
		/*
		String result = "안녕";
		result += "하세요";	// result + "하세요" 를 먼저 연산하고 이 값을 result에 대입하는 것. result = result + "하세요";
		*/
		
		String gift = "";
		
		switch (grade()) {
			case "A":
				gift += "놀이공원이용권,";	// gift = gift + "놀이공원이용권"; 
				
			case "B" :	//학점이 B라면은 이 실행문부터 동작이 시작됨. 따라서 '놀이공원이용권'을 빼고 그 이후의 상품까지 다 출력됨.
				gift += "치킨,";	// gift = gift + "치킨";
				
			case "C" :
				gift += "피자,";	// gift = gift + "피자";
				
			case "D" :
				gift += "아이스크림";	// gift = gift + "아이스크림";
				break;	//break;를 만나야만 switch문을 빠져나감
				
			default:
				gift += "꿀밤3대";
				break;
	
		}
		return gift;
	}
	
	
	
}
