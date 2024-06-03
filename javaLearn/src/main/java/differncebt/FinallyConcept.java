package differncebt;

public class FinallyConcept {

	public static void test() {

		try {
			System.out.println("inside try block");
			throw new RuntimeException("test");
		} catch (Exception e) {
			System.out.println("inside catch block");
		} finally {
			System.out.println("inside finally block");
		}
	}

	public static void division() {

		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero");
		} finally {
			System.out.println("inside finally block");
		}
	}

	public static void division2() {

		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (NullPointerException e) {
			System.out.println("inside catch block");
			System.out.println("divide by zero");
		} finally {
			System.out.println("inside finally block");
		}
	}

	public static void main(String[] args) {

		//test();
		//division();
		division2();
	}

}
