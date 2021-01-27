package my.day15.c.INTERFACE;

import java.text.DecimalFormat;

public class Company extends Member{
	
	private String industryType;	//회사업종타입(제조업, 서비스업, IT, ...)
	private long seedMoney;			//자본금
	
	
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

	
	// ===== 메소드의 재정의(method overriding) ===== 
	// 부모 클래스로 상속받은 메소드를 자식 클래스에서 메소드에 들어갈 내용물만 새롭게 만드는 것.
		

	
	
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
	
	//== 메소드 재정의(method overriding) ==
	// InterMember 인터페이스에 정의된 추상메소드(미완성메소드)를 재정의 한것임. Member 클래스에서는 재정의하지 않는다. 추상클래스이므로.
	
	@Override
	public void setName(String name) {
		
		if(name != null && !name.trim().isEmpty() &&
			2 <= name.length() && name.length() <= 20)
			super.saveName(name);
		else
			System.out.println(">>회사명은 공백만 입력할 수 없고 한글 또는 영문 2글자부터 20글자까지만 가능합니다.");
	}
	
}
