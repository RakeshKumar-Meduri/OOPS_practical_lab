package practical;

public class Stringbuilder_ex {
		public static void main(String args[]) {
	        StringBuilder sb1 = new StringBuilder("Hello");
	        StringBuilder sb2 = new StringBuilder("Hello");
	        StringBuilder sb3 = new StringBuilder("Hello");
	        StringBuilder sb4 = new StringBuilder("Hello");
	        StringBuilder sb5 = new StringBuilder("Hello");
	        
	        
	        sb1.append(" User");
	        sb1.insert(5, "!");
	        sb2.insert(5, " ");
	        sb2.insert(6,"java");
	        sb2.charAt(5);
	        sb2.setCharAt(5, '-');
	        sb3.delete(0, 5);
	        sb4.replace(0, 4, "Hi");
	        sb5.reverse();
	        System.out.println("append" +"  "+sb1);  
	        System.out.println("insert" +"  " +sb2); 
	        System.out.println("delete" +"  " +sb3); 
	        System.out.println("replace" +"  " +sb4); 
	        System.out.println("reverse" +" " +sb5); 
	    }
	}


