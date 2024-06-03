package stringsWorks;

public class FirstOccurenceOfNonRepeatedString {

	public static void approach1(String str) {
		
		for(int i=0; i<str.length(); i++) {
			boolean unique = true;
			for(int j=0; j<str.length(); j++) {
				
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique = false;
					break;
				}
			}
			
			
			if(unique) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "AABCDSJBECF";
		approach1(str);

	}

}
