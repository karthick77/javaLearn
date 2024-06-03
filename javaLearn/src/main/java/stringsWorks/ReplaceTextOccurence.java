package stringsWorks;

public class ReplaceTextOccurence {
	
	public static void approach1(String str, Character occ) {
		
		if(str.indexOf(occ)==-1) {
			System.out.println("Given Charater not available");
			System.exit(0);
		}
		
		char[] charArray = str.toCharArray();
		int count = 1;
		for(int i=0; i<charArray.length; i++) {
			
			if(charArray[i] == occ) {
				charArray[i] = String.valueOf(count).charAt(0);
				count++;
			}
		}
		System.out.println(new String(charArray));
	}
	
	public static void approach2(String str, Character occ) {
		
		if(str.indexOf(occ)==-1) {
			System.out.println("Given Charater not available");
			System.exit(0);
		}
		int count = 1;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==occ) {
				str = str.replaceFirst(String.valueOf(str.charAt(i)), String.valueOf(count++));
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		String str = "opentext";
		char occurence = 'e';
		approach1(str, occurence);
		//approach2(str, occurence);

	}

}
