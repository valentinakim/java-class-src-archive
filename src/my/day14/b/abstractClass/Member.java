package my.day14.b.abstractClass;


import my.util.MyUtil;

public abstract class Member {	//미완성 (추상)클래스

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
	
	public abstract void setName(String name);
	//미완성 메소드
	
	
	public String getName() {
		return name;
	}
	
	public void saveName(String name) {
		this.name = name;
	}

	/////////////////////////////////////////////////
	
	//자식 클래스인 Jobseeker와 Company에서 showInfo()를 상속받아 사용할 것인데 보여주는 내용물이 Jobseeker와 Company는 다를 것이다
	//그러므로 부모클래스인 Member에서 showInfo()를 정의할 필요는 없다
	//반드시 자식클래스인 Jobseeker와 Company에서 showInfo() 재정의를 꼭 해주어야 한다.
	//그러므로 부모클래스인 Member에서는 showInfo() 메소드를 미완성(추사)메소드로 만들어야 한다.
		public abstract String showInfo();
	
	
		public abstract boolean isRegistered();
	
		public abstract void viewInfo();
	
	
	
	
}
