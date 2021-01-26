package my.day14.b.abstractClass;

import java.util.Scanner;



public class JobseekerCompanyCtrl {

	// 구직자(Jobseeker) 및 구인회사(Company) 모두 신규 회원가입을 해주는 메소드
	public Member register(int n, Scanner sc, Member[] mbrArr) {
				//		   ^^^^^ 구분자
		
		Member mbr = null;
		
		if(n==1) {	// 구직자 신규회원가입
			
			mbr = new Jobseeker();
				//	  ^^^^^^^^^^ 추상 클래스인 부모 클래스 타입으로 객체 생성 가능
			
			do {
				System.out.print("1. 아이디 : ");
				String userid = sc.nextLine();
				
				mbr.setId(userid);
				userid = mbr.getId();
				
				if(userid != null) {
				
				// 등록되어진 구직자 중에서 중복아이디 검사
					boolean useridflag = false;
						
					for(int i=0; i<Member.count;i++) {
						if( mbrArr[i] instanceof Jobseeker && userid.equals(mbrArr[i].getId())) {	//mbrAr[i].getId()는 구직자 구인회사 둘다 해당되는 메소드인데 여기서는 구직자 아이디만 갖고 와야함.
							System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
							useridflag = true;
							break;
						}
					}//end of for --------------------
					
					if(!useridflag) 
						break;
				}
			} while (true);	//doWhile문은 true이면 반복, false이면 빠져나온다
			
			
			do {
				System.out.print("2. 암호 : ");
				String passwd = sc.nextLine();
				
				mbr.setPasswd(passwd);
				passwd = mbr.getPasswd();
				
				if(passwd != null)
					break;
			} while (true);
				
			
			do {
				System.out.print("3. 성명 : ");
				String name = sc.nextLine();
				
				mbr.setName(name);	//구직자 setName()을 호출. 맨 위 코드에서 Jobseeker 클래스에서객체를 만들었으므로
				name = mbr.getName();
				
				if(name != null)
					break;
				
			} while (true);
			
			do {
				System.out.print("4. 주민번호 앞 7자리만 : ");
				String resdntNum = sc.nextLine();
				
				((Jobseeker)mbr).setresdntNum(resdntNum);
				resdntNum = ((Jobseeker)mbr).getResdntNum();
				
				if(resdntNum != null)
					break;
			} while (true);
			
			
		
		}//end of if(n==1)
		
		else if(n==2) {	//구인회사 신규회원가입
		
			mbr = new Company();
	
			do {
				System.out.print("1. 아이디 : ");
				String userid = sc.nextLine();
				
				mbr.setId(userid);
				userid = mbr.getId();
				
				if(userid != null){
				
				//등록되어진 구인 회사 중에서 중복아이디 검사
					boolean useridflag = false;
	
					for(int i=0; i<Member.count;i++) {	//기존 가입된 구직자 수만큼만 검사하면 되므로 객체가 만들어질때마다 1씩 증가한  count 만큼만 반복한다.
						if(mbrArr[i] instanceof Company && userid.equals(mbrArr[i].getId())) {
							System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
							useridflag = true;
							break;
						}
					}//end of for --------------------
					
					if(!useridflag)
						break;
				}
			} while (true);	//doWhile문은 true이면 반복, false이면 빠져나온다
			
			
			do {
				System.out.print("2. 암호 : ");
				String passwd = sc.nextLine();
				
				mbr.setPasswd(passwd);
				passwd = mbr.getPasswd();
				
				if(passwd != null)
					break;
				
			} while(true);
			
			do {
				System.out.print("3. 회사명 : ");
				String name = sc.nextLine();
				
				mbr.setName(name);	//mbr을 new Company로 재정의했으므로 Company의 setName 메소드를 호출.
				name = mbr.getName();
				
				if(name != null)
					break;
			} while (true);
			
			do {
				System.out.print("4. 업종 : ");
				String industry = sc.nextLine();
				
				((Company)mbr).setIndustryType(industry);
				industry = ((Company)mbr).getIndustryType();
				
				if(industry != null)
					break;
			} while (true);
			
			do {
				System.out.print("5. 자본금 : ");
				long money = (long)Integer.parseInt(sc.nextLine());
				
				((Company)mbr).setSeedMoney(money);
				money = ((Company)mbr).getSeedMoney();
				
				if(money > 0)
					break;
			} while (true);
			
			
		}
		return mbr;
	}//end of public Member register(int n, Scanner sc, Member[] mbrArr)------------------
	
	
	//구직자의 정보를 모두 보여주는 메소드 생성
	void showAll(Member[] mbrArr) {
			
			System.out.println("----------------------------------------------------");
			System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
			System.out.println("----------------------------------------------------");
	
			for(int i=0; i<Member.count; i++)
				if(mbrArr[i] instanceof Jobseeker)
				mbrArr[i].viewInfo();
			
	}
	
	//구인회사의 정보를 모두 보여주는 메소드 생성
	void showCompanyAll(Member[] mbrArr) {
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-15s\t%-12s\t\t%-5s\t\t%-5s\t\t%-2s\n","아이디","암호","회사명","업종","자본금");
		System.out.println("--------------------------------------------------------------------------");

		
		for(int i=0; i<Member.count; i++) {
			
			if(mbrArr[i] instanceof Company)
			mbrArr[i].viewInfo();
			
		}
	
}

	// == 구직자 및 구인회사로 로그인하는 메소드 생성 ==
	public Member login(int n, Scanner sc,Member[] mbrArr) {
		
		Member mbr = null;
		
		System.out.print("▷아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("▷암호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Member.count; i++) {
			
			if(n==3 && mbrArr[i] instanceof Jobseeker) {	//구직자 로그인
				
				if(id.equals(mbrArr[i].getId()) && passwd.equals(mbrArr[i].getPasswd()) ) {
					System.out.println(">> 로그인 성공! <<");
					mbr = mbrArr[i];
					break;
				}
			}
			else if(n==4 && mbrArr[i] instanceof Company) {	//구인회사 로그인
				
				if(id.equals(mbrArr[i].getId()) && passwd.equals(mbrArr[i].getPasswd()) ) {
					System.out.println(">> 로그인 성공! <<");
					mbr = mbrArr[i];
					break;
				}
				
			}
			
		}//end of for------------
			

		if(mbr == null) 
			System.out.println(">> 로그인 실패 <<");
		
		return mbr;
	}//end of public Member login(int n, Scanner sc,Member[] mbrArr)
	
	
	
	// == 구직자 및 구인회사의 내 정보 변경하기 메소드 생성 ==
	
	
	/* 내가 짠 코드
	public Member updateMyInfo(int n, Scanner sc, Member mbr) {
		
		
		System.out.println("\n-----내 정보 변경하기 -----");
		
		
		do {
			System.out.print("▷ 암호변경 => ");
			String newPasswd = sc.nextLine();
			
			mbr.setPasswd(newPasswd);
			String passwd = mbr.getPasswd();
			
			if(newPasswd.equals(passwd))
				break;
		} while (true);
		
		
		if(n==5) {
		
			do {
				System.out.print("▷ 성명변경 => ");
				String newName = sc.nextLine();
				
				mbr.setName(newName);
				String name = mbr.getName();
				
				if(newName.equals(name))
					break;
			} while (true);
			
			do {
				System.out.print("▷ 주민번호 7자리 변경 => ");
				String newResdntNum = sc.nextLine();
				
				((Jobseeker)mbr).setresdntNum(newResdntNum);
				String resdntNum = ((Jobseeker)mbr).getResdntNum();
				
				if(newResdntNum.equals(resdntNum))
					break;
			} while (true);
			
		}
		
	
		if(n==6) {
		
			do {
				System.out.print("▷ 회사명변경 => ");
				String newName = sc.nextLine();
				
				mbr.setName(newName);
				String name = mbr.getName();
				
				if(newName.equals(name))
					break;
			} while (true);
			
			do {
				System.out.print("▷ 업종 변경 => ");
				String newIndustryType = sc.nextLine();
				
				((Company)mbr).setIndustryType(newIndustryType);
				String industryType = ((Company)mbr).getIndustryType();
				
				if(newIndustryType.equals(industryType))
					break;
			} while (true);
			
			do {
				System.out.print("▷ 자본금 변경 => ");
				String strSeedMoney = sc.nextLine();
				long newSeedMoney = Long.parseLong(strSeedMoney);
				
				((Company)mbr).setSeedMoney(newSeedMoney);
				long seedMoney = ((Company)mbr).getSeedMoney();
				
				if(seedMoney > 0 && newSeedMoney == seedMoney)
					break;
			} while (true);
		}
	
		return mbr;
	}
	*/	
	public Member updateMyInfo(Scanner sc, Member mbr) {
		
		System.out.println("\n-----내 정보 변경하기 -----\n");

		System.out.println(mbr.showInfo());
		
		if(mbr instanceof Jobseeker) {
			//구직자로 로그인 되어진 경우
			do {
				System.out.print("▷ 암호변경 => ");
				String newPasswd = sc.nextLine();
				
				mbr.setPasswd(newPasswd);
				String passwd = mbr.getPasswd();	
				
				if(newPasswd.equals(passwd))
					break;
			} while (true);
			
			do {
				System.out.print("▷ 성명변경 => ");
				String newName = sc.nextLine();
				
				mbr.setName(newName);
				String name = mbr.getName();
				
				if(newName.equals(name))
					break;
			} while (true);
			
			do {
				System.out.print("▷ 주민번호 7자리 변경 => ");
				String newResdntNum = sc.nextLine();
				
				((Jobseeker)mbr).setresdntNum(newResdntNum);
				String resdntNum = ((Jobseeker)mbr).getResdntNum();
				
				if(newResdntNum.equals(resdntNum))
					break;
			} while (true);
		}
			else {
				//구인회사로 로그인 되어진 경우
				do {
					
					System.out.print("▷ 암호변경 => ");
					String newPasswd = sc.nextLine();
					
					mbr.setPasswd(newPasswd);
					String passwd = mbr.getPasswd();
					
					if(newPasswd.equals(passwd))
						break;
					
				} while (true);
				
				do {
					System.out.print("▷ 회사명변경 => ");
					String newName = sc.nextLine();
					
					mbr.setName(newName);
					String name = mbr.getName();
					
					if(newName.equals(name))
						break;
				} while (true);
				
				do {
					System.out.print("▷ 업종 변경 => ");
					String newIndustryType = sc.nextLine();
					
					((Company)mbr).setIndustryType(newIndustryType);
					String industryType = ((Company)mbr).getIndustryType();
					
					if(newIndustryType.equals(industryType))
						break;
				} while (true);
				
				do {
					System.out.print("▷ 자본금 변경 => ");
					String strSeedMoney = sc.nextLine();
					long newSeedMoney = Long.parseLong(strSeedMoney);
					
					((Company)mbr).setSeedMoney(newSeedMoney);
					long seedMoney = ((Company)mbr).getSeedMoney();
					
					if(seedMoney > 0 && newSeedMoney == seedMoney)
						break;
				} while (true);
		}
		
		return mbr;
	}
		
}// end of  public Company loginByCompany(Scanner sc,Company[] coArr)
