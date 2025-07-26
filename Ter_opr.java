package practical;
import java.util.Scanner;

public class Ter_opr {
  
      public static void main(String[] args) {
          
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
      int a = sc.nextInt();
		System.out.println("Enter another number: ");
      int b = sc.nextInt();
          int max = (a > b) ? a : b;

          System.out.println("The greater number is: " + max);
      }
  

}