package my.day13.c.polymorphism;

public class Duck extends Animal{

	//Duck만 가지는 field를 정의(추상화)
	private int price;

	//Duck만 가지는 method 정의(추상화)
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		if(price > 0)
		this.price = price;
	}
	
	/*
	//메소드 오버라이딩(메소드 재정의)
		@Override
		public void showInfo() {
			System.out.println("== 오리 정보 == \n"
							+ "1. 이름 : "+getName()+"\n"
							+ "2. 생년 : "+getBirthYear()+"년 \n");
		}
	*/
}
