package basics2;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;

	}
	
	public static void rangeOfPrimeNumber(int num) {
		
		for(int i=0; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		System.out.println(isPrimeNumber(17));
		rangeOfPrimeNumber(20);

	}

}
