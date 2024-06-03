package stringsWorks;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstring {
	static int count=0;
	public static void approach1(String str) {
		String longestSubString = null;
		int longestSubStringLength = 0;
		char[] charArray = str.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println("i: "+i);
			if (!map.containsKey(charArray[i])) {
				map.put(charArray[i], i);
				//count++;
				System.out.println("Map:"+map);

			} else {
				i = map.get(charArray[i]);
				map.clear();
				System.out.println("Cleared Map:"+map);
				//count++;
			}
			
			if (map.size() > longestSubStringLength) {
				System.out.println("Len:"+longestSubStringLength+" mlen:"+map.size());
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
				//count++;
			}
		}
		System.out.println(map.size());
		System.out.println(longestSubString);
		System.out.println(count);

	}

	public static void main(String[] args) {

		String str = "bacabcdbacdebacabcd";
		approach1(str);

	}

}
