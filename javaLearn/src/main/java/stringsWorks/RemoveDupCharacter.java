package stringsWorks;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupCharacter {

	public static void approach1(String str) {
	
		// StringBuffer buffer = new StringBuffer();
		String after = "";

		for (int i = 0; i < str.length(); i++) {
			char val = str.charAt(i);
			int idx = str.indexOf(val, i + 1);
			if (idx == -1) {
				after = after + val;
			}
		}

		System.out.println(after);
	}
	
	public static void approach2(String str) {
		
		char[] charArray = str.toCharArray();
		String after = "";
		for(int i=0; i<charArray.length; i++) {
			boolean repeat = false;
			for(int j=i+1; j<charArray.length; j++) {
				
				if(charArray[i] == charArray[j]) {
					repeat=true;
					break;
				}
			}
			
			if(!repeat) {
				after = after+charArray[i];
			}
		}
		System.out.println(after);
	}
	
	public static void approach3(String str) {
		
		String after="";
		Set<Character> data = new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			data.add(str.charAt(i));
		}
		
		for (Character chr : data) {
			after = after+chr;
		}
		
		System.out.println(after);
	}

	public static void main(String[] args) {
		String str = "rockkingrockkingkin";
		approach1(str);
		approach2(str);
		approach3(str);
	}

}
