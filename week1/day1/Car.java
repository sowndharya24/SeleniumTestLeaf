package week1.day1;

public class Car {

	private void driveCar() {
		// TODO Auto-generated method stub
		System.out.println("Driving Car");
	}
	private void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("Applying Brake");
	}
	private void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Horn beeping");
	}
	private void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("Punctured ");

	}
	public static void main(String[] args) {
		Car c=new Car();
		c.driveCar();
		c.applyBrake();
		c.soundHorn();
		c.isPuncture();
	}
	
}
