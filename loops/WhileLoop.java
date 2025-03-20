package loops;
import java.util.*;
public class WhileLoop {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	long num = sc.nextLong();
	int count =0;
	while(num!=0)
	{
		count++;
		num/=10;
	}
	System.out.println(count);
	}

}
