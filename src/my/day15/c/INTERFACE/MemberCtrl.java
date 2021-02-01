package my.day15.c.INTERFACE;

import java.util.Scanner;


public class MemberCtrl implements InterMemberCtrl{

	//구직자 중복아이디 검사
	@Override
	public boolean duplicateIdJobseeker(String id, Member[] mbrArr) {
		
		boolean bool = false;
		
		for(int i=0; i<Member.count; i++) {
			
			if(mbrArr[i] instanceof Jobseeker) {
			String storedId = mbrArr[i].getId();
			
			if (storedId.equals(id)) {
				bool = true;
				break;
			}
		  }
		}//end of for------------------------
		
		
		return bool;
	}
	//구인회사 중복아이디 검사
	@Override
	public boolean duplicateIdCompany(String id, Member[] mbrArr) {
		
		boolean bool = false;
		
		for(int i=0; i<Member.count; i++) {
			
			if(mbrArr[i] instanceof Company) {
			String storedId = mbrArr[i].getId();
			
			if (storedId.equals(id)) {
				bool = true;
				break;
			}
		  }
		}//end of for------------------------
		
		return bool;
	}
	
	//회원가입(구직자, 구인회사)
	@Override
	 public boolean register(Scanner sc, Member[] mbrArr, int n) {
		   // int n 은 n값이 1이면 구직자로 회원가입, n값이 2이면 구인회사로 회원가입.   
		      
		      boolean result = false;
		      
		      Member mbr = null;
		      
		      if(n==1) {
		       // 구직자로 회원가입
		         mbr = new Jobseeker();
		         
		         do {
		            System.out.print("1. 구직자 아이디 : ");
		            String id = sc.nextLine();
		            
		            mbr.setId(id);
		            id = mbr.getId();
		            
		            if(id != null) {	//setId()에서 아이디가 null인지 먼저 확인한 후 null이 아니라면 중복검사로 넘어간다
		               boolean bool = duplicateIdJobseeker(id, mbrArr);	//아이디가 중복인지 검사 
		               
		               if(bool)
		                  System.out.println(">> 이미 사용중인 아이디 입니다. << \n"); 
		               else
		                  break;
		            }
		            
		         } while(true);
		         
		         ////////////////////////////////////////////
		                  
		         do {
		            System.out.print("2. 암호 : ");
		            String passwd = sc.nextLine();
		            
		            mbr.setPasswd(passwd);
		            passwd = mbr.getPasswd();
		            
		            if(passwd != null) 
		               break;
		         
		         } while(true);
		         
		         ////////////////////////////////////////////
		                  
		         do {
		            System.out.print("3. 성명 : ");
		            String name = sc.nextLine();
		            
		            mbr.setName(name);
		            name = mbr.getName();
		            
		            if(name != null)
		               break;
		         
		         } while(true);
		         
		         ////////////////////////////////////////////
		         do {
		            System.out.print("4. 주민번호 앞의 7자리만 : ");
		            String resdntNum = sc.nextLine();
		            
		            ((Jobseeker) mbr).setresdntNum(resdntNum); 
		            resdntNum = ((Jobseeker) mbr).getResdntNum();
		            
		            if(resdntNum != null) 
		               break;
		            
		         } while(true);
		         ////////////////////////////////////////////
		         
		      }// end of if(n==1)-----------------------------
		      
		      else if(n==2) {
		       // 구인회사로 회원가입   
		         mbr = new Company();
		         
		         do {
		            System.out.print("1. 구인회사 아이디 : ");
		            String id = sc.nextLine();
		            
		            mbr.setId(id);
		            id = mbr.getId();
		            
		            if(id != null) {
		               boolean bool = duplicateIdCompany(id, mbrArr);
		               
		               if(bool)
		                  System.out.println(">> 이미 사용중인 아이디 입니다. << \n"); 
		               else
		                  break;
		            }
		            
		         } while(true);
		         
		         ////////////////////////////////////////////
		                  
		         do {
		            System.out.print("2. 암호 : ");
		            String passwd = sc.nextLine();
		            
		            mbr.setPasswd(passwd);
		            passwd = mbr.getPasswd();
		            
		            if(passwd != null) 
		            break;
		         
		         } while(true);
		         
		         ////////////////////////////////////////////
		         
		         do {
		            System.out.print("3. 회사명 : ");
		            String name = sc.nextLine();
		            
		            mbr.setName(name);
		            name = mbr.getName();
		            
		            if(name != null)
		            break;
		         
		         } while(true);
		         
		         ////////////////////////////////////////////
		         
		         do {
		            System.out.print("4. 회사직종타입 : ");
		            String industryType = sc.nextLine();
		            
		            ((Company) mbr).setIndustryType(industryType);
		            industryType = ((Company) mbr).getIndustryType(); 
		            
		            if(industryType != null) 
		               break;
		            
		         } while(true);
		         
		         /////////////////////////////////////////////
		         
		         do {
		            System.out.print("5. 자본금 : ");
		            String sseedMoneny = sc.nextLine();
		            
		            ((Company) mbr).setSeedMoney(Long.parseLong(sseedMoneny));
		            long seedMoneny = ((Company) mbr).getSeedMoney();
		            
		            if(seedMoneny > 0) 
		               break;
		            
		         } while(true);
		         /////////////////////////////////////////////
		         
		      } // end of else if(n==2)-------------------------
		      
		      //배열크기보다 배열의 인덱스가 작아야한다. Member 배열 객체 수가 [10]인데 이것보다 더 많이 가입할 수 없음.
		      if(Member.count < mbrArr.length) {
		         mbrArr[Member.count++] = mbr;	//mbr를 배열에 넣어준 후 count 1 증가
		         result = true;
		      }
		      else {
		         System.out.println(">> 정원초과로 가입이 불가합니다.!! <<");
		      }
		      
		      return result;
		   }

	//로그인(구직자,구인회사)
	//int n의 n 값이 1이면 구직자, 2이면 구인회사로 로그인
	@Override
	public Member login(Scanner sc, Member[] mbrArr, int n) {
		
		Member mbr = null;	//리턴 값 넣어주기위한 변수 초기화
		
		String str = (n==1)?"구직자":"구인회사";
		
		System.out.print("▷ "+str+" 아이디 : ");
		String id = sc.nextLine();

		System.out.print("▷ 암 호 : ");
		String passwd = sc.nextLine();

		if(n==1) {
			//구직자로 로그인
		
			for(int i=0; i<Member.count; i++) {
				
				if(mbrArr[i] instanceof Jobseeker) {
					if(id.equals(mbrArr[i].getId()) && 
						passwd.equals(mbrArr[i].getPasswd())) {
						
						mbr = mbrArr[i];
						break;
					}
				}
				
			}//end of for-------------------------
			
		}
		else if(n==2) {
			//구인회사로 로그인
			
			for(int i=0; i<Member.count; i++) {
				
				if(mbrArr[i] instanceof Company) {
					if(id.equals(mbrArr[i].getId()) && 
						passwd.equals(mbrArr[i].getPasswd())) {
						
						mbr = mbrArr[i];
						break;
					}
				}
				
			}//end of for-------------------------
			
		}
		
		return mbr;
		
		
	}//end of login ---------------------------------------------
	

	//모든 회원정보 출력(구직자, 구인회사)
	@Override
	public void viewInfo(Member[] mbrArr, int n) {
	//int n의 n 값이 1이면 구직자, 2이면 구인회사로 로그인

		if(n==1) {
		System.out.println("----------------------------------------------------");
		System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
		System.out.println("----------------------------------------------------");
		
			for(int i=0; i<mbrArr.length; i++) {
				
			    System.out.printf("%-10s\t%-15s\t%-15s%-8s\t%-10d\n",((Jobseeker)mbrArr[i]).getId(),((Jobseeker)mbrArr[i]).getPasswd(),
			    		((Jobseeker)mbrArr[i]).getName(),((Jobseeker)mbrArr[i]).getAge(),((Jobseeker)mbrArr[i]).getGender());

			}
		
		
		
		}
		else {
			
		System.out.println("--------------------------------------------------------------------------");
		System.out.printf("%-15s\t%-12s\t\t%-5s\t\t%-5s\t\t%-2s\n","아이디","암호","회사명","업종","자본금");
		System.out.println("--------------------------------------------------------------------------");	
			
		for(int i=0; i<mbrArr.length; i++) {
			
	    System.out.printf("%-10s\t%-15s\t%-15s%-8s\t%-10d\n",((Company)mbrArr[i]).getId(),((Company)mbrArr[i]).getPasswd(),
	    		((Company)mbrArr[i]).getName(),((Company)mbrArr[i]).getIndustryType(),((Company)mbrArr[i]).getSeedMoney());

		}
		
		}
	}
	//회원정보 변경(구직자, 구인회사)
	@Override
	public Member updateMemberInfo(Scanner sc, Member mbr) {
		return null;
	}
	
	//특정 회원정보 한명 출력(구직자, 구인회사)
	@Override
	public String showInfo(Member[] mbrArr) {

			
			System.out.println("----------------------------------------------------");
			System.out.printf("%-15s\t%-15s\t%-8s\t%-4s\t%-2s\n","아이디","암호","성명","현재나이","성별");
			System.out.println("----------------------------------------------------");
			
				
				for(int i=0; i<Member.count; i++) {
					if(mbrArr instanceof Jobseeker)
						//mbr.viewInfo();
				}
			
		}
		return null;
	}
	
	//회원(구직자, 구인회사)으로 사용가능한지 알아보는 메소드(null값이 있는지 없는지 알아보기)
	
	@Override
	public boolean isRegistered(Member[] mbrArr) {
		
		String id = mbr.getId();
		String passwd = mbr.getPasswd();
		String name = mbr.getName();
		
		if( mbr instanceof Jobseeker ) {
			String ResdntNum = ((Jobseeker)mbr).getResdntNum();
			
			if(id != null && passwd != null && name != null && ResdntNum != null)
				return true;
			
		}
		else if(mbr instanceof Company) {
			String industryType = ((Company)mbr).getIndustryType();
			long seedMoney = ((Company)mbr).getSeedMoney();
			
			if(id != null && passwd != null && name != null && industryType != null && seedMoney > 0)
				return true;
			
		}
		
		return false;
		
	}
	
	}//end of public boolean isRegistered(Member mbr)---------------------------------------------------

	
	
		
	
