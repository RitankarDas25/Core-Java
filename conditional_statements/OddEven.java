package conditional_statements;
import java.util.*;

public class OddEven {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enetr a number");
	int num = sc.nextInt();
//	if(num>=0)
//	{
//		if(num%2 ==0)
//			System.out.println("positive even");
//		else
//			System.out.println("positive odd");
//
//	}
//	else
//	{
//		if(num%2==0)
//			System.out.println("negative even");
//		else
//			System.out.println("negative odd");
//
//
//	}
	if(num>=0 && num%2==0)
		System.out.println("positive even");
	else if	(num>=0&& num%2 !=0)	
		System.out.println("positive odd");

	else if(num<0&&num%2==0)
		System.out.println("negative even");
	else
		System.out.println("negative odd");

}
}
