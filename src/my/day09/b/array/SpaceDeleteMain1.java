package my.day09.b.array;

public class SpaceDeleteMain1 {

	public static void main(String[] args) {

		//입사문제 : 문자열 중 공백 제거하기
		String str = "  korea   seou l 쌍용 강북 교육센터  ";
		System.out.println(str);
		char[] chArr = str.toCharArray();
		
		/*	chArr
		 	--------------------------------------------------------------------------------------------------------------------
		 	|' '|' '|'k'|'o'|'r'|'e'|'a'|' '|' '|' '|'s'|'e'|'o'|'u'|' '|'l'|' '|'쌍'|'용'|' '|'강'|'북'|' '|'교'|'육'|'센'|'터'|' '|
		 	--------------------------------------------------------------------------------------------------------------------
		 
		 
		 */
		
		int len = 0;
		for(int i=0; i<chArr.length; i++) {
			if(chArr[i] != ' ')
				len++;
		}
		char[] resultchArr = new char[len];
		
		/*	resultchArr
	 	----------------------------------------------------------------------------
	 	|'k'|'o'|'r'|'e'|'a'|'s'|'e'|'o'|'u'|'l'|'쌍'|'용'|'강'|'북'|'교'|'육'|'센'|'터'|
	 	----------------------------------------------------------------------------
	 
	 
	 */
		
		
		for(int i=0, j=0; i<chArr.length; i++, j++) { //char.length; ==> 29
			if(chArr[i] != ' ') {
				resultchArr[j] = chArr[i];
				// resultchArr[0] ~ resultchArr[17]  
				// java.lang.ArrayIndexOutOfBoundsException ==> 배열크기를 초과한 경우 발생하는 오류
				
			}
			else {
				j--;	// --1
			}
		}//end of for------------------------------
		
		System.out.println(String.valueOf(resultchArr));
		
		// System.out.println(len); ==> 18 (공백이 아닌 글자 수) 
		// "koreaseoul쌍용강북교육센터 ";
		
		
	}//end of Main-------------------------------

}
