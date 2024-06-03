package basics;

public class ReverseAString {

	public static void reverseAStringApp1() {

		String data = "selenium";
		String rev = "";
		int len = data.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + data.charAt(i);
		}
		System.out.println("Before Reverse a String: " + data);
		System.out.println("After Reverse a String: " + rev);

	}

	public static void reverseAStringApp2() {

		String data = "selenium";
		StringBuffer buffer = new StringBuffer(data);
		System.out.println("Before Reverse a String: " + data);
		System.out.println("After Reverse a String: "+buffer.reverse());

	}

	public static void main(String[] args) {

		reverseAStringApp1();
		reverseAStringApp2();

	}

}
