package exceptionalHandling;

public class ExceptionHandling2 {

	static void check(int age) throws UserdefineException{
		if (age < 18) {
			throw new UserdefineException("Age less than expected from userdefined function");
		}
	}

	public static void main(String[] args) {

		try {
			check(17);
		} catch (UserdefineException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("End of code!");
	}
}
