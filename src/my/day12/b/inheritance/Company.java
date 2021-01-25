package my.day12.b.inheritance;

import java.text.DecimalFormat;

public class Company extends Member {
	//	Company 클래스는 Member 클래스의 자식 클래스가 되어진다. 자식 클래스인 Company에서는 부모 클래스인 Member 에서 선언되어진 것들을 상속받아 사용할 수 있게 된다.
	//구인회사
	
	//field
	private String industryType;	//회사업종타입(제조업, 서비스업, IT, ...)
	private long seedMoney;			//자본금
	
	static int count;		//Company 객체(인스턴스)의 개수를 알아오려는 용도
	
	public String getIndustryType() {
		return industryType;
	}
	
	public void setIndustryType(String industryType) {
		// industryType에는 "      "와 같은 것이 들어올 수 없다.
		if(industryType != null && industryType.trim().isEmpty())
			System.out.println(">> 업종명을 올바르게 입력하세요.");
		else 
			this.industryType = industryType;	//이 시점에서는 변수에 "   "와 같은 공백은 못 오지만 null은 들어올 수 있다

	}
	
	public long getSeedMoney() {
		return seedMoney;
	}
	
	public void setSeedMoney(long seedMoney) {
		if(seedMoney > 0) 
			this.seedMoney = seedMoney;
		else
			System.out.println(">> 자본금은 0보다 커야 합니다.");
	}
	
	
	boolean isRegisteredCompany() {
		if( industryType != null && seedMoney > 0 &&
			super.getId() != null && this.getPasswd() != null	&& getName() != null)
		//	부모 클래스에 있는 변수 상속 받아서사용할 때 super를 쓴다	부모 클래스로부터 상속 받아졌기 때문에 this.id나 그냥 id로만 써도 되지만 상속받은 변수라는 것을 표시해주시위해  super. 써준다
			return true;
		else
			return false;
	}

	
	// ===== 메소드의 재정의(method overriding) ===== 
	// 부모 클래스로 상속받은 메소드를 자식 클래스에서 메소드에 들어갈 내용물만 새롭게 만드는 것.
		
	@Override
	public void setName(String name) {
		
		if(name != null && !name.trim().isEmpty() &&
			2 <= name.length() && name.length() <= 20)
			super.setCompanyName(name);
		else
			System.out.println(">>회사명은 공백없이 한글 또는 영문 2글자부터 20글자까지만 가능합니다.");
	}
	
	
	
	void viewInfo() {
	      System.out.printf("%-10s\t%-15s\t%-15s%-8s\t%-10d\n",getId(),getPasswd(),getName(),getIndustryType(),getSeedMoney());
	   }
	
	
	@Override
	public String toString(){
		
		DecimalFormat df = new DecimalFormat("#,###");
		
		
		String info = "1. 아이디 : "+getId()+"\n"	//부모 클래스 Member에서 상속받아왔으므로 super.을 생략해도 된다
					+ "2. 암호 : "+getPasswd()+"\n"
					+ "3. 성명 : "+getName()+"\n"
					+ "4. 업종 : "+getIndustryType()+"\n"	
					+ "5. 자본금 : "+df.format(getSeedMoney())+"원\n";	
	
		return info;
		
	}
	
	
	
	
}
