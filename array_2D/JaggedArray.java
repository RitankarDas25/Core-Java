package array_2D;
import java.util.*;

public class JaggedArray {
	public static Scanner sc = new Scanner(System.in);
	public static int[][] createArray(){
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		int [][] arr = new int[rows][];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number of columns");
			int cols= sc.nextInt();
			arr[i] = new int[cols];
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=sc.nextInt();
				
		}
		return arr;

}
	public static void displayArray(int [][] arr) {
		System.out.println("array :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		displayArray(createArray());
	}
}
