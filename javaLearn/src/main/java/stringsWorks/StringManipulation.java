package stringsWorks;

public class StringManipulation {

	public static void manipulation() {
		
		String str = "The rains have started here in selenium";
		String str1 = "The rains Have started here in selenium";
		String str2 = "  Hello World  ";
		String date = "01/11/2024";
		String test = "Hello_World_Test_Selenium";
		String str4 = "Programming";
		
		System.out.println("Length of given string: "+str.length());
		System.out.println("Specific charater at given position: "+str.charAt(10));//starts from 0
		System.out.println("Position of given character:"+str.indexOf('z'));
		System.out.println(str4.indexOf("r",3));                                                                                                                                                                                                  
		System.out.println("Position of given character:"+str.indexOf('s',9));
		System.out.println("Second position of given character:"+str.indexOf('s', str.indexOf('s')+1));
		System.out.println("Third position of given character:"+str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));
		System.out.println("Index of given string:"+str.indexOf("have"));
		System.out.println("Index of given string:"+str.indexOf("hello"));// -1 if found he string
		System.out.println("Comparing given string: "+str.equals(str1));
		System.out.println("Comparing given string: "+str.equalsIgnoreCase(str1));
		System.out.println("Get specific string: "+str.substring(0, 9));
		System.out.println("Get string from specific index: "+str.substring(11));
		System.out.println("After trim: "+str2.trim());
		System.out.println("After replace: "+str2.replace(" ", ""));
		System.out.println("After replace '/ to -' "+date.replace('/', '-'));
		
		String[] split = test.split("_");
		System.out.println("***************************");
		for (String val : split) {
			System.out.println(val);
		}
		System.out.println("***************************");
		for(int i=0; i<split.length; i++) {
			System.out.println(split[i]);
		}
		String con = "Care";
		System.out.println("***************************");
		System.out.println(con.concat("s"));
		
		System.out.println("***************************");
		String x = "Hello";
		String y = "world";
		int a = 100;
		int b = 200;
		
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println((a+b)+x+y);
		
		 // Initializing String
        String Str22 = new String("Welcometogeeksforgeeks");
 
        // using substring() to extract substring
        // returns geeks
        System.out.print("The extracted substring  is:");
        System.out.println(Str22.substring(10, 16));
	}
	
	public static void main(String[] args) {
		
		manipulation();
	}

}
