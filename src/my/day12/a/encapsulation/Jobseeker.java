package my.day12.a.encapsulation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Jobseeker {
	
	/*
	   	접근제한자(접근지정자, accessmodifier)   	자기자신클래스내부    	  동일패키지에있는다른클래스   		   다른패키지에있는하위(자식)클래스        그외의영역  
	   ----------------------------------------------------------------------------------------------------------------------- 
	   public                                    O                    O                         O                 O  
	   protected                                 O                    O                         O                 X
	   default (생성자 앞에 아무 것도 안 쓰면 default임)     O                    O                         X                 X
	   private                                   O                    X                         X                 X
	*/	

	
	//field
		private String userid;	//아이디(글자수가 5글자 이상10글자 이하)
		
	

		private String passwd;
		private String name;
		private String resdntNum; 	//주민번호 앞의 7가지 까지만
						// 예: "9501151"  남자	0105103 남자
						// 예: "9501152" 여자		0105104 여자
	
		static int count;		//Employee 객체(인스턴스)의 개수를 알아오려는 용도

		
		
	//method
		
	public void setUserid(String userid) {	//static 메소드에는 인스턴스 변수를 사용하면 안된다 static은 객체를 만들지 않고도 사용할 수 있는 것이므로..
		//아이디(글자수가 5글자 이상10글자 이하)
		
		int len = userid.length();
		
		if(5 <= len && len <=10)
			this.userid = userid;		// 조건 범위 밖의 아이디를 적으면 userid에 데이터값이 들어가지 않는다. 이 상태에서 출력해보면 userid 초기값인 null이 나옴
		//  ^^^^ 매개변수와 인스턴스변수 구분
		else 
			System.out.println(">> 아이디는 5글자 이상 10글자 이하여야 합니다.");
		
	}//end of setUserid----------------------
	
	
	public void setPasswd(String passwd) {
		
		boolean bool = MyUtil.isCheckPasswd(passwd);
		
		if(bool)
			this.passwd = passwd;
		else
			System.out.println(">> 암호는 8글자 이상 15글자 이하의 대소문자 특수문자가 혼합되어야 합니다.");
		
	}//end of setPasswd------------------------
	
	public void setName(String name) {
		// name에는 한글만 허용
		
		if(name == null) {
			System.out.println(">> 성명은 공백없이 한글로 2글자부터 5글자까지만 가능합니다.");
			return;	//메소드를 끝낸다는 뜻. 이 메소드는 void 타입이므로 돌려주는 값이 없이 그냥 끝난다
		}
		
		// 정규표현식(Regular Expression)이란?
		// ==> 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰이는 형식언어
		
		//==1.정규표현식(Regular Expression) 패턴을 작성한다.===

								//			vvvv 2글자부터 5글자
		Pattern p = Pattern.compile("^[가-힣]{2,5}$");	//공백 불허용
							//		  ^^^^^^ 한글 범위
		
		//==2.문자열이 주어진 정규식 패턴과 일치하는지 판별하는 객체를 생성한다.===
		Matcher m = p.matcher(name);
		
		//==3.판별하도록 한다.==
		//주어진 정규식 패턴과 일치하면 true, 일치하지 않으면 false를 리턴
		boolean b = m.matches(); //이름을 올바르게 입력했다면 b에 true 값 넣어준다
		
		if(b)
			this.name = name;	//b가 true이면 매개값을 인스턴스변수 name에 넣어준다
		else
			System.out.println(">> 성명은 공백없이 한글로 2글자부터 5글자까지만 가능합니다.");
		
		
	}//end of setName----------------------------
	
	public void setresdntNum(String resdntNum) {
		
		boolean bool = MyUtil.isCheckJubun(resdntNum);
		
		if(bool)
			this.resdntNum = resdntNum;
		else
			System.out.println(">> 주민번호가 올바르지 않습니다.");
		
		
	}//end of setresdntNum-----------------------------
	
	
	// userid, passwd, name, resdntNum field의 값이 모두 null이 아니라면 true, 한 개 이상이 null이면 false 리턴해주는 메소드 생성
	public boolean isRegistered() {
		
		if(userid != null &&
		   passwd != null &&
		   name != null &&
		   resdntNum != null)
			return true;

		else
			return false;
	}
	
	public String getName() {
		return name;	//name이 private 이지만 자기 클래스에서는 사용할 수 있다.
	}
	
	
	public String getResdntNum() {
		return resdntNum;
	}

	public String getUserid() {
		return userid;
	}


	public String getPasswd() {
		return passwd;
	
	}
}
