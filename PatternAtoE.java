package loop.demo;

public class PatternAtoE {

	public static void main(String[] args) {
		ab();
		
	}
	char a='A';
	static void ab() {
		for (char r = 'A'; r <= 'E'; r++) {
			for (char c = r; c <='E' ; c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}
//A B C D E 
//B C D E 
//C D E 
//D E 
//E 

