package my.day02;

import my.util.MyUtil;

// static 메소드
// static 메소드일 경우에는 main 메소드에서 매번 인스턴스를 생성할 필요가 없다
// 어떤 클래스이든지 사용가능한 공통 기능
// 클래스명.기능명()

public class Main02 {

	public static void main(String[] args) {
		
		
		
		System.out.println(">> 여기는 Main02 클래스 입니다.");
		
		//현재시각 출력
		
		MyUtil.currentTime();
		
		
	}

}
