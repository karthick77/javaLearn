package basics;

import java.util.Arrays;

public class Anagram {
	
	public static boolean anagramCheck(String st1, String st2) {
		
		String dt1 = st1.replaceAll("\\s", "");
		String dt2 = st2.replaceAll("\\s", "");
		
		if(dt1.length() != dt2.length()) {
			return false;
		}
		
		char[] ch1 = dt1.toLowerCase().toCharArray();
		char[] ch2 = dt2.toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		Arrays.equals(ch1, ch2);
		
		return true;
	}

	public static void main(String[] args) {
		
		String s1 = "Listen";
		String s2 = "Silent";
		boolean result = anagramCheck(s1, s2);
		System.out.println("Result: "+result);

	}

}
