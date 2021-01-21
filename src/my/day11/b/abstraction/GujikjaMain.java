package my.day11.b.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaMain {

	public static void main(String[] args) {

		Gujikja[] guArr = new Gujikja[5];
		
		
		Gujikja gu1 = new Gujikja();
		gu1.userid = "jjh0214";
		gu1.passwd = "Qwer1234$";
		gu1.name = "정재현";
		
		//===정규표현식(Regular Expression) 사용하여 유효성 검사하기===
		//boolean bool = MyUtil.isCheckJubun(null);	//NullPointerException
		//boolean bool = MyUtil.isCheckJubun("950115");	//false
		//boolean bool = MyUtil.isCheckJubun("95011512"); //false
		//boolean bool = MyUtil.isCheckJubun("9501t151"); //false
		//boolean bool = MyUtil.isCheckJubun("9501213"); //false
		
		//System.out.println(bool);
		
		String jubun = "9702141";
		
		boolean bool = MyUtil.isCheckJubun(jubun);
		
		
		if(bool) {
			gu1.jubun = jubun;
			guArr[0] = gu1;
			
			Gujikja.count++;  //구직자 객체를 만들때마다 1씩 증가
			
		}
		
		
		//===정규표현식(Regular Expression) 사용하여 유효성 검사하기===
		//bool = MyUtil.isCheckJubun2(null);	//NullPointerException
		//bool = MyUtil.isCheckJubun2("950115");	//false 숫자범위 미달
		//bool = MyUtil.isCheckJubun2("95011512"); //false 숫자범위 초과
		//bool = MyUtil.isCheckJubun2("9501t151"); //false 숫자가 아닌 문자 입력
		//bool = MyUtil.isCheckJubun2("9501215"); //false 마지막 숫자 1~4 범위 외의 숫자 입력
		//bool = MyUtil.isCheckJubun2("9513151"); //true 13월은 없지만 메소드에 현재 13월은 false라는 판단을 내리는 코드를 안 짰고 다른 예외사항에는 해당사항이 없으므로 true값이 나온다
		//bool = MyUtil.isCheckJubun2("9501212"); //true
		//boolean bool = MyUtil.isCheckJubun2("9501213"); //false
		
		
		System.out.println(bool);

		//System.out.println("성별 : " + gu.getGender());
		//System.out.println("나이 : " + gu.getAge());
		
		Gujikja gu2 = new Gujikja();
		gu2.userid = "johnnysuh";
		gu2.passwd = "Qwer4567$";
		gu2.name = "서영호";
		gu2.jubun = "9702091";
		
		guArr[1] = gu2;
		Gujikja.count++;
		
		Gujikja gu3 = new Gujikja();
		gu3.userid = "leecl";
		gu3.passwd = "Qwer4567$";
		gu3.name = "이채린";
		gu3.jubun = "9104212";
		
		guArr[2] = gu3;
		Gujikja.count++;
		
		/////////////////////////////////////////////////////////////////////////////
		
		GujikjaCtrl ctrl = new GujikjaCtrl();
		
		Scanner sc = new Scanner(System.in);
		
		String smenuNum ="";
		
		do {
			
			System.out.println("\n=== 메인 메뉴 === \n"
					+ "1.구직자 회원가입 2. 구직자 모두보기 3.검색  4. 프로그램 종료\n");
			System.out.print("▷메뉴 번호 선택 => ");
			smenuNum = sc.nextLine();
			
			switch (smenuNum) {
				case "1":	//구직자 회원가입
					Gujikja gujikja = ctrl.register(sc, guArr);
					guArr[Gujikja.count++] = gujikja;	
					System.out.println(">> 회원가입 성공! \n");
					break;
	
				case "2":	//구직자 모두보기
					ctrl.showAll(guArr);
					
				case "3":	//검색메뉴를 보여주도록 호출
					
					searchMenu(sc, ctrl, guArr);
					break;
					
				default:
					break;
			}
		} while (!("4".equals(smenuNum)));
		
		sc.close();
		
		System.out.println("\n===== 프로그램 종료 =======");
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main-----------------

	
	static void searchMenu(Scanner sc, GujikjaCtrl ctrl, Gujikja[] guArr) {
		
		String sMenuNum = "";
		do {
		
			System.out.println("\n===== 검색메뉴 =====\n"
								+ "1. 연령대 검색  2. 성별 검색 3. 연령대 및 성별 검색 4. 메인으로 돌아가기\n");
			System.out.print("▷ 검색메뉴번호 선택 =>");
			sMenuNum = sc.nextLine();
			
			switch (sMenuNum) {
			case "1":
				System.out.print("▷ 연령대 =>");
				String sageline = sc.nextLine();
				int ageline = Integer.parseInt(sageline);	//20
				
				ctrl.showByAgeline(guArr, Gujikja.count, ageline);
				
				break;
				
			case "2":
				System.out.println("▷ 성별 선택[1 남/ 2 여] =>");
				String sgenderNum = sc.nextLine();
				int genderNum = Integer.parseInt(sgenderNum);
				
				ctrl.showByGender(guArr, Gujikja.count, genderNum);
				
				break;
			case "3":
				System.out.print("▷ 연령대 =>");
				String sageline2 = sc.nextLine();
				int ageline2 = Integer.parseInt(sageline2);
				System.out.println("▷ 성별 선택[1 남/ 2 여] =>");
				String sgenderNum2 = sc.nextLine();
				int genderNum2 = Integer.parseInt(sgenderNum2);

				
				ctrl.showByBoth(guArr, Gujikja.count, ageline2, genderNum2);
				
				
				break;
	
			default:
				break;	//switch의 break. doWhile문의 break가 아니다
			}//end of switch------------------------------
			
		
		} while(!("4".equals(sMenuNum)));
		
	}//end of searchMenu()-------------------------
	
	
	
	
	
	
}
