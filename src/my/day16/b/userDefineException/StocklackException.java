package my.day16.b.userDefineException;

// == 사용자(개발자)가 정의하는 예외(Exception)절 클래스 만들기 ==
/*
 	1.Exception 클래스를 상속받는다
 	2.생성자내에서 예외메세지(오류메세지)를 등록한다
 
 */


public class StocklackException extends Exception{

	private static final long serialVersionUID = 1L;

	//기본 생성자
	public StocklackException() {
		super(">> 잔고량이 없어 주문이 불가합니다.");	//e.getMessage()와 같은 기능
	}
	
	//파라미터가 있는 생성자
	
	public StocklackException(String errMsg) {
		super(errMsg);	//e.getMessage()와 같은 기능
	}
	
	
	
	
}
