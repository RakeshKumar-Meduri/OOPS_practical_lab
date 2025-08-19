package practical;
import java.util.*;
public class Arr_sum {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no of digits of the array: ");
	int n = sc.nextInt();
	int[] a = new int [n];
	for(int i = 0; i<n;i++) {
		a[i] = sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		sum = sum+a[i];
	}
	System.out.println("the sum of the given array numbers is: "+sum);
	System.out.println("the average of the given array nubers is: " +sum/n);
	}
}
