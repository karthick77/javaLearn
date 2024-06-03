package naveen;

public class PrintWithoutSemicolon {

	public static void approach1() {

		if (System.out.printf("Hello"+"\n") == null) {

		}
	}

	public static void approach2() {

		if (System.out.append("Hello"+"\n") == null) {

		}
	}
	
	public static void approach3() {

		if (System.out.append("Hello"+"\n").equals(null)) {

		}
	}
	
	public static void approach4() {

		for(int i=0; i<1; System.out.println("Hello")) {
			i++;
		}
	}

	public static void main(String[] args) {

		approach1();
		approach2();
		approach3();
		approach4();
	}

}
