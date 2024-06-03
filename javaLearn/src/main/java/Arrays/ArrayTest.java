package Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		String name = "i.love.this.program.very.much";
		String replace = name.replace(".","-");
        String[] data = replace.split("-");
       
        for (String str : data) {
			System.out.println(str);
		}
	}

}
