package my.day04.b.scanner;

public class Score {

	String stuNum;
	String name;
	byte kor;
	byte eng;
	byte math;
	
	short age;	// short -32768 ~ 32767     min 20 ~ max 50
	;
			
	boolean scoreCheck(byte jumsu) {
		if ( 0 <= jumsu && jumsu <= 100)
		
			return true;
		else {
			System.out.println("## 점수 입력은 0 이상 100까지만 가능합니다. ##");
			return false;
		} //실행문이 하나만 있다면 중괄호를 쓰지 않아도 괜찮다. 두개 이상이라면 반드시 중괄호 써야함.
	}
		
		//혹은 아래처럼 해도 됨
		/* if (score.kor < 0 || score.kor > 100) { 0보다 작거나 100보다 클 때. 즉 0~100의 범위를 넘어났을 때
		  	  ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ (!(0 <= score.kor && score.kor <= 100)) 위 조건식과 동일한 의미
										  	  //  ^ not을 의미 
			System.out.println("0~100 범위의 숫자를 입력하세요");
			sc.close();
			return;
		} 		 	
	 */
		
	
	boolean checkAge(short age) {
		if (20 <= age && age <= 50)			
			return true;
		else {
			System.out.println("## 나이 입력은 20 이상 50까지만 가능합니다. ##");
			return false;
		}
	}
	
	
	void showInfo() {
		
		String credit = "";

		short total = (short)(kor + eng + math);
		float avg = Math.round(total/3.0f*10)/10.0F;
		// float avg = Math.round((total/3.0f*10)/10.0); 위의 코드와 결과값이 왜 다를까?
		// Math.round()는 my.day05.b.math의 MathMain.java 참조
		
		
		  if(avg >= 90) {
		    	credit = "A";
		    }
		    else if(avg >= 80) {
		    	credit = "B";
		    }
		    else if(avg >= 70) {
		    	credit = "C";
		    }
		    else if(avg >= 60) {
		    	credit = "D";
		    }
		    else {
		    	credit = "F";
		    }
		
		
		System.out.println("=== " + name +"님의 성적결과 ===" + "\n"
				+"1. 학번 :" + stuNum + "\n"
				+"2. 이름 :" + name + "\n"
				+"3. 국어 :" + kor + "\n"
				+"4. 영어 :" + eng + "\n"
				+"5. 수학 :" + math + "\n"
				+"6. 총점 :" + total + "\n"
				+"7. 평균 :" + avg + "\n"
				+"8. 학점 :" + credit + "\n"
				+"9. 나이 :" + age +"세");
	}
	
	
		
	
}

