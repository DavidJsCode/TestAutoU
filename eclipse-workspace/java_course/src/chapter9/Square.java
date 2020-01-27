package chapter9;

public class Square extends Rectangle {

	double sides = 4;
	double length = 3;
	
	@Override
	public double calculatePerimeter() {
		return sides * length;
	}
	
	public void print(String what) {
		System.out.println("I am a " + what);
	}
}
