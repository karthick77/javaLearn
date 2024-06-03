package stringsWorks;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacter {
	
	public static void approach1(String str) {
		
		HashMap<Character, Integer> data = new HashMap<>();
		int count=0;
		for(int i=0; i<str.length(); i++) {
			if(data.containsKey(str.charAt(i))) {
			    count = data.get(str.charAt(i));
				data.replace(str.charAt(i), ++count);
			}else {
				data.put(str.charAt(i), 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : data.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}

	public static void main(String[] args) {
		
		String str = "Hello";
		approach1(str);

	}

}
