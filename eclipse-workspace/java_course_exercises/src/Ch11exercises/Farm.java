package Ch11exercises;

public class Farm {

	public static void main(String[] args) {

		Duck duck = new Duck();
		duck.makeSound();
		
		Animal anotherDuck = new Duck();
		anotherDuck.makeSound();
		anotherDuck.eat();
		duck.eat();
		
		anotherDuck = new Pig();
		anotherDuck.makeSound();
		
	}

}
