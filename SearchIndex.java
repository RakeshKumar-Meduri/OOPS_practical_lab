package practical;
import java.util.*;
public class SearchIndex {
	 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 String s = sc.next();
	 String c = sc.next();
	        System.out.println(s.indexOf(c));        
	        System.out.println(s.lastIndexOf(c));    
	        System.out.println(s.contains(c));            
	 }
}
