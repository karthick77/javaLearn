package basics;

public class Swap2Numbers {

	public static void swap2NumberWith3rdVariable() {
		
		int x = 5;
		int y = 10;
		int t;
		
		System.out.println("Before Swap: x: "+x+" y: "+y);
		
		t=x;
		x=y;
		y=t;
		
		System.out.println("After Swap: x: "+x+" y: "+y);
		
	}
	
	public static void swap2NumberWithout3rdVariable() {
		
		int x = 5;
		int y = 10;
		
		System.out.println("Before Swap: x: "+x+" y: "+y);
		
		x = x*y;
		y = x/y;
		x = x/y;
		
		System.out.println("Afetr Swap: x: "+x+" y: "+y);
		
	}
	
	public static void swapUsingXOR() {
		
		int x =5;
		int y = 10;
		
		System.out.println("Before Swap: x: "+x+" y: "+y);
		
		x=x^y;//1111
		y=x^y;//1010
		x=x^y;//0101
		
		System.out.println("Afetr Swap: x: "+x+" y: "+y);
	}
	
	public static void main(String[] args) {
		
		swap2NumberWith3rdVariable();
		swap2NumberWithout3rdVariable();
		swapUsingXOR();
	}

}
