package array_java;
import java.util.*;
public class ArrayPalindrom {
	public static Scanner sc = new Scanner(System.in);
	public static int[] InputArray() {
		System.out.println("enter the length");
		int n = sc.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the elements");
		for(int i =0;i<arr.length;i++)
			arr[i]= sc.nextInt();
		return arr;
	}
	public static void Palindrome(int[] arr)
	{
		for( int i : arr)
		{
			int rev=0;
			int temp =i;
			while(i !=0)
			{
				int digit = i%10;
				rev = rev*10 + digit;
				i/=10;
			}
			if(temp != rev)
			{
				System.out.println("not palindrome array");
				return;
			}
			else
				continue;
		}
		System.out.println("palindrome Array");
		return;
	}
	public static void main(String[] args) {
		Palindrome(InputArray());
		sc.close();
	}
	

}
