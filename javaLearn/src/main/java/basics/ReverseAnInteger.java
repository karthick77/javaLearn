package basics;

public class ReverseAnInteger {

	//Approach-1
	public static void reverseAnInteger() {
		
		int num = 12345;
		int rev = 0;
		
		while(num !=0) {
			
			rev = rev*10 + num%10;
			num=num/10;
		}
		
		System.out.println(rev);
	}
	
	//Approach-2
	public static void reverseAnIntegerInbuilt() {
		
		long num = 1234567;
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
	
	//Approach-3
		public static void reverseAnStringInbuilt() {
			
			String data = "data";
			System.out.println(new StringBuffer(String.valueOf(data)).reverse());
		}
	
	public static void main(String[] args) {
		
		reverseAnInteger();
        reverseAnIntegerInbuilt();
        reverseAnStringInbuilt();
	}

}
