package my.day14.b.abstractClass;


import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.util.MyUtil;

public class Jobseeker extends Member {	//구직자
	//	Jobseeker 클래스는 Member 클래스의 자식 클래스가 되어진다. 자식 클래스인 Jobseeker에서는 부모 클래스인 Member에서 선언되어진 것들을 상속받아 사용할 수 있게 된다.

	
	//field
		private String resdntNum; 	//주민번호 앞의 7가지 까지만
						// 예: "9501151"  남자	0105103 남자
						// 예: "9501152" 여자		0105104 여자
	
	//method
	
	@Override
	public void setName(String name) {
		
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


	// userid, passwd, name, resdntNum field의 값이 모두 null이 아니라면 true, 한 개 이상이 null이면 false 리턴해주는 메소드 생성
	
	@Override
	public boolean isRegistered() {
		
		if(super.getId() != null &&
		   this.getPasswd() != null &&
		   getName() != null &&
		   resdntNum != null)
			return true;

		else
			return false;
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
	
	@Override
	public void viewInfo() {
	      System.out.printf("%-10s\t%-15s\t%-8s\t%3d\t%-2s\n",getId(),getPasswd(),getName(),getAge(),getGender());
	   }
	
	
	@Override	//메소드오버라이딩(메소드 재정의)
	public String toString() {
		
		String info = "1. 아이디 : "+getId()+"\n"	//부모 클래스 Member에서 상속받아왔으므로 super.을 생략해도 된다
					+ "2. 암호 : "+getPasswd()+"\n"
					+ "3. 성명 : "+getName()+"\n"
					+ "4. 주민번호 7자리 : "+resdntNum+"\n";	
		
		return info;
	}

	@Override
	public String showInfo() {

		//성별
		// resdntNum.substring(6)	// "1" "2" "3""4"
		
		String gender = "";
		
		switch (resdntNum.substring(6)) {
		case "2":
		case "4":
			// case를 두개 나란히 쓰면 or의 역할을 한다. (1 또는 3 라면...)	
			gender = "여";
			break;
		case "1":
		case "3":
		// case를 두개 나란히 쓰면 or의 역할을 한다. (2 또는 4 라면...)	
			gender = "남";
			break;

		default:
			break;
		}
		
		
		//현재나이 = 현재년도 - (태어난년도) +1
	
		Calendar currentDate = Calendar.getInstance();	//현재날짜와 시간을 얻어온다.
		   
	   	int currentYear = currentDate.get(Calendar.YEAR);	//현재년도
		
	   	//태어난년도
	   	int birthYear = 0;
	   	switch (resdntNum.substring(6)) {	// "1"	"2"	"3"	"4"
		case "1":
		case "2":
			birthYear = 1900 + Integer.parseInt(resdntNum.substring(0, 2));	//주민번호에서 앞의 2자리만 읽어오는 것
			
			break;

		default:	// 나머지 "3" "4"
			birthYear = 2000 + Integer.parseInt(resdntNum.substring(0, 2));	//주민번호에서 앞의 2자리만 읽어오는 것
			
			break;
		}
	   	
	   	int age = currentYear - birthYear +1;
		   	
		String info = "1. 아이디 : "+getId()+"\n"	//부모 클래스 Member에서 상속받아왔으므로 super.을 생략해도 된다
				+ "2. 암호 : "+getPasswd()+"\n"
				+ "3. 성명 : "+getName()+"\n"
				+ "4. 주민번호 7자리 : "+resdntNum+"\n"
				+ "5. 성별 : "+gender+"\n"
				+ "6. 나이 : "+age+"세";	
		
		
		return info;
	}
	
} // end of public class Jobseeker
