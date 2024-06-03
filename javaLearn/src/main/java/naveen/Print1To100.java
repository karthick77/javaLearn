package naveen;

public class Print1To100 {

	public static void approach1() {
		
		int one = 'A'/'A';
		String len = "..........";
		for(int i=one; i<=(len.length()*len.length()); i++) {
			System.out.println(i);
		}
	}
	
	public static void approach2() {
		
		for(int i=('a'/'a'); i<='d'; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {

		//approach1();
		approach2();
	}

}
