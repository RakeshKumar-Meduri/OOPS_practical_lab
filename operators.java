package practical;
import java.util.Scanner;
public class operators {
	public static void main(String args[]) {
		int a,b;
		Scanner x = new Scanner(System.in);
		System.out.println("enter a number: ");
		a = x.nextInt();
		System.out.println("Enter another number: ");
		b = x.nextInt();
		System.out.println("a + b = " +(a+b));
		System.out.println("a - b = " +(a-b));
		System.out.println("a % b = " +(a%b));
		System.out.println("a * b = " +(a*b));
	}
}
