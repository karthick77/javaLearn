
package basics;

import java.util.Arrays;

public class SmallestAndLargest {

	public static void findSmallAndLarge() {
		
		int num[] = {-10, 50, 20, -50, 977, 1, 979};
		
		int largest = num[0];
		int smallest = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i] > largest) {
				largest = num[i];
			}
			if(num[i] < smallest) {
				smallest = num[i];
			}
		}
		
		System.out.println("Given Array: "+Arrays.asList(num));
		System.out.println("Largest: "+largest);
		System.out.println("Smallest: "+smallest);
	}
	
	public static void main(String[] args) {
		
		findSmallAndLarge();
	}

}
