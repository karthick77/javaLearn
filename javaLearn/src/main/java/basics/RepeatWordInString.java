package basics;

import java.util.HashMap;
import java.util.Map;

public class RepeatWordInString {

	public static void repeatStr() {

		String str = "Java is a great programming language Java great language Java great Java";
		int count = 0;
		String str1="";
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		String[] value = str.split(" ");
		for (int i = 0; i < value.length; i++) {
			str1 = value[i];
			if(hmap.containsKey(str1)) {
				 count = hmap.get(str1);
				 hmap.replace(str1, ++count);
			}else {
				hmap.put(str1, 1);
			}
		}
		
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(entry.getKey()+" ---> "+entry.getValue());
		}

	}

	public static void main(String[] args) {

		repeatStr();
	}
}
