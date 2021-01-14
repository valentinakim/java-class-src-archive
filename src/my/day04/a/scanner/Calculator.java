package my.day04.a.scanner;

public class Calculator {
	String plus(int num1, int num2) {
				
		return num1+"+"+num2+"="+(num1+num2);
				
	}
	
	String minus(int num1, int num2) {
		
		return num1+"-"+num2+"="+(num1-num2);
		
	}
	
	String multiply(int num1, int num2) {
			
			return num1+"x"+num2+"="+(num1*num2);
			
		}
	
	String devide(int num1, int num2) {
		if(num2 == 0) {
			return "분모에는 0이 들어올 수 없습니다";
		} else {
			return num1+"/"+num2+"="+((double)num1/num2);		
		}
		
	}

	
}
