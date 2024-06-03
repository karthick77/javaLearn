package PrintPatterns;

public class star2 {
	
	public static void pattern3() {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		pattern3();

	}

}
