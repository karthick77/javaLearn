package basics2;

public class PallindromeWord {

	public static void isPallindrome(String data) {

		String temp = data;
		String rev = "";
		for(int i=data.length()-1; i>=0; i--) {
			rev = rev + data.charAt(i);
		}
		
		if(temp.equals(rev)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Palliindrome");
		}
	}

	public static void main(String[] args) {

		String val = "malayalam";
		isPallindrome(val);

	}

}
