package PrintPatterns;

public class star3 {

	public static void pattern1() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2() {
		for (int i = 1; i <= 5; i++) {
			
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		pattern1();
		pattern2();
	}

}
