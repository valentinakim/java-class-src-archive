package my.day13.a.accessmodifier;

public class Child1 extends Parent {
	
	void viewInfo() {
		super.id = "leecl";			//public 동그라미(초록색)
		super.passwd = "qwer1234$";	//protected 마름모(노란색)
		super.name = "이채린"; 		//default 삼각형(파란색)
		//super.ressdnt				//private 사각형(빨간색) 다른 클래스에서 접근불가
	}

}
