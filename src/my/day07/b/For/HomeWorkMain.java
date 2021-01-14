package my.day07.b.For;

public class HomeWorkMain {

	/*
	 == 숙제 1 == 
	*
	**
	***
	****
	*****
	          		          
	== 숙제 2 == 
	       *
	      **
	     ***
	    ****
	   ***** 
	
	== 숙제 3 == 
	*****   
	****    
	***    
	**     
	*   
	          
	== 숙제 3 ==
	 
      *
     ***
    ***** 
	          
	== 숙제 4 ==
	          
     *****
      ***
       *
	              
	== 숙제 5 ==
	       
       *
      ***
     *****
      ***   
       * 
	 
	 == 입사문제 == 
        
	   *********1
	   ********2
	   *******3
	   ******4
	   *****5
	   ****6
	   ***7
	   **8
	   *9
	 
	 
	 */
	
	
	public static void main(String[] args) {
		
		//숙제 1
		System.out.println("숙제 1");
		String star = "*";
		
		for(int i=0; i<5; i++) {
			
			System.out.println(star);
			star+="*";
			
		}
				
		//숙제2
		System.out.println("숙제2");
		
		star = "*";
		for(int i=0; i<5; i++) {
			
			System.out.printf("%10s",star);
			System.out.print("\n");
			star+="*";
			
		}
		
		//숙제3
		System.out.println("숙제3");
		
		star = "*";
		
		
		

	}

}
