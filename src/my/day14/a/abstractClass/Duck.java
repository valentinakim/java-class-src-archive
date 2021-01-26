package my.day14.a.abstractClass;

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
	
	@Override
	public void cry() {
		System.out.println("오리는는 '꽥꽥'하며 소리를 냅니다");
	}
	
	public void swim() {
		System.out.println(">> 오리는 물가에서 헤엄을 칩니다.");
	}
	
}
