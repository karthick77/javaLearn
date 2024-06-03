package basics2;

public class Factorial2 {

	public static int isFactorial(int num) {

		int fact = 1;
		if (num == 0) {
			return 1;
		}
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static int fact(int num) {

		if (num == 0) {
			return 1;
		}
		return (num * fact(num - 1));
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println(isFactorial(num));
		System.out.println(fact(num));
	}

}
