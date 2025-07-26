package practical;
import java.util.*;
public class bitwise {
	public static void main(String args[]) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println("Enter another number: ");
		b = sc.nextInt();
		c = a & b;
		System.out.println("a & b = " + c );
		c = a | b;
		System.out.println("a | b = " + c );
	}
}
