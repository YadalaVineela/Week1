package week1.day1;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car audi= new Car();
		audi.applyBrake();
		audi.driveCar();
		audi.soundHorn();
		audi.isPuncture();

	}
	public void driveCar() {
		// TODO Auto-generated method stub
		System.out.println("Car is in drive mode");

	}
	public void applyBrake() {
		// TODO Auto-generated method stub
		System.out.println("I have applied brake");
	}
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("I have pressed horm");
	}
	public boolean isPuncture() {
		// TODO Auto-generated method stub
		return true;
	}
	

}
