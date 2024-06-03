package basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindDuplicateElementInArray {

	public static void compareEach() {

		String names[] = { "Java", "C", "Ruby", "Python", "C#", "Java", "C" };
		System.out.println(names.length);
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate value is: " + names[i]);
				}
			}
		}
	}

	public static void usingHashSet() {

		String names[] = { "Java", "C", "Ruby", "Python", "C#", "Java", "C" };
		HashSet<String> store = new HashSet<String>();
		for (String name : names) {

			if (store.add(name) == false) {
				System.out.println("Duplicate element is: " + name);
			}
		}
	}

	public static void usingHashMap() {

		String names[] = { "Java", "C", "Ruby", "Python", "C#", "Java", "C" };
		HashMap<String, Integer> storeMap = new HashMap<String, Integer>();

		for (String name : names) {

			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}

		}

		for (Map.Entry<String, Integer> entry : storeMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate Element: " + entry.getKey());
			}
		}
	}

	public static void main(String[] args) {

		compareEach();
		System.out.println("**************************");
		usingHashSet();
		System.out.println("***************************");
		usingHashMap();
	}

}
