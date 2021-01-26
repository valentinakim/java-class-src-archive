package my.day14.a.abstractClass;

/*
	접근제한자(접근지정자, accessmodifier)   	자기자신클래스내부    	  동일패키지에있는다른클래스   		   다른패키지에있는하위(자식)클래스        그외의영역  
----------------------------------------------------------------------------------------------------------------------- 
public                                    O                    O                         O                 O  
protected                                 O                    O                         O                 X
default (생성자 앞에 아무 것도 안 쓰면 default임)     O                    O                         X                 X
private                                   O                    X                         X                 X
*/	

public abstract class Animal {		//미완성 클래스(추상클래스, abstract class)
//또는
//abstract public class Animal	
/*
 
  미완성 메소드가 있는 클래스는  반드시 미완성 클래스로 만들어야 한다.
  왜냐하면 자식 클래스에서 메소드를 오버라이딩을 하기 때문에
  부모 클래스에서는 메소드를 정의할 필요가 없기 때문이다
 메소드명에 접근제한자 다음 abstract를 반드시 적어야한다
 
 일반적으로 부모클래스를 미완성 클래스로 만든다
  
Animal은 미완성 클래스이므로 이 클래스를 사용하여 객체(인스턴스)를 생성할 수 없다
  	
  	
 */
	
	
	
	
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
		
		public abstract void  cry();	//미완성 메소드 혹은 추상 메소드(abstract method). 자식 클래스에서 이 메소드를 어차피 재정의 할 것이기 때문에 부모 클래스에서 기능을 쓰지 않는다
		//또는
		//abstract public void cry();
		//미완성 메소드는 자식 클래스에서 무조건 재정의(오버라이딩)를 꼭 해주어야만 한다.
		
		
		

}
