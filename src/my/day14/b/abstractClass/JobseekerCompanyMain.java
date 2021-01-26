package my.day14.b.abstractClass;

import java.util.Scanner;


public class JobseekerCompanyMain {

	public static void main(String[] args) {

		Member[] mbrArr = new Member[10];
		
		Jobseeker indv1 = new Jobseeker();
		indv1.setId("jjh0214");
		indv1.setPasswd("Qwer123!@#");
		indv1.setName("정재현");
		indv1.setresdntNum("9702141");
		
		if(indv1.isRegistered()) {
			mbrArr[Member.count++] = indv1;
		}
		
		Jobseeker indv2 = new Jobseeker();
		indv2.setId("leecl");
		indv2.setPasswd("Qwer456!@#");
		indv2.setName("이채린");
		indv2.setresdntNum("9102262");
		
		if(indv2.isRegistered()) {
			mbrArr[Member.count++] = indv2;
		}
		
		Company co1 = new Company();
		co1.setId("mycompany");
		co1.setPasswd("Qwer456!@#");
		co1.setName("SK");
		co1.setIndustryType("IT");
		co1.setSeedMoney(20000000);
		
		if(co1.isRegistered()) {
			mbrArr[Member.count++] = co1;
		}
		
		Company co2 = new Company();
		co2.setId("monsterinc");
		co2.setPasswd("Qwer456!@#");
		co2.setName("monsterincorporation");
		co2.setIndustryType("Energy");
		co2.setSeedMoney(20000000);
		
		if(co2.isRegistered()) {
			mbrArr[Member.count++] = co2;
		}
		
		
		JobseekerCompanyCtrl ctrl = new JobseekerCompanyCtrl();
		
		Scanner sc = new Scanner(System.in);
		
		String smenuNum ="";
		
		Member mbr = null;
		String title = "";
		
		do {

			if(mbr == null)
				title = "\n====== 메인 메뉴 ====== \n";
			
			else /*if(mbr != null)*/ {
				String who =(mbr instanceof Jobseeker)?"구직자":"구인회사";
				title = "\n====== 메인 메뉴 ["+who+" "+mbr.getName()+" 로그인 중] ====== \n";

				
			}
			
			
			
			
			System.out.println(title
					+ "1.구직자 회원가입	 2.구인회사 회원가입"+"\n"
					+ "3.구직자 로그인	 4.구인회사 로그인"+"\n"
					+ "5.모든 구직자 출력	 6.모든 구인회사 출력"+"\n"
					+ "7.로그아웃 		 8.내정보 변경하기\n"
					+ "9.프로그램 종료\n");
			System.out.print("▷메뉴 번호 선택 => ");
			smenuNum = sc.nextLine();
			
			
			switch (smenuNum) {
				case "1":	//구직자 회원가입
					mbr = ctrl.register(1, sc, mbrArr);
										//	   ^ 구분자	구직자와 회사를 구분 하기 위해서..
					mbrArr[Jobseeker.count++] = mbr;
					System.out.println(">> 구직자 회원가입 성공! \n");

					break;
	
				case "2":	//구인회사 회원가입
					mbr = ctrl.register(2, sc, mbrArr);
					mbrArr[Company.count++] = mbr;
					System.out.println(">> 구인회사 회원가입 성공! \n");
					break;
					
				case "3":	//구직자 로그인
					if(mbr == null) 
						mbr = ctrl.login(3, sc,mbrArr);	//아이디와 패스워드가 잘못되면  null값을 리턴
					
					else if(/*mbr != null*/mbr instanceof Jobseeker)	//  쓸 필요가 없다 위의 if문에서 null이 아닌 경우에만 이 else if문으로 내려오기 떄문
						System.out.println(">> 이미 구직자로 로그인 중입니다.");
					
					else
						System.out.println(">> 이미 구인회사로 로그인 중입니다.");
					break;
					
				case "4":	//구인회사 로그인
					if(mbr == null) 
						mbr = ctrl.login(4, sc,mbrArr);
					
					else if(mbr instanceof Company)
						System.out.println(">> 이미 구인회사로 로그인 중입니다.");
					else	//null도 아니고 구직자로 로그인된 상태
						System.out.println(">> 이미 구직자로 로그인 중입니다.");
					break;
					
				case "5":	//모든 구직자 출력
					ctrl.showAll(mbrArr);
					break;
					
				case "6":	//구인회사 출력
					ctrl.showCompanyAll(mbrArr);
					break;
					
				case "7":	//로그아웃
					mbr = null;
					System.out.println(">> 로그아웃되었습니다.");
					break;
				
				case "8":	//내정보 변경하기
					/* 내가 짠 코드
					if(mbr != null && mbr instanceof Jobseeker)
						mbr = ctrl.updateMyInfo(5,sc,mbr);	//구직자로 로그인 되어진 상태
					
					else if(mbr instanceof Company) 
						mbr = ctrl.updateMyInfo(6,sc,mbr); //구인회사로 로그인 되어진 상태
					
					else
						System.out.println(">> 먼저 로그인 해주세요.");
					*/
					
					if(mbr != null)
						mbr = ctrl.updateMyInfo(sc, mbr);
					//구직자 또는 구인회사로 로그인 되어진 상태. mbr 자체가 이미 구분자
					
					else
						System.out.println(">> 먼저 로그인 해주세요.");
						
					break;
					
			}
		} while (!("9".equals(smenuNum)));
		
		sc.close();
		
		System.out.println("\n===== 프로그램 종료 =======");
		
	}//end of main----------------------------------------------

	
}
