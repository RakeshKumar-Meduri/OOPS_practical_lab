package practical;
import java.util.Scanner;
public class inc_dec {
	public static void main(String args[]) {
		int a,b;
		int r1, r2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = sc.nextInt();
		System.out.println("Enter another number: ");
		b = sc.nextInt();
		r1 = ++a;
		System.out.println("Increment of a is: " +r1);
		r2 = --b;
		System.out.println("Decrement of a is : " +r2);
	}
}
