package basics;

public class FirstLowerSecondUpper {
	
	public static void lowerUpper(String data) {
		
		String lower = "";
		String upper = "";
		int mid = (data.length())/2;
		System.out.println(data.length());
		
		for(int i=0; i<data.length(); i++) {
			if(i<mid) {
				lower = lower + Character.toLowerCase(data.charAt(i));
			}else {
				upper = upper + Character.toUpperCase(data.charAt(i));
			}
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(lower+upper);
	}

	public static void main(String[] args) {
		
		String str = "Java is great programming language Java is great programming language";
		
		lowerUpper(str);

	}

}
