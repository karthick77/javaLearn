package basics2;

public class Fibonacci {

	public static void fibona(int num) {

		int firstTerm = 0;
		int secondTerm = 1;

		System.out.print(firstTerm +", "+secondTerm);
		for (int i = 0; i <= num; i++) {

			
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			System.out.print(", "+nextTerm);
		}
	}

	public static void main(String[] args) {

		fibona(5);

	}

}
