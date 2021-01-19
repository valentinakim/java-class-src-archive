package my.day09.a.array;

import java.util.Scanner;

import my.util.MyUtil;

public class MemberMain3 {

	public static void main(String[] args) {

		Member2[] mbrArr = new Member2[3];
		
		/*
		for(int i=0; i<mbrArr.length; i++) {
			System.out.println(mbrArr[i]);
		}
		//null
		//null
		//null
		*/
		
		Scanner sc = new Scanner(System.in);
		int menuNum=0;
		
		do {
			System.out.println("=====>> 메뉴 <<=====\n" );
			System.out.println("1.회원가입 2.모든회원조회 3.프로그램 종료");
			System.out.print("▷선택하세요 => ");
			

			try {
				menuNum = Integer.parseInt(sc.nextLine());

				// '똘똘이' 3 5
				if(!(1 <= menuNum &&  menuNum <= 3)) {
					System.out.println(">> 메뉴에 없는 번호입니다.\n");
					continue;
				}
				
				switch (menuNum) {
				case 1:	//입력값이 int 값이므로 "1"라고 쓰면 안된다
						//회원가입
					Member2 mbr = new Member2();
					
					System.out.print("1.아이디 : ");
					mbr.id = sc.nextLine();
					
					do {
						System.out.print("2.비밀번호 : ");
						String passwd = sc.nextLine();
						
						boolean bool = MyUtil.isCheckPasswd(passwd);
						
						if(bool) {
							mbr.passwd = passwd;
							break;
						}
						else {
							System.out.println(">> 암호는 8글자 이상 15글자 이하의 영문 대소문자, 숫자, 특수문자가 혼합되어야 합니다.\n");
						}
						
					} while(true);
					
					
					System.out.print("3.성명 : ");
					mbr.name = sc.nextLine();
					
					for(int i=0; i<mbrArr.length; i++) {
						if(mbrArr[i] == null) {
							mbrArr[i] = mbr;
							break;
						}
					}//end of for------------------
					//mbrArr[0] = 정재현 객체	정재현 객체	
					//mbrArr[1] = 서영호 객체	서영호 객체
					//mbrArr[2] = 김선호 객체	null
					
					
					break;
					
					
				case 2:	//모든회원조회
					
					int nullCount=0;
					for(int i=0; i<mbrArr.length; i++) {
						if(mbrArr[i] != null) {
							System.out.println(mbrArr[i].showInfo()+"\n");
						}
						else {
							nullCount++;
						}
					}//end of for
					
					if(nullCount == mbrArr.length) {
						System.out.println("가입되어진 회원이 없습니다.");
					}
					
					break;

				}//end of switch---------------------------
			} catch(NumberFormatException e) {
				System.out.println(">> 정수만 입력하세요 <<\n");
			}
			
		} while (!(menuNum == 3));
		
		
		sc.close();
		System.out.println(">> 프로그램 종료 <<");
		
		
		
	}//end of main-----------------

}
