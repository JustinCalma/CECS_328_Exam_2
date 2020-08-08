// Justin Calma CECS 328 - 14 F 8:00 AM - 12:45 PM

import java.util.ArrayList;
import java.util.Arrays;

public class Problem_2 {
	
	public static void main(String[] args) {
		Problem_2 heap = new Problem_2(); // Creates an object called heap
				
		// Create the 3 Sorted Arrays
		ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(8, 4, 2, 0));
		ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(20, 15, 5, 3));
		ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(10, 7, 6, 1));
		
		// Create the array that will contain the concatenated arrays
		ArrayList<Integer> a = new ArrayList<>();
		
		// Concatenate all of the arrays into the array a
		a.addAll(a1);
		a.addAll(a2);
		a.addAll(a3);
		
		System.out.println("The random generated array with size of 10 is: " + a);
		
		heap.heap_Sort(a);
		
		System.out.println("The sorted random generated array with size of 10 is: " + a);
		
	}
	
	public void build_MinHeap(ArrayList<Integer> a) { // Build Min heap function. Only takes in the passed array as a parameter
		Problem_2 heap = new Problem_2(); // Creates an object called heap
		
		int arrLength = 0; // Instantiates the variable for array length
		
		arrLength = a.size(); // Gets the length of the array and saves it into a variable
		
		for (int i = arrLength / 2; i >= 0; i--) {
			heap.min_Heapify(a, i , arrLength); // Calls Min Heapify function and passes in the array, index, and length
		}
		
	}
	
	public void min_Heapify(ArrayList<Integer> a, int i, int arrLength) {
		Problem_2 heap = new Problem_2(); // Create an object called heap
		
		int leftIdx = 2*i + 1; // Finds the index of the left child and the parent is index i
		
		int rightIdx = 2*i + 2; // Finds the index of the right child and the parent is index i
		
		int midIdx = i; // Index of the parent
		
		if (leftIdx < arrLength && a.get(leftIdx) < a.get(midIdx)) { // Compares if the left child is less than the parent
			midIdx = leftIdx;
		}
		if (rightIdx < arrLength && a.get(rightIdx) < a.get(midIdx)) { // Compares if the right child is less than parent
			midIdx = rightIdx;
		}
		if (midIdx != i) {
			// Call swap helper method to switch the element at index i and the mid element
			heap.swap(a, i, midIdx);
			heap.min_Heapify(a, midIdx, arrLength);
		}
		
	}
	
	public void heap_Sort(ArrayList<Integer> a) {
		Problem_2 heap = new Problem_2(); // Creates an object called heap
		
		heap.build_MinHeap(a); // Calls the build function
		
		int arrLength = a.size() - 1; // Sets current array length - 1
		
		for (int i = arrLength; i > 0; i--) { // Iterates through the array
			// Call swap method to switch first element and the element at the current index
			heap.swap(a, 0, i);
			heap.min_Heapify(a, 0, i); // Calls Min heapify
		}
		
	}
	
	// Helper method to swap two elements in the array
	public void swap(ArrayList<Integer> a, int x, int y) { 
		int temp = a.get(x);
		a.set(x, a.get(y));
		a.set(y, temp);
		
	}
	
}
