package my.day03.a.constructor;

public class MemberMain {

	public static void main(String[] args) {
		
		Member hongMbr = new Member("hongkd", "qwer1234", "홍길동", 30, 100); //매개값을 제공하면서 객체를 생성. Member 생성자를 호출할 때 5개의 매개값을 제공.
		
		Member cheonghaMbr = new Member(); //빈 껍데기. 생성자 선언
		
		cheonghaMbr.userid = "cheongha";
		cheonghaMbr.passwd = "abcd";
		cheonghaMbr.name = "청하";
		cheonghaMbr.age = 20;
		cheonghaMbr.point = 300;
			
		
		
		hongMbr.showInfo();
		cheonghaMbr.showInfo();
		
		hongMbr.changeInfo("KDhong","1234","홍길동",25,150);
		
		String info = cheonghaMbr.updateInfo("cha","abcd0070","청하",21,7000);
		System.out.println(info);
		
		
		
		

	}

}
