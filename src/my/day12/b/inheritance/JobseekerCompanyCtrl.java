package my.day12.b.inheritance;

import java.util.Scanner;



public class JobseekerCompanyCtrl {

	Jobseeker register(Scanner sc, Jobseeker[] jobskrArr) {
		
		String userid = null;
		String passwd = null;
		String name = null;
		String resdntNum = null;
		
		Jobseeker indv = new Jobseeker();
		
		boolean useridflag = false;
		
		do {
			System.out.print("1. 아이디 : ");
			userid = sc.nextLine();
			
			indv.setId(userid);
			userid = indv.getId();
			
			//중복아이디 검사
			for(int i=0; i<Jobseeker.count;i++) {	//기존 가입된 구직자 수만큼만 검사하면 되므로 객체가 만들어질때마다 1씩 증가한  count 만큼만 반복한다.
				if(userid.equals(jobskrArr[i].getId())) {
					System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
					useridflag = true;
					break;
				}
			}//end of for --------------------
			
		} while (useridflag);	//doWhile문은 true이면 반복, false이면 빠져나온다
		
		do {
			System.out.print("2. 암호 : ");
			passwd = sc.nextLine();
			
			indv.setPasswd(passwd);
			passwd = indv.getPasswd();
			
			if(passwd != null)
				break;
		} while (true);
			
		
		do {
			System.out.print("3. 성명 : ");
			name = sc.nextLine();
			
			indv.setName(name);
			name = indv.getName();
			
			if(name != null)
				break;
		} while (true);
		
		do {
			System.out.print("4. 주민번호 앞 7자리만 : ");
			resdntNum = sc.nextLine();
			indv.setresdntNum(resdntNum);
			resdntNum = indv.getResdntNum();
			
			if(resdntNum != null)
				break;
		} while (true);
		
		
		return indv;
		
	}//end of Jobseeker register(Scanner sc)------------------
	
	
	Company register(Scanner sc, Company[] coArr) {
		
		String userid = null;
		String passwd = null;
		String name = null;
		String industry = null;
		long money = 0;
		Company corp = new Company();
		
		boolean useridflag = false;
		
		do {
			System.out.print("1. 아이디 : ");
			userid = sc.nextLine();
			
			corp.setId(userid);
			userid = corp.getId();
			
			//중복아이디 검사
			for(int i=0; i<Company.count;i++) {	//기존 가입된 구직자 수만큼만 검사하면 되므로 객체가 만들어질때마다 1씩 증가한  count 만큼만 반복한다.
				if(userid.equals(coArr[i].getId())) {
					System.out.println(">> 이미 사용중인 아이디 입니다. <<\n");
					useridflag = true;
					break;
				}
			}//end of for --------------------
			
		} while (useridflag);	//doWhile문은 true이면 반복, false이면 빠져나온다
		
		
		do {
			System.out.print("2. 암호 : ");
			passwd = sc.nextLine();
			
			corp.setPasswd(passwd);
			passwd = corp.getPasswd();
			
			if(passwd != null)
				break;
			
		} while(true);
		
		do {
			System.out.print("3. 회사명 : ");
			name = sc.nextLine();
			
			corp.setName(name);
			name = corp.getName();
			
			if(name != null)
				break;
		} while (true);
		
		do {
			System.out.print("4. 업종 : ");
			industry = sc.nextLine();
			
			corp.setIndustryType(industry);
			industry = corp.getIndustryType();
			
			if(industry != null)
				break;
		} while (true);
		
		do {
			System.out.print("5. 자본금 : ");
			money = (long)Integer.parseInt(sc.nextLine());
			
			corp.setSeedMoney(money);
			money = corp.getSeedMoney();
			
			if(money > 0)
				break;
		} while (true);
		
		
		return corp;
		
		
	}//end of Company register(Scanner sc)------------------
	
	
	void showAll(Jobseeker[] jobskrArr) {
			
			System.out.println("----------------------------------------------------");
			System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
			System.out.println("----------------------------------------------------");
	
			
			for(int i=0; i<Jobseeker.count; i++)
				jobskrArr[i].viewInfo();
			
	}
	
	void showCompanyAll(Company[] coArr) {
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-15s\t%-12s\t\t%-5s\t\t%-5s\t\t%-2s\n","아이디","암호","회사명","업종","자본금");
		System.out.println("--------------------------------------------------------------------------");

		
		for(int i=0; i<Company.count; i++) {
			
			coArr[i].viewInfo();
			
		}
	
		System.out.println("\n");
}

	// == 구직자로 로그인하는 메소드 생성 ==
	public Jobseeker loginByJobseeker(Scanner sc,Jobseeker[] jobskrArr) {
		
		Jobseeker indv = null;
		
		System.out.print("▷아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("▷암호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Jobseeker.count; i++) {
			
			if(id.equals(jobskrArr[i].getId()) && passwd.equals(jobskrArr[i].getPasswd()) ) {
				System.out.println(">> 로그인 성공! <<");
				indv = jobskrArr[i];
				break;
			}
			
		}//end of for---------------------------
		
		if(indv == null) {
			System.out.println(">> 로그인 실패 <<");
		}
		
		return indv;
	}
	
	
	// == 구인회사로 로그인하는 메소드 생성 ==
	public Company loginByCompany(Scanner sc,Company[] coArr) {
		
		Company co = null;
		
		System.out.print("▷아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("▷암호 : ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Company.count; i++) {
			
			if(id.equals(coArr[i].getId()) && passwd.equals(coArr[i].getPasswd()) ) {
				System.out.println(">> 로그인 성공! <<");
				co = coArr[i];
				break;
			}
			
		}//end of for---------------------------
		
		if(co == null) {
			System.out.println(">> 로그인 실패 <<");
		}
		
		return co;
	}
	
	//== Method Overloading(메소드 오버로딩)==
	/*
	메소드의 이름은 같지만
	파라미터(매개변수)의 갯수 또는 파라미터의 종류 또는 파라미터의 순서가 다르면
	이름은 같지만 전혀 다른 메소드로 취급.
	이때 주의할것은 리턴타입은 뭐가 오든 관계가 없다
	
	public int abc(int n1, int n2) {
		
		return 0;
		
	}
	
	public double abc(int m1, double m2) {
		
		return 0;
		
	}
	
	public String abc(int x, double y) {
		
		return "안녕하세요";
		
	}
	*/
	
	
	//구직자의 내 정보 변경하기 메소드 생성
	public Jobseeker updateMyInfo(Scanner sc, Jobseeker indv) {
		
		//파라미터로 넘어온 Jobseeker indv의 정보를 보여준다.
		//즉, 로그인한 구직자의 정보를 보여줌.
		
		
		//System.out.println(indv);	//객체에 대한 정보(메모리 위치) 출력. 메모리에 올라간 주소를 출력한다.
		//my.day12.b.inheritance.Jobseeker@7d4991ad	//최상위 클래스인 Object 클래스에서는 이렇게 출력함.
		//또는
		//System.out.println(indv.toString());
		//my.day12.b.inheritance.Jobseeker@7d4991ad

		//indv.toString()을 Jobseeker 클래스에서 재정의한 후 
		System.out.println(indv);	//객체에 대한 정보(메모리 위치) 출력 => 내 정보 표시
		
		System.out.println("\n-----내 정보 변경하기 -----");
		
		
		do {
			System.out.print("▷ 암호변경 => ");
			String newPasswd = sc.nextLine();	// ex) 변경된 암호 "12345"
												//변경된 암호가 "super1234$A"(조건에 맞는 암호)라면
			
			indv.setPasswd(newPasswd);		// 12345는 조건에 맞지 않는 암호. 입력된 데이터를 passwd에 넣어주지 않는다
			String passwd = indv.getPasswd();	//따라서 passwd는 변경 전 암호, newPasswd는 암호정책에 맞지 않는 암호
			
												//변경된 암호가 "super1234$A"(조건에 맞는 암호)라면 passwd 변수에 저장할 것이므로
												// passwd는 변경된 새 암호
			
			if(newPasswd.equals(passwd))
				break;
		} while (true);
		
		do {
			System.out.print("▷ 성명변경 => ");
			String newName = sc.nextLine();
			
			indv.setName(newName);
			String name = indv.getName();
			
			if(newName.equals(name))
				break;
		} while (true);
		
		do {
			System.out.print("▷ 주민번호 7자리 변경 => ");
			String newResdntNum = sc.nextLine();
			
			indv.setresdntNum(newResdntNum);
			String resdntNum = indv.getResdntNum();
			
			if(newResdntNum.equals(resdntNum))
				break;
		} while (true);
		
		
		return indv;
	}

	
	
	
	
	//구인회사의 내 정보 변경하기 메소드 생성
	public Company updateMyInfo(Scanner sc,Company co) {
		
		//파라미터로 넘어온 Company co의 정보를 보여준다.
		//즉, 로그인한 구인회사의 정보를 보여줌.
		
		//System.out.println(co);
		//my.day12.b.inheritance.Company@28d93b30
		
		//System.out.println(co.toString());
		//my.day12.b.inheritance.Company@28d93b30
		
		//co.toString()을 Company 클래스에서 재정의한 후
		System.out.println(co);
		
		System.out.println("\n-----내 정보 변경하기 -----");
		
		
		do {
			
			System.out.print("▷ 암호변경 => ");
			String newPasswd = sc.nextLine();
			
			co.setPasswd(newPasswd);
			String passwd = co.getPasswd();
			
			if(newPasswd.equals(passwd))
				break;
			
		} while (true);
		
		do {
			System.out.print("▷ 회사명변경 => ");
			String newName = sc.nextLine();
			
			co.setName(newName);
			String name = co.getName();
			
			if(newName.equals(name))
				break;
		} while (true);
		
		do {
			System.out.print("▷ 업종 변경 => ");
			String newIndustryType = sc.nextLine();
			
			co.setIndustryType(newIndustryType);
			String industryType = co.getIndustryType();
			
			if(newIndustryType.equals(industryType))
				break;
		} while (true);
		
		do {
			System.out.print("▷ 자본금 변경 => ");
			String strSeedMoney = sc.nextLine();
			long newSeedMoney = Long.parseLong(strSeedMoney);
			
			co.setSeedMoney(newSeedMoney);
			long seedMoney = co.getSeedMoney();
			
			if(seedMoney > 0 && newSeedMoney == seedMoney)
				break;
		} while (true);
		
		return co;
		
		
	} //구인회사로 로그인 되어진 상태

	
	
}// end of  public Company loginByCompany(Scanner sc,Company[] coArr)
