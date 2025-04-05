package dsa;
import java.util.Arrays;


public class InsertionSort {
	// Insertion sort in Java

	
	

	static void insertionSort(int [] array){
	    int size = array.length;

	    for (int i = 1; i < size; i++) {
	      int current=array[i];
	      int j = i- 1;

	      // Compare key with each element on the left of it until an element smaller than
	      // it is found.
	      // For descending order, change key<array[j] to key>array[j].
	      while (j >= 0 && current<array[j]){
	        array[j + 1] = array[j];
	        --j;
	      }

	      // Place key at after the element just smaller than it.
	      array[j + 1] = current;
	    }
	  }

	  // Driver code
	  public static void main(String args[]) {
	    int[] data = { 9, 5, 1, 4, 3 };
	    System.out.println("Original Array :");
	    System.out.println(Arrays.toString(data));
	    insertionSort(data);
	    System.out.println("Sorted Array in Ascending Order: ");
	    System.out.println(Arrays.toString(data));
	  }
	}

