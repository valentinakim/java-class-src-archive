package my.day06.a.For;

public class Quiz2Main {

	public static void main(String[] args) {
		
		String word = "super007Man";
		
		
		
		System.out.println(word + " 문자열의 길이 : " + word.length()+"\n");
				
		// Quiz1. 최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> super
		
		/* 맨처음 한 문제 풀이
		
		System.out.print("최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> ");
		
				
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);			
			
			if(Character.isAlphabetic(ch)) {
				System.out.print(ch);
			}
			else if (Character.isDigit(ch)) {
				break;				
			}			
		}		
		
		for (i=0;)
		String result = "";
		char ch = 'a';
		result += 'a';
		*/
		
		
		String str = "";
		char ch = ' ';
		
		int i=0;
		for(; i<word.length(); i++) {	//word.length(); ==> 11
			ch = word.charAt(i);
						
			if(Character.isDigit(ch)) {
				break;
			}			
			str+=String.valueOf(ch);			
		}		
		
		
		
		
		
		System.out.print("최초로 숫자가 나오는 곳의 앞까지 문자열 출력 ==> " + str);
		
		// Quiz2. 최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> 5 
		
		//int cnt = 0;
		
		for(; i<word.length(); i++) {
			ch = word.charAt(i);
			
			if(Character.isDigit(ch)) {
				break;
			}		
			
			// cnt+=1;
		}
		System.out.println("\n최초로 숫자가 나오는 곳의 앞까지 문자열의 길이 ==> " +i);
		
		// Quiz3. 알파벳 소문자를 출력하되 한글자씩 건너뛰어서 출력하기 (for문 이용)
		// a,c,e,g,i,k,m,o,q,s,u,w,y
		
			i=0;
			int leng = 'z'-'a';
			for(int j=97; i<leng; i++, j++) {
			
			String alphabetStr = String.valueOf((char)j);
			
			if(j%2 == 0) {				
				continue;
			} else if(i < leng-2) {// 맨 마지막 숫자 제외하고 다 + 붙여주기. i가 후위증감이기 때문에 2를 빼줘야한다					   
				alphabetStr += ",";					
			} else {
				alphabetStr += "";
			}
				System.out.print(alphabetStr);
			}
		
		
			// 2021-01-14 오전 1:32 퀴즈 풀이 완료
		
		
		
		}//end of main-----------------------------------
		
		
	}
		
				
		
		
		
	

