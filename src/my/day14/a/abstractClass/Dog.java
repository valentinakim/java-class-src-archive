package my.day14.a.abstractClass;

public class Dog extends Animal{

	//Dog만 가지는 field를 정의(추상화)
	private int weight;
	
	//Dog만 가지는 method 정의(추상화)

	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		
		if(weight >0)
			this.weight = weight;
		
	}
	
	//메소드 오버라이딩(메소드 재정의)
	@Override
	public void showInfo() {
		System.out.println("== 강아지 정보 == \n"
						+ "1. 이름 : "+getName()+"\n"
						+ "2. 생년 : "+getBirthYear()+"년 \n"
						+ "3. 몸무게 : "+weight+"kg\n");
	}
	
	
	@Override
	public void cry() {	// 부모 클래스의 접근 제한자와 같든지 또는 접근허용 범위가 더 큰 걸 써야한다
		System.out.println("강아지는 '멍멍'하며 짖습니다");
	}
	
	
	public void run() {
		System.out.println(">> 강아지가 빠르게 달립니다.");
	}
	
	
}
