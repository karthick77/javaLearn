package basics;

import java.util.HashMap;
import java.util.Map;

public class RepeatCharacterInString {

	public static void repeatChar() {

		String str = "karthick boopathy";
		int count = 0;
		char ch;
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (hmap.containsKey(ch)) {
				count = hmap.get(ch);
				hmap.replace(ch, ++count);
			} else {
				hmap.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : hmap.entrySet()) {

			if (entry.getValue() >= 1) {
				System.out.println(entry.getKey()+" ---> "+entry.getValue());
			}
		}
	}

	public static void main(String[] args) {

		repeatChar();
	}
}
