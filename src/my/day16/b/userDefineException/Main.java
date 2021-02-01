package my.day16.b.userDefineException;

public class Main {

	public static void main(String[] args) {
		
		Product[] prodArr = new Product[3];
		
		
		prodArr[0] = new Product();
		prodArr[0].setProdName("새우깡");
		prodArr[0].setStock(100);
		
		prodArr[1] = new Product();
		prodArr[1].setProdName("감자깡");
		prodArr[1].setStock(50);
		
		prodArr[2] = new Product();
		prodArr[2].setProdName("양파링");
		prodArr[2].setStock(150);
		
		
	
		for(Product prod : prodArr) {
			try {
				prod.order(80);	//80개 주문
			} catch (StocklackException e) {
				//e.printStackTrace();
				System.out.println("오류 메세지 : "+e.getMessage()+"\n");
			}	finally {
				
				prod.info();
				
			}
		}	//end of for----------------------
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		prodArr[0].setStock(100);
		prodArr[1].setStock(50);
		prodArr[2].setStock(150);
		
		for(Product prod : prodArr) {
			try {
				prod.order2(80);	//80개 주문
			} catch (StocklackException e) {
				//e.printStackTrace();
				System.out.println("오류 메세지 : "+e.getMessage()+"\n");
			}	finally {
				prod.info();
			}
		}	//end of for
		
		
		
		
	}//end of main--------------------------------

	
}
