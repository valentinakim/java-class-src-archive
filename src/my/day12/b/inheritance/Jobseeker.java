package my.day12.b.inheritance;


import java.util.Calendar;

import my.util.MyUtil;

public class Jobseeker extends Member {	//구직자
	//	Jobseeker 클래스는 Member 클래스의 자식 클래스가 되어진다. 자식 클래스인 Jobseeker에서는 부모 클래스인 Member에서 선언되어진 것들을 상속받아 사용할 수 있게 된다.

	
	//field
		private String resdntNum; 	//주민번호 앞의 7가지 까지만
						// 예: "9501151"  남자	0105103 남자
						// 예: "9501152" 여자		0105104 여자
	
		static int count;		//Jobseeker 객체(인스턴스)의 개수를 알아오려는 용도
		
	//method
		
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
	
	void viewInfo() {
	      System.out.printf("%-10s\t%-15s\t%-8s\t%3d\t%-2s\n",getId(),getPasswd(),getName(),getAge(),getGender());
	   }
	
	
	@Override	//메소드오버라이딩(메소드 재정의)
	public String toString() {
		
		String info = "1. 아이디 : "+getId()+"\n"	//부모 클래스 Member에서 상속받아왔으므로 super.을 생략해도 된다
					+ "2. 암호 : "+getPasswd()+"\n"
					+ "3. 성명 : "+getName()+"\n"
					+ "4. 주민번호 7자리 : "+resdntNum;	
		
		
		
		
		
		
		
		
		return info;
	}
	
	
	
	
} // end of public class Jobseeker
