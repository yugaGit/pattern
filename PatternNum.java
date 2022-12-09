package loop.demo;

public class PatternNum {

	public static void main(String[] args) {
		
	
		// 1. increasing print program
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5  
		for (int row = 1; row <=5; row++) {
			for (int col = 1; col <=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		// 2. multi print program
//		1 2 3 4 5 
//		2 4 6 8 
//		3 6 9 
//		4 8 
//		5 
		for (int row = 1; row <=5; row++) {
			for (int col = 1; col <=6-row; col++) {
				System.out.print(col*row+" ");
			}
			System.out.println();
		}

		
		//printing 5 to 1
		//5 4 3 2 1 
//		  5 4 3 2 
//		  5 4 3 
//		  5 4 
//		  5
		for (int row = 1; row <=5; row++) {
			for (int col = 5; col >=row; col--) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	  
		
		
		
	}

}

