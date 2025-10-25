package javaoops;
abstract class Vehicle {
	final void startEngine() {
		System.out.println("The engine started by self starter");
	}
	
	static String getVehicleType() {
		return "Domestic vehicles";

	}

	 abstract void drive();
}

class Cars extends Vehicle{
	void drive(){
		
		System.out.println("Car could produce less noise when it starts");
	}
}

class MotorCycle extends Vehicle{
	
	void drive() {
		
		System.out.println("Motorcycle could produce more noise when it starts");
	}

}
public class StaticMethod {
public static void main(String[] args) {
	Cars c=new Cars();
	c.drive();
	
	MotorCycle m=new MotorCycle();
	m.drive();
	
	System.out.println(Vehicle.getVehicleType());
	
}
}
