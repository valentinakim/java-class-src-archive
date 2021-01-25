package my.day13.c.polymorphism;

/*
	접근제한자(접근지정자, accessmodifier)   	자기자신클래스내부    	  동일패키지에있는다른클래스   		   다른패키지에있는하위(자식)클래스        그외의영역  
----------------------------------------------------------------------------------------------------------------------- 
public                                    O                    O                         O                 O  
protected                                 O                    O                         O                 X
default (생성자 앞에 아무 것도 안 쓰면 default임)     O                    O                         X                 X
private                                   O                    X                         X                 X
*/	

public class Animal {
	
		//Dog, Cat, Duck의 공통 field(추상화)
		private String name;
		private int birthYear;
		
		//Dog, Cat, Duck의 공통 method (추상화)
		protected String getName() {
			return name;
		}
		
		protected void setName(String name) {
			
			if(name != null && !name.trim().isEmpty())
				this.name = name;
				
		}
		
		protected int getBirthYear() {
			return birthYear;
		}
		
		protected void setBirthYear(int birthYear) {
			
			if(birthYear > 0)
				this.birthYear = birthYear;
		}
		
		//===동물들(강아지, 고양이, 오리)의 정보를 출력해주는 메소드===
		
		
		public void showInfo() {
			System.out.println("== 동물정보 == \n"
							+ "1. 이름 : "+name+"\n"
							+ "2. 생년 : "+birthYear+"년 \n");
		}
		
		
		
		
		
		
		

}
