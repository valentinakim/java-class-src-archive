package my.day13.a.accessmodifier;

public class Parent {

	/*
   	접근제한자(접근지정자, accessmodifier)   	자기자신클래스내부    	  동일패키지에있는다른클래스   		   다른패키지에있는하위(자식)클래스        그외의영역  
   ----------------------------------------------------------------------------------------------------------------------- 
   public                                    O                    O                         O                 O  
   protected                                 O                    O                         O                 X
   default (생성자 앞에 아무 것도 안 쓰면 default임)     O                    O                         X                 X
   private                                   O                    X                         X                 X
*/	
	
	public String id;
	protected String passwd;
	String name;
	private String resdntNum;

	
	
	
	void abc() {
		System.out.println(resdntNum);
	}
	
	
	
}
