package merge_sort;
import java.util.Arrays;
public class MergeSort {
	

	// Merge sort in Java



	  // Merge two sub arrays left and right into array
	  void merge(int array[], int start, int mid, int end) {

	    int leftArrayLength = mid - start + 1;
	    int rightArrayLength = end - mid;

	    int left[] = new int[leftArrayLength];
	    int rigth[] = new int[rightArrayLength];

	    // fill the left and right array
	    for (int i = 0; i < leftArrayLength; i++)
	      left[i] = array[start + i];
	    for (int j = 0; j < rightArrayLength; j++)
	      rigth[j] = array[mid + 1 + j];

	    // Maintain current index of sub-arrays and main array
	    int i, j, k;
	    i = 0;
	    j = 0;
	    k = start;

	    // Until we reach either end of either L or M, pick larger among
	    // elements L and M and place them in the correct position at A[p..r]
	    // for sorting in descending
	    // use if(L[i] >= <[j])
	    while (i < leftArrayLength && j < rightArrayLength) {
	      if (left[i] <= rigth[j]) {
	        array[k] = left[i];
	        i++;
	      } else {
	        array[k] = rigth[j];
	        j++;
	      }
	      k++;
	    }

	    // When we run out of elements in either L or M,
	    // pick up the remaining elements and put in A[p..r]
	    while (i < leftArrayLength) {
	      array[k] = left[i];
	      i++;
	      k++;
	    }

	    while (j < rightArrayLength) {
	      array[k] = rigth[j];
	      j++;
	      k++;
	    }
	  }

	  // Divide the array into two sub arrays, sort them and merge them
	  void mergeSort(int array[], int start, int end) {
	    if (start < end) {

	      // m is the point where the array is divided into two sub arrays
	      int mid =start+ (end - start) / 2;

	      // recursive call to each sub arrays
	      mergeSort(array, start, mid);
	      mergeSort(array, mid + 1, end);

	      // Merge the sorted sub arrays
	      merge(array, start, mid, end);
	    }
	  }

	  public static void main(String args[]) {

	    // created an unsorted array
	    int[] array = { 6, 5, 12, 10, 9, 1 };
	    System.out.println(Arrays.toString(array));
	    MergeSort ob = new MergeSort();

	    // call the method mergeSort()
	    // pass argument: array, first index and last index
	    ob.mergeSort(array, 0, array.length - 1);

	    System.out.println("Sorted Array:");
	    System.out.println(Arrays.toString(array));
	  }
	}

