package practical;

class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}
class C extends A
{
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}
class D extends C{
	void m1() {
		System.out.println("Inside D's m1 method");
	}
}

class Polymorphism
{
    public static void main(String args[])
    {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        A ref;
        ref = a;
        ref.m1();
        ref = b;
        ref.m1();
        ref = c;
        ref.m1();
        ref = d;
        ref.m1();
    }
}

