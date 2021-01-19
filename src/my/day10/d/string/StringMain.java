package my.day10.d.string;

public class StringMain {

	public static void main(String[] args) {

		// === 1. "문자열".charAt(int index) ===
		// "안녕하세요.".charAt(2) ==> '하'
		
		char ch = "안녕하세요".charAt(2);
		System.out.println("ch => "+ch);
		// ch ==> 하
		
		String str = "안녕하세요";
		String result = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			result+=str.charAt(i);
		}
		
		
		System.out.println(result);
		//요세하녕안
		
		// === 2. "문자열".toCharArray() ===
		//"안녕하세요".toCharArray() ==> char 타입의 배열로 만들어준다.
		//  ---------------------------------
		//	| '안' | '녕' | '하' | '세' | '요' | 	
		// 	---------------------------------
		//     0      1     2     3      4		<== index
		
		
		char[] chArr = "안녕하세요".toCharArray();
		result="";
		
		for(int i=chArr.length-1; i>=0; i--) {
			result+=chArr[i];
		}
		
		System.out.println(result);
		//요세하녕안
		
		
		//===3."문자열".substring(int 시작인덱스, int 끝인덱스)===
		//"안녕하세요".substring(1, 4)		//인덱스 4 앞까지만 출력. 즉, 인덱스 1,2,3까지 출력
		
		
		str = "안녕하세요".substring(1, 4);
		System.out.println(str);
		//"녕하세"
		
		int len = "안녕하세요".length();	//len => 5
		str = "안녕하세요".substring(2, len);
		System.out.println(str);
		//하세요
		
		//===4."문자열".substring(int 시작인덱스)===
		//"안녕하세요".substring(2)		//2번 인덱스인 "하"부터 끝까지 뽑아온다.
		
		str = "안녕하세요".substring(2);
		System.out.println(str);
		//하세요
		
		//===5."문자열".indexOf("찾을문자열")===
		//"문자열"에서 최초로 나오는 "찾을문자열"의 인덱스(int)를 알려준다
		int index = "시작하라 안녕하세요 건강하세요".indexOf("하");
				//      ^
		System.out.println(index);
		//2
		
		index = "시작하라 안녕하세요 건강하세요".indexOf("하세요");
					//   ^^^^^
		System.out.println(index);
		//7
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// Quiz 
		String[] pathFileNameArr = {"C:/mydocument/resume/나의이력서.hwp",
								 "D:/mymusic.mp3",
								 "C:/photo/내얼굴.jpg"};
		
		for(int i=0; i<pathFileNameArr.length; i++) {
			System.out.println(pathFileNameArr[i]);
		}
		
		System.out.println("\n~~~~~~~~~~~내가 한 문제 풀이~~~~~~~~~~~~~\n");

		
		/*
		 C:/mydocument/resume/나의이력서.hwp
		 D:/mymusic.mp3
		 C:/photo/내얼굴.jpg
		 */
		
		/*
		 나의이력서.hwp
		 mymusic.mp3
		 photo/내얼굴.jpg
		 */
		str="";
		int idx=0;			// length: 3
		
		for(int i=0; i<pathFileNameArr.length; i++) {
			//System.out.println(pathFileNameArr[i]);
			/*
			 찾을문자열 찾은 후 그 인덱스부터 끝까지 출력하기
			 찾을문자열 : 나, m, p
			 */
			
			if(i == 0) {
				idx = pathFileNameArr[i].indexOf("나");
			}
			else if(i == 1) {
				idx = pathFileNameArr[i].indexOf("m");
			}
			else if(i ==2) {
				idx = pathFileNameArr[i].indexOf("p");

			}
			
			result = pathFileNameArr[i].substring(idx);

			System.out.println(result);
			
		}
		
		System.out.println("\n=== 파일명만 뽑아온 결과물 (선생님 풀이)===");
	      
	      for(int i=0; i<pathFileNameArr.length; i++) {
	         String pathFileName = pathFileNameArr[i];
	         char[] chrArr = pathFileName.toCharArray();
	         
	         String strReverse = "";
	         for(int j=chrArr.length-1; j>=0; j--) {
	            strReverse += chrArr[j]; 	//문자열을 맨뒤에서 앞으로 거꾸로 출력
	         }
	         
	      //   System.out.println(strReverse);
	         
	         int idxSlash = strReverse.indexOf("/");
	         
	         strReverse = strReverse.substring(0, idxSlash);
	      //   System.out.println(strReverse);
	         
	         chrArr = strReverse.toCharArray();
	         
	         String fileName = "";
	         for(int j=chrArr.length-1; j>=0; j--) {
	            fileName += chrArr[j]; 
	         }
	         
	         System.out.println(fileName);
	      }
		
		
	}//end of main--------------------------

}
