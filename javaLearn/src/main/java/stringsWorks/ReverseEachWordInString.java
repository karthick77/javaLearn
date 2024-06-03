package stringsWorks;

public class ReverseEachWordInString {

	public static void approach1(String str) {

		String rev = "";
		
		String[] splitData = str.split(" ");
		
		for (String data : splitData) {
			String reversedWord = "";
			for(int i=data.length()-1; i>=0; i--) {
				reversedWord = reversedWord+data.charAt(i);
			}
			rev = rev+reversedWord+" ";
		}
		
		System.out.println(rev);
		
	}

	public static void main(String[] args) {

		String str = "Java Code";
		approach1(str);

	}

}
