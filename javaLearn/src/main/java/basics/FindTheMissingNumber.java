package basics;

public class FindTheMissingNumber {

	public static void findTheMissingNumber() {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int j = 1; j <= 10; j++) {
			sum1 = sum1 + j;
		}
		System.out.println(sum1);

		System.out.println("Missing Number: " + (sum1 - sum));
	}

	public static void findTheMissingNumber2() {

		int num[] = { 1, 2, 3, 4, 5, 6, 7, 8,9 ,11};

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}

		System.out.println(num.length);
		int total = (num[num.length - 1] * (num[num.length - 1] + 1)) / 2;

		System.out.println("Missing Number: " + (total - sum));
	}

	public static void main(String[] args) {

		// findTheMissingNumber();
		findTheMissingNumber2();
	}

}
