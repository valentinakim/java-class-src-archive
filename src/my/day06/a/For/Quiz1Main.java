package my.day06.a.For;

public class Quiz1Main {

	public static void main(String[] args) {
		
		String word = "Abz3Sa0#$T";
		
		//글자별 검사의 반복
		
		int upperCnt=0, lowerCnt=0, digitCnt=0, symblCnt=0;
		
		
		System.out.println(word + " 문자열의 길이 : " + word.length()+"\n");
											//  ^^^^^^^^^^^^^ 문자열의 길이. 글자수를 나타낸다 int타입으로 값 돌려준다
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			
			if(Character.isUpperCase(ch)) {	// 대문자인지 검사
				upperCnt++;
			}
			else if(Character.isLowerCase(ch)) { //소문자인지 검사
				lowerCnt++;
			}
			else if(Character.isDigit(ch)) { //숫자인지 검사
				digitCnt++;
			}
			else {
				symblCnt++;
			}
		}	//end of for ----------------
		
		System.out.println(word+"\n"
				+ "대문자 개수 : " + upperCnt + "\n"
				+ "소문자 개수 : " + lowerCnt + "\n"
				+ "숫자 개수 : " + digitCnt + "\n"
				+ "특수기호 개수 : " + symblCnt);
		
		
		for(int i=10; i>0; i--) {
			if(i%2 != 0) //i를 2로 나누었을때의 나머지
				System.out.println(i+".반복횟수가 10번이되 홀수만 출력하기");
			}
		
		//대문자 갯수, 소문자 갯수, 특수기호 갯수 출력하기
		
		/*
		 Abz3Sa0#$T
		 대문자 개수 : 3
		 소문자 개수 : 3
		 숫자 개수 : 2
		 특수기호 : 2
		 */

	}//end of main()--------------------------

}
