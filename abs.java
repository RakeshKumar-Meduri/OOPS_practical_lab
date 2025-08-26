//example practice problem for abstract classes
public class abs {
	static abstract class animal{
		void eat() {
			System.out.println("Cat eats fish");
		}
	}
	static class cat extends animal{
		void make_sound() {
			System.out.println("Meow");
		}
	}
	public static void main(String args[]) {
		cat c = new cat();
		c.make_sound();
		c.eat();
		
	}
}
