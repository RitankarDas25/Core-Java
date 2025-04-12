package array_java;
import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		int arr[]= new int[] { 1,4,45,68,78};
		 int intKey = 45;

	        System.out.println( intKey + " found at index = " + Arrays.binarySearch(arr,intKey));
		
	}

}
