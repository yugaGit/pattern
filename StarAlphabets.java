package loop.demo;

public class StarAlphabets {

	public static void main(String[] args) {
		y();
		U();
		G();
		A();
		R();
		A();
		J();
	}
	public static void R() {
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++) {
				if(j==0||j==4||i==2||i==0) {
					if(i==0&&j==4 || i==2&&j==4) {
						System.out.print("  ");
					}else
					{
						System.out.print("r ");
					}
				
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("_______________");
		
	}
	
	public static void U() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(j==0 || j==4 || i==4) {
					if(i==4 && j==0 || i==4 && j==4) {
					System.out.print("  ");
				}else {
					System.out.print("U ");
				}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("_______________");
	}
	
	public static void G() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				if(j==0 || j==4 || i==0 || i==4 || i==2) {
					if(i==0 && j==0 ||i==0 && j==4 || i==4 && j==0 || i==2 && j==1 || i==1 && j==4 || i==4 && j==4) {
						System.out.print("  ");
					}
					else {
					System.out.print("g ");
					}
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println("________________");
	}
	
	public static void y() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i==0 && j==0 ||i==0 && j==4 ||i==1 && j==1 || i==1 && j==3 || i==2 && j==2 || i==3 && j==2 ||
						i==4 && j==2) {
					System.out.print("Y ");
				}else {
					System.out.print("  ");
				}
		}
			System.out.println();
		}
		System.out.println("_______________");
	}
	public static void A() {
		for (int i = 0; i < 5; i++) {
			
			for (int j = 0; j < 5; j++) {
				if(j==0 || j==4 || i==0 || i==2) {
					if(i==0 && j==0 || j==4 && i==0) {
						System.out.print("  ");
					}
					else {
					System.out.print("a ");
					}
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println("_______________");
	}
	public static void J() {
		for(int i=0;i<5;i++) {
			for (int j = 0; j < 5; j++) {
				if(i==0||i==3&&j==0||j==2 ||i==4&&j==0||i==4&&j==1) {
					System.out.print("j ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("_______________");
	}
}
	
