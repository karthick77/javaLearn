package StaticAndInstanceBlock;

public class StaticBlock {

	int age;

	static {
		System.out.println("Static block 1");
	}

	private StaticBlock() {
		age = 34;
	}

	public static int staticMathod1() {
		System.out.println("staticMathod1");
		StaticBlock sb = new StaticBlock();
		return sb.age=33;
	}

}
