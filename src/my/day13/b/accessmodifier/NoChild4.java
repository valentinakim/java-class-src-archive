package my.day13.b.accessmodifier;

import my.day12.b.inheritance.Member;

public class NoChild4 {
	
	void test() {

		Member mbr = new Member();
		
		//super.setId("hongkd");				// NoChild4는 Member의 자식 클래스가 아니고 setId()메소드의 접근제한자는 protected이므로
		//System.out.println(super.getId());	// 최종적으로  이 메소드에 접근 불가.
		
		mbr.setName("홍길동");	//setName 메소드의 접근제한자는 public이므로 최종적으로 누구나 이 메소드에 접근가능.
		System.out.println(mbr.getName());
	
	}
	
}
