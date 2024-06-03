package patterns;

public class SingletonPattern {

	public static SingletonPattern singleInstance = null;
	public String str;
	
	private SingletonPattern() {
		this.str = "welcome";
	}
	
	public static SingletonPattern getInstance() {
		
		if(singleInstance == null) {
			singleInstance = new SingletonPattern();
		}
		return singleInstance;
	}
	
	public static void main(String[] args) {
		
		SingletonPattern x = SingletonPattern.getInstance();
		SingletonPattern y = SingletonPattern.getInstance();
		String str1 = x.str;
		String str2 = y.str;
		System.out.println(str1);
		System.out.println(str2);
	}

}
