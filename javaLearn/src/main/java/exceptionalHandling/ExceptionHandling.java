package exceptionalHandling;

public class ExceptionHandling {

	//throw - keyword is used to throw exception explicitly
	static void check(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age less than expected");
		}
	}

	public static void main(String[] args) {

		try {
			check(17);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of code!");
	}

}
