package array_2D;
import java.security.DomainCombiner;
import java.util.*;
import java.util.Arrays;
public class MaxElement {
	public static Scanner sc = new Scanner(System.in);
	public static int[][] createArray(){
		System.out.println("enter the number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of columns");
		int cols= sc.nextInt();
		int [][] arr = new int[rows][cols];
		System.out.println("enter the elements");
		for(int i=0;i<arr.length;i++)
		{
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
	public static void maxElement(int[][] arr)
	{int max = arr[0][0];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			
				max=Math.max(max, arr[i][j]);
			
			}
		System.out.println("maximum element is : "+max);
	}
	
	public static void main(String[] args) {
		//Display_Array(Create_Array());
		maxElement(createArray());
	}
}
		