package my.day14.a.abstractClass;

public class Cat extends Animal{

	//Cat만 가지는 field를 정의(추상화)
	private String color;

	//Cat만 가지는 method 정의(추상화)
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		if(color != null && !color.trim().isEmpty())
		this.color = color;
	}

	//메소드 오버라이딩(메소드 재정의)
		@Override
		public void showInfo() {
			System.out.println("== 고양이 정보 == \n"
							+ "1. 이름 : "+getName()+"\n"
							+ "2. 생년 : "+getBirthYear()+"년 \n"
							+ "3. 피부색 : "+color+"\n");
		}
	
		@Override
		public void cry() {
			System.out.println("고양이는 '야옹야옹'하며 웁니다");
		}
		
		public void jump() {
			System.out.println(">> 고양이는 점프를 합니다.");
		}
		
		
		
		
}
