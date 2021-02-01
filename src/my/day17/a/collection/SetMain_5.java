package my.day17.a.collection;

import java.util.*;

public class SetMain_5 {

	/*
    == HashSet == 
    1. 출력시 저장된 순서가 유지되지 않는다.
    2. 중복된 데이터를 저장할 수 없다.
              그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
              
    == LinkedHashSet ==
    1. 출력시 저장된 순서가 유지된다.
    2. 중복된 데이터를 저장할 수 없다.
              그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.        
	 */
	
	public static void main(String[] args) {

		
		System.out.println("\n ==== HashSet ==== \n");
		
		//1. Member 클래스의 객체만을 저장할 수 있는 HashSet 객체 mbrHashSet 을 생성한다.

		Set<Member> mbrHashSet = new HashSet<>();
	//	^^^ Set계열 인터페이스로 데이터 타입을 지정
		
		//2.Member 클래스의 객체 6개를 생성하여 mbrHastSet에 저장한다.
		
		mbrHashSet.add(new Member("youjs","qwer1234$","유재석"));
		mbrHashSet.add(new Member("eom","qwer1234$","엄정화"));
		mbrHashSet.add(new Member("kanghd","qwer1234$","강호동"));
		mbrHashSet.add(new Member("leess","qwer1234$","이순신"));
		mbrHashSet.add(new Member("kimth","qwer1234$","김태희"));
		mbrHashSet.add(new Member("kangkc","qwer1234$","강감찬"));	
		 
		mbrHashSet.add(new Member("leess","qwer1234$","이순신"));		//위의 "이순신" Member와는 다른 것이다. 똑같은 데이터 값이지만 저장된 메모리 주소가 다르다.

		Member mbr1 = new Member("suji","abcd1234$","수지");
		Member mbr2 = new Member("chaew","abcd1234$","차은우");
		
		mbr1 = mbr2;	//mbr1은 mbr2의 메모리주소를 참조한다. mbr2가 참조하고 있는 메모리 주소를 mbr1에 준것임.
		
		//
		mbrHashSet.add(mbr1);
		mbrHashSet.add(mbr2);
		/*
		 mbr1과 mbr2는 동일한 객체(차은우)를 가리키는 것이므로 mbrHastSet에는 mbr1이 이미 저장되었으므로 mbr2는 저장되지 않는다. Hastset에 중복 저장 안됨.
		 */
		
		//3. mbrHastSet에 저장되어진 모든 Member들의 정보를 출력한다.
		//Set 계열은 저장된 데이터(요소)에 접근해서 읽어오기 위해서는 Iterator를 통해서만 가능하다
		
		Iterator<Member> it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			// it.hasNext() 은  it 에서 현재 it가 가지고 있는 여러 Member 데이터중 하나를 끄집어내서 존재하는지를 알아보는 것이다.
	        // 존재하면 true, 존재하지 않으면 false.
			
			Member mbr = it.next();
			// 실제로 Member를 it 에서  끄집어낸다. 끄집어 낸 후에는 Member에 더이상 it 에는 남아있지 않게 된다.
		
			mbr.infoPrint();
		
		}
		
		//4. mbrhastSet에 저장되어진 회원(Member)들 중에 아이디가 "leess"인 회원의 정보를 출력하세요.
		
		it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			Member mbr = it.next();
			
			if(mbr.id.equals("leess")) {
				mbr.infoPrint();				
			}
		}
		
		//5. mbrhastSet에 저장되어진 회원(Member)들 중에 아이디가 "leess"인 회원의 정보를 삭제하세요.
		
		it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			Member mbr = it.next();
			
			if(mbr.id.equals("leess")) {
				it.remove();
				// mbrHashSet 에 저장된 요소(Element)를 삭제하려면 Iterator를 이용한 it.remove(); 을 사용하여 삭제한다.
			}
		}
		
		it = mbrHashSet.iterator();
		
		while(it.hasNext()) {
			Member mbr = it.next();
			mbr.infoPrint();
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		
		System.out.println("\n ==== LinkedHashSet ==== \n");
		
		//1. Member 클래스의 객체만을 저장할 수 있는 HastSet 객체 mbrHashSet 을 생성한다.

		Set<Member> mbrLinkedHashSet = new LinkedHashSet<>();
	//	^^^ Set계열 인터페이스로 데이터 타입을 지정
		
		//2.Member 클래스의 객체 6개를 생성하여 LinkedHashSet에 저장한다.
		
		mbrLinkedHashSet.add(new Member("youjs","qwer1234$","유재석"));
		mbrLinkedHashSet.add(new Member("eom","qwer1234$","엄정화"));
		mbrLinkedHashSet.add(new Member("kanghd","qwer1234$","강호동"));
		mbrLinkedHashSet.add(new Member("leess","qwer1234$","이순신"));
		mbrLinkedHashSet.add(new Member("kimth","qwer1234$","김태희"));
		mbrLinkedHashSet.add(new Member("kangkc","qwer1234$","강감찬"));	
		 
		mbrLinkedHashSet.add(new Member("leess","qwer1234$","이순신"));		//위의 "이순신" Member와는 다른 것이다. 똑같은 데이터 값이지만 저장된 메모리 주소가 다르다.

		Member mbr3 = new Member("suji","abcd1234$","수지");
		Member mbr4 = new Member("chaew","abcd1234$","차은우");
		
		mbr3 = mbr4;	//mbr은 mbr4의 메모리주소를 참조한다. mbr4가 참조하고 있는 메모리 주소를 mbr3에 준것임.
		
		//
		mbrLinkedHashSet.add(mbr3);
		mbrLinkedHashSet.add(mbr4);
		/*
		 mbr3과 mbr4는 동일한 객체(차은우)를 가리키는 것이므로 mbrHastSet에는 mbr3이 이미 저장되었으므로 mbr4는 저장되지 않는다. Hastset에 중복 저장 안됨.
		 */
		
		//3. mbrLinkedHashSet에 저장되어진 모든 Member들의 정보를 출력한다.
		//Set 계열은 저장된 데이터(요소)에 접근해서 읽어오기 위해서는 Iterator를 통해서만 가능하다
		
		Iterator<Member> it2 = mbrLinkedHashSet.iterator();
		
		while(it2.hasNext()) {
			// it2.hasNext() 은  it2 에서 현재 it2가 가지고 있는 여러 Member 데이터중 하나를 끄집어내서 존재하는지를 알아보는 것이다.
	        // 존재하면 true, 존재하지 않으면 false.
			
			Member mbr = it2.next();
			// 실제로 Member를 it2에서  끄집어낸다. 끄집어 낸 후에는 Member에 더이상 it2 에는 남아있지 않게 된다.
		
			mbr.infoPrint();
		
		}
		
		//4. mbrLinkedHashSet에 저장되어진 회원(Member)들 중에 아이디가 "leess"인 회원의 정보를 출력하세요.
		
		it2 = mbrLinkedHashSet.iterator();
		
		while(it2.hasNext()) {
			Member mbr = it2.next();
			
			if(mbr.id.equals("leess")) {
				mbr.infoPrint();				
			}
		}
		
		//5. mbrhastSet에 저장되어진 회원(Member)들 중에 아이디가 "leess"인 회원의 정보를 삭제하세요.
		
		it = mbrLinkedHashSet.iterator();
		
		while(it2.hasNext()) {
			Member mbr = it2.next();
			
			if(mbr.id.equals("leess")) {
				it2.remove();
				// mbrHashSet 에 저장된 요소(Element)를 삭제하려면 Iterator를 이용한 it.remove(); 을 사용하여 삭제한다.
			}
		}
		
		it = mbrLinkedHashSet.iterator();
		
		while(it2.hasNext()) {
			Member mbr = it2.next();
			mbr.infoPrint();
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		
	}

}
