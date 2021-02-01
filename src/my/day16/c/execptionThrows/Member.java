package my.day16.c.execptionThrows;

public class Member {

	//field
	String name;
	String kor;
	String eng;
	String math;
	
	
	
	
	
	//method
	void info() throws Exception {
	// 기본적으로 info()메소드 내에서 익셉션 처리를 해야한다
	// 메소드명 throws Exception ==> 을 호출하는 쪽에서 Exception을 처리해라는 뜻. 여기서는 info() 메소드를 호출하고 있는 Main메소드에서 처리하라는 의미이다.	
		
			int nKor = Integer.parseInt(kor);
			int nEng = Integer.parseInt(eng);
			int nMath = Integer.parseInt(math);
			
			int total = nKor+nEng+nMath;
			
			String info = "1. 학생명 : "+name+"\n"
					+ "2. 국어 : "+kor+"점\n"
					+ "3. 영어 : "+eng+"점\n"
					+ "4. 수학 : "+math+"점\n"
					+ "5. 총점 : "+total+"점";
			
			System.out.println(info);

	}
	
	
	
	
	
	
}
