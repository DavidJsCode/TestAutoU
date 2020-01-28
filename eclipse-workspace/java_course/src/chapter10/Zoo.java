package chapter10;

public class Zoo {

	public static void main(String[] args) {

	    Dog rocky = new Dog();
	    rocky.fetch();
	    rocky.makeSound();
	    
	    Animal sasha = new Dog();
		sasha.makeSound();
		
		sasha = new Cat();
		sasha.makeSound();
		
		((Cat)sasha).scratch(); //this is type casting, only for this call to the scratch method
		
		feed(rocky);
		feed(sasha);
	
	}
	
	public static void feed (Animal animal) {
		
		if (animal instanceof Dog) { //instanceof let's you create different behavior for a subclass
			System.out.println("fed dog food");
		}
		
		else if (animal instanceof Cat) {
			System.out.println("Fed cat food");
		}
	}

}
