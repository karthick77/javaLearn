
package basics2;

public class ArmstrongNumber {
	
	public static boolean isArmstorngNumber(int num) {
		
		int temp = num;
		int r = 0;
		int cube = 0;
		
		while(num>0) {
		    r = num%10;
		    num = num/10;
		    cube = cube + (r*r*r);
		}
		
		return (temp == cube) ? true : false;
	}

	public static void main(String[] args) {
		
		int num = 153;
		System.out.println(isArmstorngNumber(num));

	}

}
