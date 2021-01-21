package my.day11.b.abstraction;

import java.util.Scanner;

import my.util.MyUtil;

public class GujikjaCtrl {

	// 구직자(Gujikja) 신규 회원가입을 해주는 메소드 생성하기
	Gujikja register(Scanner sc, Gujikja[] guArr) {
		//			^^^^^^^^^^^^^^^^^^^^^^^^^^^^^ 스캐너와 기존 구직자 배열 정보를 메인에서 받아온다. 구직자 배열을 받아오는 이유는 기존에 동일한 아이디 정보가 있는지 알아보기 위해서
		
		
		String userid = null;
		String passwd = null;
		String name = null;
		String jubun = null;
		
		boolean useridflag = false;
		
		do {
			System.out.print("1. 아이디 : ");
			userid = sc.nextLine();	//아무것도 안 쓰고 엔터 쓰면은 null이 아니고 ""로 입력이 됨

			//중복아이디 검사
			
			
			for(int i=0; i<Gujikja.count;i++) {	//기존 가입된 구직자 수만큼만 검사하면 되므로 객체가 만들어질때마다 1씩 증가한  count 만큼만 반복한다.
				if(userid.equals(guArr[i].userid)) {
					System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
					useridflag = true;
					break;
				}
				
			}//end of for --------------------
			
		} while (useridflag);	//doWhile문은 true이면 반복, false이면 빠져나온다
		
		//////////////////////////////////////////////////////////////////
		
		do {
			System.out.print("2. 암호 : ");
			passwd = sc.nextLine();
			if(!MyUtil.isCheckPasswd(passwd)) {
				System.out.println(">> 암호는 8~15글자 대,소문자 및 숫자, 특수기호가 혼합되어야 합니다.");
			}
			else
				break;
			
		} while(true);
		
		///////////////////////////////////////////////////////////////////
		
		System.out.print("3. 성명 : ");
		name = sc.nextLine();
		
		///////////////////////////////////////////////////////////////////
		
		do {
			System.out.print("4. 주민번호 앞 7자리만 : ");
			jubun = sc.nextLine();
			
			if(!MyUtil.isCheckJubun(jubun))
				System.out.println(">> 주민번호를 7자리를 올바르게 넣으세요");
			else
				break;
			
		} while(true);

		///////////////////////////////////////////////////////////////////

		Gujikja gu = new Gujikja();
		gu.userid = userid;
		gu.passwd = passwd;
		gu.name = name;
		gu.jubun = jubun;
		
		
		
		return gu;
	}//end of Gujikja register(Scanner sc)------------------
	
	
	
	// 구직자 모두보기를 해주는 메소드 생성
	
	void showAll(Gujikja[] guArr) {
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		System.out.println("----------------------------------------------------");

		
		for(int i=0; i<Gujikja.count; i++) {
			
			//guArr[i].showInfo();
			guArr[i].viewInfo();
			
		}
		
	}//end of void showAll(Gujikja[] guArr)
	
	
	// 연령대를 입력받아 해당 연령대에 속하는 구직자 정보를 출력해주는 메소드 생성
	void showByAgeline(Gujikja[] guArr,int gucount, int ageline) {
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		System.out.println("----------------------------------------------------");
		
		
		boolean flag = false;
		
		for(int i=0; i<gucount; i++) {
			
			int storedAgeline = guArr[i].getAge()/10*10;	
			// 27/10*10 ==> 20	25/10*10 ==> 20
			// int는 나누기 연산을 하면 몫만 표시한다 따라서 27/10 => 2가 나오고 27/10*10을 하면 20이 됨
			
			if(storedAgeline == ageline) {
				flag = true;
				guArr[i].viewInfo();
			}
				
			
		}//end of for---------------------------
			
		if(!flag) {
			System.out.println(">> 검색하신 "+ageline+"대는 없습니다.");
		}
		
		
	}//end of void showByAgeline-----------------
	
	
	void showByGender(Gujikja[] guArr,int gucount, int sgender) {
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		System.out.println("----------------------------------------------------");
		
		for(int i=0; i<gucount; i++) {
			if(sgender == 1) {
				if(guArr[i].getGender() == "남")
					guArr[i].viewInfo();
			}
			else if(sgender ==2) {
				if(guArr[i].getGender() == "여") {
					guArr[i].viewInfo();
					}
			}
			
		}
			
			
		}//end of showByGender---------------------------
			
		
	
	void showByBoth(Gujikja[] guArr, int gucount, int ageline2, int genderNum2) {
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		System.out.println("----------------------------------------------------");
		
		String gender = "";
		if(genderNum2 == 1) {
			gender = "남";
		}
		else if(genderNum2 ==2) {
			gender = "여";
		}
		
		boolean flag = false;
		
		for(int i=0; i<gucount; i++) {
			
			int storedAgeline = guArr[i].getAge()/10*10;
			if(storedAgeline == ageline2 && guArr[i].getGender().equals(gender)) {
				flag = true;
				guArr[i].viewInfo();
			}
			
		}//end of for---------------------------
			
		if(!flag) {
			System.out.println(">> 검색하신 "+ageline2+"대의 "+gender+"자는 없습니다.");
		}
		
		
		
		
	}//end of showByBoth---------------------------
	
	
		
	}
	
	
	
	

