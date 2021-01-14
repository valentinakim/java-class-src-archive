package my.day05.d.Switch;

public class ScoreMain {

	public static void main(String[] args) {
		
		Score sj = new Score();
		
		sj.stuNum = "091234";
		sj.name = "정재현";
		sj.kor = 50;
		sj.eng = 43;
		sj.math = 27;
		
		System.out.println("총점 : " +sj.total());
		System.out.println("평균 : " +sj.avg());	//평균 반올림
		System.out.println("학점 : " +sj.grade());	//A,B,C,D,F
		System.out.println("상품: " +sj.gift());
		// 학점이 "A" 라면 "놀이공원이용권, 치킨, 피자, 아이스크림"
		// 학점이 "B" 라면 "치킨, 피자, 아이스크림"
		// 학점이 "C" 라면 "피자, 아이스크림"
		// 학점이 "D" 라면 "아이스크림"
		// 학점이 "F" 라면 "꿀밤3대"

		
		
		
		
		
		
	}

}
