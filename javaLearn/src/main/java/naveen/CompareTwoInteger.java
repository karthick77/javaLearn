package naveen;

public class CompareTwoInteger {

	public static void main(String[] args) {
		
		Integer num1 = 100;
		Integer num2 = 100;
		
		//Integer Caching range -128 to 127
		//== check with reference memory location
		if(num1==num2) {
			System.out.println("both are equal");
		}else {
			System.out.println("both are not equal");
		}

	}

}
