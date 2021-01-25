package my.day12.a.encapsulation;

public class JobseekerMain {

	public static void main(String[] args) {

		Jobseeker[] jobskrArr = new Jobseeker[5];
		
		Jobseeker indv1 = new Jobseeker();
		// indv1.userid = "jjh0214";	//userid 필드는 private 이라서 다른 클래스에서 사용 할 수가 없다
		
		// indv1.setUserid("sdlfkjasldfjasdjfosdf");	//setUserid 메소드를 public으로 열어놨기 떄문에 이를 이용해서 userid 매개값을 넘겨주기.. 
		// >>> 아이디는 5글자 이상 10글자 이하여야 합니다.
		
		indv1.setUserid("jjh0214");
		indv1.setPasswd("Qwer123!@#");
		indv1.setName("정재현");
		indv1.setresdntNum("9702141");
		
		
		if(indv1.isRegistered())
			jobskrArr[0] = indv1;
		
		Jobseeker indv2 = new Jobseeker();
		indv2.setUserid("leecl");
		indv2.setPasswd("Qwer456!@#");
		indv2.setName("이채린");
		indv2.setresdntNum("9102262");
		
		if(indv2.isRegistered())
			jobskrArr[1] = indv2;

		for(int i=0; i<jobskrArr.length; i++) {
			if(jobskrArr[i] != null)
			System.out.println(jobskrArr[i].getUserid());
		}
		
		
		
	}//end of main----------------------------------------------

}
