package my.day16.a.exception;

public class ExceptionTest {

	public static void main(String[] args) {

		System.out.println("\n 1.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		//1. ArrayIndexOutOfBoundsException
		//==> 배열의 크기가 오버 되어지면 발생
		
		 String[] subjectArr = {"자바", "오라클", "JSP"};
		 
		 try {
			 
			 for(int i=0; i<subjectArr.length; i++) {
				 System.out.println(subjectArr[i]);
			 }
			 
		 } catch (ArrayIndexOutOfBoundsException e) {
			 System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
			 //System.out.println(e.getMessage());
			 //e.getMessage() 오류메세지 출력
			 
			 //e.printStackTrace();	// 오류 발생 지점 출력
		 }
		 
		 System.out.println("\n 2.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 //2. ArithmeticException
		 //==> 분모에 0이 들어가는 경우에 발생하는 익셉션
		 
		 try {
			 
			 int num = 10;
			 
			 for(int i=2; i>=0; i--) {
				 System.out.println(num/i);
			 }
			 
		 } catch(ArithmeticException e) {
			 System.out.println(">> 분모에는 0이 올 수 없습니다. \n");
			 System.out.println(e.getMessage());
			 //e.getMessage() 오류메세지 출력
			 
			//e.printStackTrace();	// 오류 발생 지점 출력
		 }
		 
		 System.out.println("\n3.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		
		 int[] numArr = {10,20,30};
		 
		 try {
			 for(int i=3; i>=0; i--) {
				 int val = numArr[i]/i;		//numArr[3]/3, 30/2,30/1, 30/0
				 System.out.println(val);
			 }
		 } catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(">> 배열의 인덱스 범위가 초과되었습니다. \n");
		 }
		 
		 System.out.println("\n4.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 for(int i=3; i>=0; i--) {
		 
			 try {
				 int val = numArr[i]/i;		//numArr[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			 } catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("에러메세지 : "+e.getMessage());
			 } catch(ArithmeticException e) {
				 System.out.println("에러메세지 : "+e.getMessage());
			 }
		 
		 }
		 
		 System.out.println("\n5.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 for(int i=3; i>=0; i--) {
			 
			 try {
				 int val = numArr[i]/i;		//numArr[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			 } catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
				 System.out.println("에러메세지 : "+e.getMessage());
			 }
		 }	 

		 System.out.println("\n6.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 for(int i=3; i>=0; i--) {
			 
			 try {
				 int val = numArr[i]/i;		//numArr[3]/3, 30/2, 30/1, 30/0
				 System.out.println(val);
			 } catch(Exception e) {
				 System.out.println("에러메세지 : "+e.getMessage());
			 }
		 }	 
		 
		 System.out.println("\n7.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 String[] strArr = {"10", "스물", "30"};
		 
		 for(int i=3; i>=0; i--) {
			 
			 try {
				 int val = Integer.parseInt(strArr[i])/i;		//numArr[3]/3, 30/2, Integer.parseInt("스물")/1, 10/0
				 System.out.println(val);
			 } catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("배열의 인덱스 번호 "+e.getMessage()+"이 존재하지 않습니다.");
			 }catch(ArithmeticException e) {
				 System.out.println("분모에 0을 넣을 수 없습니다.");
			 }catch(Exception e) {
				 System.out.println("오류메시지 : "+e.getMessage());
			 }
		 }	 
		 /*
		 System.out.println("\n.8~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 for(int i=3; i>=0; i--) {
			 
			 try {
				 int val = Integer.parseInt(strArr[i])/i;		//numArr[3]/3, 30/2, Integer.parseInt("스물")/1, 10/0
				 System.out.println(val);
			 }catch(Exception e) {
				 System.out.println("오류메시지 : "+e.getMessage());
			 } catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("배열의 인덱스 번호 "+e.getMessage()+"이 존재하지 않습니다.");
			 }catch(ArithmeticException e) {
				 System.out.println("분모에 0을 넣을 수 없습니다.");
		 }		//오류 발생.
		 Exception 처리시 부모클래스의 Exception은 맨 아래에 나와야 한다.
		 실행 순서가 위에서부터 아래로 내려오면서 예외 처리를 하는데 예외클래스의 부모인 Exception이 맨 마지막에 위치해야만
		 자식 클래스가 처리하지 못하는 오류를 처리할 수 있다. 맨 처음에 위치해버리면 Exception이 처리하지 못하는 다른 오류를 자식 예외클래스에서 처리하지 못하므로  Unreachable code 오류가 발생.
		 
		 
		 */
		 
		 System.out.println("\n9.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 String[] strArr2 = {"10", "20", "30", "40"};
		 
		 int cnt = 0;
		 
		 for(int i=3; i>=0; i--) {
			 
			 try {
				 int val = Integer.parseInt(strArr2[i])/(i+1);		//numArr[3]/3, 30/2, Integer.parseInt("스물")/1, 10/0
				 System.out.println(val);
			 } finally {
				 System.out.println(++cnt + ".finally : 오류 발생여부 관계없이 무조건 실행합니다\n");
			 } //오류 발생 여부에 상관없이 무조건 실행해야 하는 것들은 finally 부분에 기술해주면 된다.
		 }	 
		 
		 System.out.println("\n10.~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
		 
		 String[] strArr3 = {"10", "스물", "30"};

		 cnt = 0;
		 
		 for(int i=3; i>=0; i--) {
			 
			 try {
				 int val = Integer.parseInt(strArr3[i])/(i+1);		//numArr[3]/3, 30/2, Integer.parseInt("스물")/1, 10/0
				 System.out.println(val);
			 } catch(ArrayIndexOutOfBoundsException e) {
				 System.out.println("배열의 인덱스 번호 "+e.getMessage()+"이 존재하지 않습니다.");
			 }catch(ArithmeticException e) {
				 System.out.println("분모에 0을 넣을 수 없습니다.");
			 }/*catch(Exception e) {
				 System.out.println("오류메시지 : "+e.getMessage());
			 }*/ finally {
				 System.out.println(++cnt + ".finally : 오류 발생여부 관계없이 무조건 실행합니다\n");
			 }
		 }	 
		 
		 //오류 발생하면 그 지점에서 프로그램이 멈춰버리기 때문에 그 아래로 실행이 안된다. 위의 예시의 경우에는 finally를 실행하기 전에 오류발생이 되어 멈춰버린다. 따라서 반드시 Exception 처리를 해주어야 한다.
		 
		 
	}//end of main------------------------------------------------------

}
