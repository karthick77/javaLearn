
package basics2;

public class Factorial {

	public static int isFactorial(int num) {
		
		int fact =1;
		
		if(num == 0) {
			return 1;
		}
		
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	public static int fact(int num) {
		int num1 = Math.abs(num);
		if(num1==0) {
			return 1;
		}else {
			return (num1*fact(num1-1));
		}
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(isFactorial(5));
		System.out.println(fact(-6));

	}

}
