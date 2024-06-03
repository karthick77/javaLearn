package company;

public class RotationOfString {

	public static boolean isRepeat(String str1, String str2) {

		return ((str1.length() == str2.length()) && ((str1 + str2).contains(str2)));
	}

	public static void main(String[] args) {

		String str1 = "ABCD";
		String str2 = "CDAB";

		if(isRepeat(str1, str2)) {
			System.out.println("Rotation of string is present");
		}else {
			System.out.println("Rotation of string is not present");
		}
	}

}
