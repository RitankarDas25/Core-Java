package dsa;

import java.util.Arrays;

public class BubbleSort {
	 // perform the bubble sort
	  static void bubbleSort(int array[]) {
	    int size = array.length;
	    
	    // loop to access each array element
	    for (int i = 0; i < size - 1; i++)
	    
	      // loop to compare array elements
	      for (int j = 0; j < size - i - 1; j++)

	        // compare two adjacent elements
	        // change > to < to sort in descending order
	        if (array[j] > array[j + 1]) {

	          // swapping occurs if elements
	          // are not in the intended order
	          int temp = array[j];
	          array[j] = array[j + 1];
	          array[j + 1] = temp;
	        }
	  }

	  public static void main(String args[]) {
	      
	    int[] data = { -2, 45, 0, 11, -9 };
	    System.out.println("Original Array:");
	    System.out.println(Arrays.toString(data));
	    // call method using class name
	    BubbleSort.bubbleSort(data);
	    
	    System.out.println("Sorted Array in Ascending Order:");
	    System.out.println(Arrays.toString(data));
	  }
	}

