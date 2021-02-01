package my.day16.b.userDefineException;

public class Product {

	//field
	private String prodName; //제품명("새우깡", "감자깡", "양파링")
	private int stock;		//잔고     (100,		50	  , 150)
	
	
	
	
	
	//method
	
	//제품의 정보를 보여주는 메소드 생성
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void info() {
		String info = "1.제품명 : "+ prodName + "\n"
					+ "2.잔고량 : "+stock+"개\n";
	
		System.out.println(info);
		
	}
	
	//주문을 받는 메소드  생성1
	void order(int orderqty) throws StocklackException{
		//메소드 order는 파라미터 orderqty 값에 따라서 사용자(개발자)가 만든 StocklackException 을 유발할 수있다는 뜻
		
		if(stock < orderqty) {
			//잔고량이 주문량보다 부족할 시 Exception 유발시키기
			throw new StocklackException();
		}
		else {
			stock -= orderqty;
			System.out.println(prodName+" 제품을 "+orderqty+"개를 주문하셨습니다.");
		}
		
		
	}
	
	//주문을 받는 메소드  생성1
	void order2(int orderqty) throws StocklackException{
		
		if(stock < orderqty) {
			//잔고량이 주문량보다 부족할 시 Exception 유발시키기
			throw new StocklackException(">> "+prodName+" 은 잔고가 "+stock +"개 인데 주문량이 "+orderqty +"라서 잔고 부족으로 주문이 불가합니다.");
		}
		else {
			stock -= orderqty;
			System.out.println(prodName+" 제품을 "+orderqty+"개를 주문하셨습니다.");
		}
		
		
	}

	
	
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getStock() {
		return stock;
	}
	
	
	
	
	
}
