package loop.demo;

public class Pattern {

	public static void main(String[] args) {
	int count=0;
		for(int i=1;i<=5;i=i+1) {
			
			for(int j=i;j<=5;j=j+1) {
				
				System.out.print("*");
				count++;
			}
			
			System.out.println();
		}
		
System.out.println(count);
	}

}
