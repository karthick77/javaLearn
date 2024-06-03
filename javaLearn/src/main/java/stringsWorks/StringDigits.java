package stringsWorks;

public class StringDigits {
	
	public static boolean isEmptyValue(CharSequence cs) {
		
		return cs == null || cs.length() == 0;
		
	}
	
	public static boolean isNumericValue(CharSequence cs) {
		
		if(isEmptyValue(cs)) {
			return false;
		}
		int len = cs.length();
		for(int i=0; i<len; i++) {
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isNumericValue(null));
		System.out.println(isNumericValue(""));
		System.out.println(isNumericValue(" "));
		System.out.println(isNumericValue("123"));
		System.out.println(isNumericValue("75756"));
		System.out.println(isNumericValue("1A"));

	}

}
