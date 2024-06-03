package basics;

public class RemoveJunk {

	public static void removeJunkApproach1() {

		String s = "!@# Java Selenium $%^&*()";
		s = s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s.trim());
	}

	public static void removeJunkApproach2() {

		String s = " Java Selenium ";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
	}

	public static void main(String[] args) {

		removeJunkApproach1();
		removeJunkApproach2();
	}

}
