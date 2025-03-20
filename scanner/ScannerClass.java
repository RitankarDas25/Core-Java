package scanner;
import java.util.Scanner;


public class ScannerClass {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int a = sc.nextInt();
	sc.nextLine();
	System.out.println(a);
	System.out.println("enter a word");
	String w = sc.nextLine();
	System.out.println(w);
}
}
