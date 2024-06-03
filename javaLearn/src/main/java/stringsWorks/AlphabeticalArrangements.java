package stringsWorks;

import java.util.Arrays;

public class AlphabeticalArrangements {
	
	public static void approach2(String str) {
		
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
	}

	public static void approach1(String str) {
		char[] charArray = str.toCharArray();
		char temp;
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(charArray[i]>charArray[j]) {
					temp  = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}
		System.out.println(new String(charArray));
	}
	
	public static void main(String[] args) {

		String str = "rockking";
		approach1(str);
		approach2(str);
		
	}

}
