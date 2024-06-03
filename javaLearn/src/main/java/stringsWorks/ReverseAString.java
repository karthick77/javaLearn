package stringsWorks;

public class ReverseAString {

	public static void byToCharArray(String str) {
		
		char[] charArray = str.toCharArray();
		System.out.println(charArray.length); //length will be natural number starts with zero
		for(int i=charArray.length-1; i>=0; i--) {
			char c = charArray[i];
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static void byStringCharAt(String str) {
		
		System.out.println(str.length());
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
//			char charAt = str.charAt(i);
//			System.out.print(charAt);
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
	}
	
	public static void byBuffer(String str) {
		
		StringBuffer buffer = new StringBuffer(str);//thread safe
		System.out.println("Buffer: "+buffer.reverse());
		
	}
	
	public static void byBuilder(String str) {
		StringBuilder builder = new StringBuilder(str);//non thread safe
		System.out.println("Builder: "+builder.reverse());
		System.out.println();
	}
	
	public static void main(String[] args) {

		String str="hello";
		//byToCharArray(str);
		byStringCharAt(str);
		//byBuffer(str);
		//byBuilder(str);
	}

}
