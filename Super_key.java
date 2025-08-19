package practical;

class Vehicle {
    int maxSpeed = 120;
}
class Car extends Vehicle {
    int maxSpeed = 180;
    void display()
    {
        System.out.println("Maximum Speed: "
                           + super.maxSpeed);
    }

    
}
class x extends Car {
	int maxSpeed = 10;
	void display() {
		System.out.println("Max : " + super.maxSpeed);
	}
}
class Super_key {
public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
        x small1 = new x();
        small1.display();
    }
}

