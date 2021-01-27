package my.day15.c.INTERFACE;

import my.util.MyUtil;

public abstract class Member implements InterMember {
	// ^^^^^^^^ Member 클래스(부모 클래스)에서는 InterMember의 메소드에 대해서는 재정의하지 않겠다는 의미. 따라서 Member클래스는 미완성 클래스(추상 클래스)임.
	//반드시 자식 클래스에서 오버라이딩해야함.
	//여기서 오버라이딩 해봤자 자식클래스인 Jobseeker와 Company 클래스에서 다시 오버라이딩을 하기 때문이다(예를 들어setName의 정책이각각 다르므로)
	//Jobseeker 클래스와 Company 클래스가 공통으로 가져야하는 field 생성
	private String id;
	private String passwd;
	private String name;		//이름(회사명, 개인성명)
	
	static int count;		// 자식 클래스인 Jobseeker 객체 또는 Company 객체(인스턴스)의 개수를 알아오려는 용도

	
	//Jobseeker 클래스와 Company 클래스가 공통으로 가져야하는 method 생성
	
	//public String getId() {
	protected String getId() {
		return id;
	}
	
	//public void setId(String id) {
	protected void setId(String id) {
		
		if(id != null && !id.trim().isEmpty() && 
				5 <= id.length() && id.length() <= 10) {
			this.id = id;
		}
		else
			System.out.println(">> 아이디에 공백만 입력할 수 없습니다. \n"
					+ ">> 또한 5글자 이상 10글자 이하까지만 가능합니다.");
	}
	
	public void setPasswd(String passwd) {
		boolean bool = MyUtil.isCheckPasswd(passwd);
		
		if(bool)
			this.passwd = passwd;
		else
			System.out.println(">> 암호는 8글자 이상 15글자 이하의 대소문자 특수문자가 혼합되어야 합니다.");
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void saveName(String name) {
		this.name = name;
	}

	

}
