package basics3;

public class UnderstandStaticKeyword {
	
	static {
		System.out.println("Inside static block-1");
	}
	static {
		System.out.println("Inside static block-2");
	}
	
	public static void sm1() {
		System.out.println("Inside static method");
	}
	
	public void nm1() {
		System.out.println("Inside non static method");
		UnderstandStaticKeyword.sm1();
	}

	public static void main(String[] args) {
		
        System.out.println("Inside main method");
        UnderstandStaticKeyword.sm1();
        UnderstandStaticKeyword unsk = new UnderstandStaticKeyword();
        unsk.nm1();
    
	}

}
