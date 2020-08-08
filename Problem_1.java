// Justin Calma CECS 328 - 14 F 8:00 AM - 12:45 PM

import java.util.Arrays;

public class Problem_1 {
	
	public static void main(String[] args) {
		// Creating object to call FindIdx method
		Problem_1 idx = new Problem_1();
		
		// Create arrays to test
		int[] a1 = {2, 5, 8, 10, 12, 0, 1};
		int[] a2 = {1, 6, 9, 10};
		int[] a3 = {20, 30, 40, 1, 5, 10};
		
		int result1 = idx.FindIdx(a1);
		int result2 = idx.FindIdx(a2);
		int result3 = idx.FindIdx(a3);
		
		System.out.println("The lowest value is found at index: " + result1 + 
				". For the array " + Arrays.toString(a1));
		System.out.println("The lowest value is found at index: " + result2 + 
				". For the array " + Arrays.toString(a2));
		System.out.println("The lowest value is found at index: " + result3 + 
				". For the array " + Arrays.toString(a3));
		
	}
	
	public int FindIdx(int[] arr) {
		// Save the first value of the array into a variable
		int lowestValueIdx = 0;
		
		if (arr[lowestValueIdx] < arr[arr.length - 1]) {
			lowestValueIdx = 0;
		}
		
		//Iterate through the array comparing the first element 
		//with the current element
		for (int i = 0; i < arr.length; i++) {
			if(arr[lowestValueIdx] > arr[i]) {
				lowestValueIdx = i;
			}
		}
		return lowestValueIdx;
	}
	
}
