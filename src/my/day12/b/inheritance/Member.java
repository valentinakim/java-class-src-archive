package my.day12.b.inheritance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Member {

	//Jobseeker 클래스와 Company 클래스가 공통으로 가져야하는 field 생성
	private String id;
	private String passwd;
	private String name;		//이름(회사명, 개인성명)
	
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
	
	public void setName(String name) {
		
		if(name == null) {
			System.out.println(">> 성명은 공백없이 한글로 2글자부터 5글자까지만 가능합니다.");
			return;
		}
		
		Pattern p = Pattern.compile("^[가-힣]{2,5}$");
		
		Matcher m = p.matcher(name);
		
		boolean b = m.matches();
		
		if(b)
			this.name = name;
		else
			System.out.println(">> 성명은 공백없이 한글로 2글자부터 5글자까지만 가능합니다.");
	}
	
	public String getName() {
		return name;
	}
	
	public void setCompanyName(String name) {
		this.name = name;
	}
	
	
}
