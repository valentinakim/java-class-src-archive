package my.day12.b.inheritance;

import java.util.Scanner;


public class JobseekerCompanyMain {

	public static void main(String[] args) {

		Jobseeker[] jobskrArr = new Jobseeker[5];
		Company[] coArr = new Company[5];
		
		Jobseeker indv1 = new Jobseeker();
		indv1.setId("jjh0214");
		indv1.setPasswd("Qwer123!@#");
		indv1.setName("정재현");
		indv1.setresdntNum("9702141");
		Jobseeker.count++;
		
		jobskrArr[0] = indv1;
		
		Jobseeker indv2 = new Jobseeker();
		indv2.setId("leecl");
		indv2.setPasswd("Qwer456!@#");
		indv2.setName("이채린");
		indv2.setresdntNum("9102262");
		Jobseeker.count++;
		
		jobskrArr[1] = indv2;
		
		Company co1 = new Company();
		co1.setId("mycompany");
		co1.setPasswd("Qwer456!@#");
		co1.setName("SK");
		co1.setIndustryType("IT");
		co1.setSeedMoney(20000000);
		Company.count++;
		
		coArr[0] = co1;
		
		JobseekerCompanyCtrl ctrl = new JobseekerCompanyCtrl();
		
		Scanner sc = new Scanner(System.in);
		
		String smenuNum ="";
		
		
		Jobseeker indv = null;
		Company co = null;
		String title = "";
		
		do {

			if(indv == null && co == null)
				title = "\n====== 메인 메뉴 ====== \n";
			
			else if(co == null && indv != null)
				title = "\n====== 메인 메뉴 [구직자 "+indv.getName()+" 로그인 중] ====== \n";
			
			else 
				title = "\n====== 메인 메뉴 [구인회사 "+co.getName()+" 로그인 중] ====== \n";

				
			
			
			
			
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
						Jobseeker jobseeker = ctrl.register(sc, jobskrArr);
						jobskrArr[Jobseeker.count++] = jobseeker;
						System.out.println(">> 회원가입 성공! \n");

					break;
	
				case "2":	//구인회사 회원가입
					co = ctrl.register(sc, coArr);
					coArr[Company.count++] = co;
					System.out.println(">> 회원가입 성공! \n");
					break;
					
				case "3":	//구직자 로그인
					if(indv == null && co == null) 
						indv = ctrl.loginByJobseeker(sc,jobskrArr);	//아이디와 패스워드가 잘못되면  null값을 리턴
					else if(co == null && indv != null)
						System.out.println(">> 이미 구직자로 로그인 중입니다.");
					else
						System.out.println(">> 이미 구인회사로 로그인 중입니다.");
					break;
					
				case "4":	//구인회사 로그인
					if(co == null && indv == null) 
						co = ctrl.loginByCompany(sc,coArr);
					else if(indv == null && co !=null)
						System.out.println(">> 이미 구인회사로 로그인 중입니다.");
					else if(co == null && indv !=null)
						System.out.println(">> 이미 구직자로 로그인 중입니다.");
					break;
					
				case "5":	//모든 구직자 출력
					ctrl.showAll(jobskrArr);
					break;
					
				case "6":	//구인회사 출력
					ctrl.showCompanyAll(coArr);
					break;
					
				case "7":	//로그아웃
					indv = null;
					co = null;
					System.out.println(">> 로그아웃되었습니다.");
					break;
					
				case "8":	//내정보 변경하기
					if(indv != null && co == null)
						indv = ctrl.updateMyInfo(sc,indv);	//구직자로 로그인 되어진 상태
					
					else if(co != null && indv == null)
						co = ctrl.updateMyInfo(sc,co); //구인회사로 로그인 되어진 상태
					else
						System.out.println(">> 먼저 로그인 해주세요.");
					
					
					break;
					
				default:
					break;
			}
		} while (!("9".equals(smenuNum)));
		
		sc.close();
		
		System.out.println("\n===== 프로그램 종료 =======");
		
	}//end of main----------------------------------------------

	
}
