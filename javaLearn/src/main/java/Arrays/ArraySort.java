package Arrays;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
//	       int[] arr = {2,1,-1,3,4,-5,7};
//	       Arrays.sort(arr);
//	       for(int i=0; i<arr.length; i++) {
//	    	   System.out.print(arr[i]+" ");
//	       }
//	       System.out.println();
//	       Arrays.sort(arr, 3, arr.length);
//	       for(int i=0; i<arr.length; i++) {
//	    	   System.out.print(arr[i]+" ");
//	       }
		
		   int[] arr = {5,6,3,2,1,0,-1};
		   Arrays.sort(arr);
		   for(int i=0; i<arr.length; i++) {
			   System.out.print(arr[i]+" "); //-1 0 1 2 3 5 6
		   }
		   System.out.println();
		   System.out.println(Arrays.binarySearch(arr, -1));//0
		   System.out.println(Arrays.binarySearch(arr, 5));//5
		   System.out.println(Arrays.binarySearch(arr, 4));//-6
		   System.out.println(Arrays.binarySearch(arr, -2));//-1
		 
	    }  
}
