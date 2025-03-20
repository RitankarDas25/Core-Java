package loops;
import java.util.*;
public class ForLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num = sc.nextInt();
	int factorial =1;
	for(int i=1;i<=num;i++)
	{
		factorial*=i;
	}
	System.out.println(factorial);
}
}
