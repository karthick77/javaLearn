package basics;

public class Swap2Strings {

	public static void swap2Strings() {
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("Before Swap: "+a+" , "+b);
		
		a = a+b;
		b = a.substring(0, (a.length()-b.length()));
		a = a.substring(b.length());
		
		System.out.println("After Swap: "+a+" , "+b);
	}
	
	public static void main(String[] args) {
		
		swap2Strings();

	}

}
