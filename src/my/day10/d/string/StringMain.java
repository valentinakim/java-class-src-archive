package my.day10.d.string;

import java.text.DecimalFormat;

import my.util.MyUtil;

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
		
		
		str="";
		int idx=0;			// length: 3
		
		for(int i=0; i<pathFileNameArr.length; i++) {
			//System.out.println(pathFileNameArr[i]);
			/*
			 찾을문자열 찾은 후 그 인덱스부터 끝까지 출력하기
			 찾을문자열 : 나, m, 내
			 */
			
			if(i == 0) {
				idx = pathFileNameArr[i].indexOf("나");
			}
			else if(i == 1) {
				idx = pathFileNameArr[i].indexOf("m");
			}
			else if(i ==2) {
				idx = pathFileNameArr[i].indexOf("내");

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
	            fileName += chrArr[j]; 		//거꾸로된 문자열 다시 맨뒤에서 앞으로 거꾸로 출력해서 원래대로 출력하기
	         }
	         
	         System.out.println(fileName);
	      }
	      
	      /*
			 나의이력서.hwp
			 mymusic.mp3
			 내얼굴.jpg
		  */
		
		
      System.out.println("\n~~~~~~~~~lastIndexOf~~~~~~~~~~~~\n");

	      
	    //===6."문자열".lastIndexOf("찾을문자열")===
		//"문자열"에서 마지막으로 나오는 "찾을문자열"의 인덱스(int)를 알려준다
			index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하");
				//					 ^
			System.out.println(index);	//13
			
			index = "시작하라 안녕하세요 건강하세요".lastIndexOf("하세요");
						//   		 ^^^^
			System.out.println(index);	//13
	      
		
		System.out.println("\n=== 파일명만 뽑아온 결과물 (선생님 풀이 lastIndexOf 이용)===");

	      for(int i=0; i<pathFileNameArr.length; i++) {
	    	  
	    	  idx = pathFileNameArr[i].lastIndexOf("/");// 마지막으로 나오는 /의 인덱스값
	    	  pathFileNameArr[i].substring(idx);
	    	  
	    	  System.out.println(pathFileNameArr[i].substring(idx+1)); // / 이후의 내용을 출력해야하므로 +1을 해준다
	    	  
	    	  
	      }  //end of for----------------------
		
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

	      //Quiz
	      String money = "2,000,000";
	      
	      int commaIndex = money.indexOf(",");
	      
	      
	      System.out.println("money.indexOf(\",\") => "+money.indexOf(","));	//1
	      
	      money.substring(0, commaIndex);	
	      
	      System.out.println("money.substring(0, commaIndex) => " + money.substring(0, commaIndex));	//2
	      
	      money.substring(commaIndex+1); 
	      
	      System.out.println("money.substring(commaIndex+1) => "+money.substring(commaIndex+1));	//000,000
	      
	      money = money.substring(0, commaIndex) + money.substring(commaIndex+1);	// "2" + "000,000"
	      
	      System.out.println("첫번째 콤마 제거 => "+money);	//2000,000
	      
	      commaIndex = money.indexOf(",");	// 4
	      
	      money = money.substring(0, commaIndex) + money.substring(commaIndex+1);	//"2000"+"000"
	      // "2000"								 + "000"
	      
	      System.out.println("두번째 콤마까지 제거 => "+money);	//2000000
	      
	      commaIndex = money.indexOf(",");	// -1 (검사 문자열에서 찾고자 하는 문자가 없으면 -1을 리턴해준다)

	      System.out.println(commaIndex);
	      
	      
	      
	      int sum = MyUtil.delComma("2,000,000") + MyUtil.delComma("5,000");
	      // 						2000000 	 + 					5000;
	      
	      
	      System.out.println(sum); // 2005000
	      
	      
	      DecimalFormat df = new DecimalFormat("#,###");
	      
	      System.out.println(df.format(sum)); //"2,005,000"
	      
	     
	      //=== 7. "문자열".split("구분자") ===
	      //	   "문자열"을 "구분자"로 잘라서 String 타입의 배열로 리턴
	      
	      System.out.println("\n 1.===================== \n");
	      
	      String food = "파스타,국밥,볶음밥,고구마,계란말이";
	      
	      String[] foodArr = food.split(",");
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      
	      System.out.println("\n 2.===================== \n");
	      
	      food = "파스타	국밥	볶음밥	고구마	계란말이";
	      
	      foodArr = food.split("\t");
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      
	      System.out.println("\n 3.===split 사용시 구분자로 . | / 등 특수문자를 사용하려고 하는 경우=== \n");
	      // 그냥 사용하게 되면은 자바에서 인식을 못하므로 특수문자 앞에 역슬래쉬(\\)를 붙여준다
	      food = "파스타.국밥.볶음밥.고구마.계란말이";
	      
	      foodArr = food.split(".");
	      System.out.println("foodArr.length => " + foodArr.length);
	      // ==> 0 이 나옴. 즉 . 단독만으로는 구분자로 인식을 못함.
	      // split 사용시 구분자로 . | / 등 특수문자를 사용하려고 할 경우에는 구분자로 인식을 못할 경우가 많으므로
	      // 구분자 앞에 \\ 를 붙이거나 구분자를 [] 로 씌워주면 된다. 즉, [구분자] 이렇게 말이다.
	      
	      foodArr = food.split("\\.");
	      // 또는 foodArr = food.split("[.]");

	      System.out.println("foodArr.length => " + foodArr.length);
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      
	      System.out.println("\n 4.===================== \n");
	      
	      food = "파스타|국밥|볶음밥|고구마|계란말이";
	      
	      foodArr = food.split("[|]");
	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      System.out.println("\n 5.===================== \n");
	      
	      food = "파스타,국밥,볶음밥,고구마,계란말이";
	      
	      foodArr = food.split("\\,");
	      // 또는 foodArr = food.split("[,]");

	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      System.out.println("\n 6.===================== \n");
	      
	      food = "파스타,국밥.볶음밥	고구마,계란말이";
	      
	      foodArr = food.split("\\,|\\.|\t");	// 구분자가 여러개일 경우 |(vertical line/파이프)로 구분해준다
	      // 또는
	      //foodArr = food.split("[,.\t]");	//또는 [] 안에 구분자들을 입력해준다

	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      System.out.println("\n 7.===================== \n");
	      
	      food = "파스타1국밥2볶음밥3고구마4계란말이";
	      
	      foodArr = food.split("\\d");	// \\d 의 d는 정규표현식의 하나로 숫자를 의미한다. 즉, 숫자가 구분자가 되는 것이다. [d]는 사용할 수 없음.

	      // {"파스타","국밥","볶음밥","고구마","계란말이"}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      /*
		         파스타
			국밥
			볶음밥
			고구마
			계란말이
	       */
	      System.out.println("\n 8.===================== \n");
	      
	      food = "파스타1국밥2볶음밥3고구마4계란말이";
	      
	      foodArr = food.split("\\D");	// \\D 의 D는 정규표현식의 하나로 숫자가 아닌 것를 의미. 즉, 숫자가 아닌 것이 구분자임.

	      // {"1","2","3","4",}
	      
	      for(int i=0; i<foodArr.length; i++) {
	    	  System.out.println(foodArr[i]);
	      }
	      
	      /*
	        1

			2
			
			
			3
			
			
			4
	       */
	      
			System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	      
	      // 참고 : \ 를 escape 문자라고 부른다.
	      System.out.println("나의 이름은 \"김선호\" 입니다.");
	      // 나의 이름은 "김선호" 입니다.
	      
	      System.out.println("C:\\movie\\koreanshow\\스타트업.mp4");
	      // C:\movie\koreanshow\스타트업.mp4
	      
	      System.out.println("나의 이름은 '남주혁' 입니다.");
	      // 나의 이름은 '남주혁' 입니다.
	      
	      
	      //=== 8. String.join("구분자", 문자열배열명) ===
	      // 문자열배열을 "구분자"로 합쳐서 String 타입으로 돌려준다
	      
	      String[] nameArr = {"한석규","두석규","세석규","네석규","오석규"};
	      String names = String.join("-", nameArr);
	      System.out.println(names);
	      //한석규-두석규-세석규-네석규-오석규
	      
	      // === 9."문자열".replaceAll("변경대상문자열", "새로변경될문자열") === 
	      //	"문자열"에서 "변경대상문자열"을 모두 "새로변경될문자열"로 교체해 반환
	      
	      names = names.replaceAll("석규", "SK");
	      System.out.println(names);
	      //한SK-두SK-세SK-네SK-오SK
	      
	      // === 10."문자열".replaceFirst("변경대상문자열", "새로변경될문자열") === 
	      //	"문자열"에서 "변경대상문자열"의 첫번째만 "새로변경될문자열"로 교체해 반환
	      
	      names = names.replaceFirst("SK", "석규");
	      System.out.println(names);
	      //한석규-두SK-세SK-네SK-오SK
	      
	      
	      //Quiz 
	      //replaceFirst 사용하여
		  System.out.println("\n~~~~~~~~Quiz1 내가 한 풀이 (선생님 풀이와 동일!) ~~~~~~~~~~~~~~\n");
	      names = "한SK-두SK-세SK-네SK-오SK";

	      //한석규-두석규-세석규-네SK-오SK < 이렇게 출력하기
	      
	      for(int i=0; i<3; i++) {
	    	  
	    	  names = names.replaceFirst("SK", "석규");
	      }

	      System.out.println(names);
	      //한석규-두석규-세석규-네SK-오SK
	      
		  System.out.println("\n~~~~~~~~Quiz2 내가 한 풀이  ~~~~~~~~~~~~~~\n");

	      names = "한SK-두SK-세SK-네SK-오SK";
	      //한SK-두석규-세석규-네SK-오SK
	      
	      for(int i=0; i<3; i++) {
	    	  
	    	  names = names.replaceFirst("SK", "석규");
	      }
	      
	      names = names.replaceFirst("석규", "SK");
	      
	      System.out.println(names);
	      
		  System.out.println("\n~~~~~~~~Quiz2 선생님 풀이  ~~~~~~~~~~~~~~\n");

	      names = "한SK-두SK-세SK-네SK-오SK";
	      
	      String[] namesArr = names.split("SK");
	            
	      for(int i=0; i<namesArr.length; i++) {
	          if(i==1 || i==2) {
	              namesArr[i] += "석규";
	          }
	          
	          else {
	         namesArr[i] += "SK";
	          }
	      } // end of for-----------------------
	            
	      names = String.join("", namesArr);
	            
	      System.out.println(names);
	      // "한SK-두석규-세석규-네SK-오SK"
	      

		
		System.out.println("\n~~~~~~~~~~Quiz3-1~~~~~~~~~~~~~~~\n");

		String[] contents = {"호호안녕하세요","건강하세요","행복하세요 또봐요","즐겁고 건강한 하루되세요"}; 
	       
	    // "건강" 이라는 단어가 포함된것을 출력하세요.
		/* 
		 "건강하세요"
		 "즐겁고 건강한 하루되세요"
		 */
		
		for(int i=0; i<contents.length; i++) {
	          idx = contents[i].indexOf("건강");
	          if(idx != -1)
	             System.out.println(contents[i]);
	       }
		System.out.println("\n~~~~~~~~~~Quiz3-2~~~~~~~~~~~~~~~\n");

		// "건강" 이라는 단어로 시작하는 것만 출력하세요.
		// "건강하세요"
		
		for(int i=0; i<contents.length; i++) {
	          idx = contents[i].indexOf("건강");
	          if(idx == 0)
	             System.out.println(contents[i]);
	       }
		System.out.println("\n~~~~~~~~~~Quiz3-2(풀이2)~~~~~~~~~~~~~~~\n");

		// 또는 아래와 같이 할수도 있습니다.
        // === 11. "문자열".startsWith("찾고자하는문자열")  ===
        //       "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오면 true 를 반환.
        //      "문자열" 에서 "찾고자하는문자열"이 맨첫번째에 나오지 않으면 false 를 반환.
	       
        // "건강" 이라는 단어로 시작하는 것만 출력하세요.
	      
		for(int i=0; i<contents.length; i++) {
	          if(contents[i].startsWith("건강")) {
		            System.out.println(contents[i]);
	          }
	       }  
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// === 12. "문자열".endsWith("찾고자하는문자열")  ===
        //       "문자열" 에서 "찾고자하는문자열"로 끝나면 true 를 반환.
        //      "문자열" 에서 "찾고자하는문자열"로 끝나지 않으면 false 를 반환.
	       
        // "하세요"라는 단어로 끝나는 것만 출력하세요.
		
		for(int i=0; i<contents.length; i++) {
	          if(contents[i].endsWith("하세요")) {
		            System.out.println(contents[i]);
	          }
	       }
		/*
			호호안녕하세요
			건강하세요 
		 */
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// === 13. "문자열".trim()  ===
		//			"문자열"의 좌,우에 공백이 있으면 공백을 모두 제거하고서 반환.
		
		String greeting = "           수고                  많으셨습니다";
		
		System.out.println("하하하"+greeting+"내일 뵐게요");
		//하하하           수고                  많으셨습니다내일 뵐게요
		
		System.out.println("하하하"+greeting.trim()+"내일 뵐게요");
		//하하하수고                  많으셨습니다내일 뵐게요
	      
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		// === 14. "문자열".isEmpty()  ===
		// "문자열"이 아무것도 없으면 true, 있으면 false 반환
		String str1 = "", str2 = "abc", str3 = "       ";
		System.out.println(str1.isEmpty());	//true
		System.out.println(str2.isEmpty());	//false
		System.out.println(str3.isEmpty());	//false
		System.out.println(str3.trim().isEmpty());	//true

		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// === 15. "문자열".toUpperCase()  ===
		//	"문자열"에서 소문자가 있으면 모두 대문자로 변경해서 반환
		String words = "My Name is Tom 입니다.";
		
		System.out.println(words.toUpperCase());
		//MY NAME IS TOM 입니다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// === 16. "문자열".toLowerCase()  ===
		//	"문자열"에서 소문자가 있으면 모두 대문자로 변경해서 반환
		words = "My Name is Tom 입니다.";
		
		System.out.println(words.toLowerCase());
		//my name is tom 입니다.
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		// === 17. "문자열".equals("비교대상문자열")  ===
		// 대소문자를 구분하며 "문자열"과 "비교대상문자열"의 값이 일치하면 true, 그렇지 않으면 false를 반환.

		// === 18. "문자열".equalsIgnoreCase("비교대상문자열")  ===
		// 대,소문자와  관계없이 "문자열"과 "비교대상문자열"의 값이 일치하면 true, 그렇지 않으면 false를 반환
		
		String[] strArr = {"korea", "seoul", " KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세", null};
		
		for(String s : strArr) {	//개선된 for문. 배열의 길이만큼 반복
			
			if("korea".equals(s)) {	// 반드시 괄호 안에 변수를 넣어줘야한다. 변수에 null이 들어올 수도 있는데 null.으로 메소드를 불러올 수 없다..
				System.out.println(s);
			}
		}
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		//검색어를 "korea", "KOREA", "kOReA" 와 같이 3개중에 아무거나 입력하면
		//"korea"," KOREA seoul", "Korea 대한민국", "서울 kOrEA 만세" 가 출력되도록 하자

		String search = "kOReA";
		
		for(String s : strArr) {
			search = search.toLowerCase();	//"kOReA" => "korea"
		
			if(s != null && s.toLowerCase().indexOf(search) != -1)	{
				// s.toLowerCase() => "korea","seoul"," korea seoul", "korea 대한민국", "서울 korea 만세"
				System.out.println(s);
			}
		}//end of for--------------------
		
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

		
		
		
		
		
	}//end of main--------------------------

}
