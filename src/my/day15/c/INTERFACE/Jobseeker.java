package my.day15.c.INTERFACE;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Jobseeker extends Member{
	

	
	//field
		private String resdntNum; 	//주민번호 앞의 7가지 까지만
						// 예: "9501151"  남자	0105103 남자
						// 예: "9501152" 여자		0105104 여자
	
	//method
	
		
	//== 메소드 재정의(method overriding) ==
	// InterMember 인터페이스에 정의된 추상메소드(미완성메소드)를 재정의 한것임. Member 클래스에서는 재정의하지 않는다. 추상클래스이므로.
		
	@Override
	public void setName(String name) {	//인터페이스 InterMember의 메소드를 오버라이딩한 것.
		
		//name에는 한글만 허용
		if(name == null) {
			System.out.println(">> 성명은 공백없이 한글로 2글자부터 5글자까지만 가능합니다.");
			return;
		}
		
		Pattern p = Pattern.compile("^[가-힣]{2,5}$");
		
		Matcher m = p.matcher(name);
		
		boolean b = m.matches();
		
		if(b)
			super.saveName(name);
		else
			System.out.println(">> 성명은 공백없이 한글로 2글자부터 5글자까지만 가능합니다.");
	}	
	
		
	public void setresdntNum(String resdntNum) {
		
		boolean bool = MyUtil.isCheckJubun(resdntNum);
		
		if(bool)
			this.resdntNum = resdntNum;
		else
			System.out.println(">> 주민번호가 올바르지 않습니다.");
		
		
	}//end of setresdntNum-----------------------------
	
	public String getResdntNum() {
		return resdntNum;
	}


	String getGender() {
			
			String gender = "";
			
			switch (resdntNum.substring(6)) {
			case "1":
				
			case "3":
				gender = "남";
				break;
	
			case "2":
				
			case "4":
				gender = "여";
				break;
				
			}//end of switch--------------------------
		
		return gender;
		
	}//end of getGender()---------------------------
	
	
	int getAge() {
		
		Calendar currentDate = Calendar.getInstance();
		   
	   	int currentYear = currentDate.get(Calendar.YEAR);
		
		String sgenderNum = resdntNum.substring(6);
		
		String sbirthYear = resdntNum.substring(0, 2);
		// "95" 또는 "01"
		
		int nbirthYear = Integer.parseInt(sbirthYear);

		if("1".equals(sgenderNum)||"2".equals(sgenderNum)) {
			
			return currentYear - (1900+nbirthYear) + 1;
			
		}
		else {

			return currentYear - (2000+nbirthYear) + 1;

		}
	   	
	   	
	}//end of int getAge()-----------------------------
	
	@Override	//메소드오버라이딩(메소드 재정의)
	public String toString() {
		
		String info = "1. 아이디 : "+getId()+"\n"	//부모 클래스 Member에서 상속받아왔으므로 super.을 생략해도 된다
					+ "2. 암호 : "+getPasswd()+"\n"
					+ "3. 성명 : "+getName()+"\n"
					+ "4. 주민번호 7자리 : "+resdntNum+"\n";	
		
		return info;
	}

}
