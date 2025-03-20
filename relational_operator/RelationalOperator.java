package relational_operator;
import java.util.*;
public class RelationalOperator {
	static Boolean iseven(int num)
	{
		if(num%2==0)
			return true;
		return false;
	}
	static Boolean ispositive(int num)
	{
		if(num>=0)
			return true;
		return false;
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enetr a number");
//		int num = sc.nextInt();
////		if(num>=0)
////		{
////			if(num%2 ==0)
////				System.out.println("positive even");
////			else
////				System.out.println("positive odd");
////
////		}
////		else
////		{
////			if(num%2==0)
////				System.out.println("negative even");
////			else
////				System.out.println("negative odd");
////
////
////		}
//		if(ispositive(num) && iseven(num)) System.out.println("positive even");
//		else if (!ispositive(num) && iseven(num)) System.out.println("negative even");
//		else if (ispositive(num) && !iseven(num)) System.out.println("positive odd");
//		else System.out.println("negative odd");
//		int a = 15,b=10,c=50;
//		int x = a>b && a>c? a: b>c?b:c;
//	
//		
int a =5;
a+=a-=a*a;
System.out.println(a);
	}

}
