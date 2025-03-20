package methodes;

import java.util.*;
public class LinearSearch {
	static void search(int[] arr, int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key) {
				System.out.println("found "+key+" at index "+(i+1));
				return;
			}
		}
		System.out.println("not found");
		
	}
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter size");
		n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter elements");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter element to find");
		int key = sc.nextInt();
		search(arr,key);
		
	}

}
