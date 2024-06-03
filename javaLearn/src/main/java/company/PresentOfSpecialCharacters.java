package company;

public class PresentOfSpecialCharacters {
	
	public static void isSpecialCharPresent(String data) {
		
		int count = 0;
		String specialCharacterRemoved = "";
		
		for(int i=0; i<data.length(); i++) {
			if(!Character.isDigit(data.charAt(i)) && !Character.isLetter(data.charAt(i)) && !Character.isWhitespace(data.charAt(i))) {
				count++;
			}else {
				specialCharacterRemoved = specialCharacterRemoved + data.charAt(i);
			}
		}
		
		if(count == 0) {
			System.out.println("No special character");
		}else {
			System.out.println("Total special character: "+count);
			System.out.println("Non special characters: "+specialCharacterRemoved);
		}
	}

	public static void main(String[] args) {
		
		String str = "!@#23456&*(abc* ";
		
		isSpecialCharPresent(str);
	}

}
