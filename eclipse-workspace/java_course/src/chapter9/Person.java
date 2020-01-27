package chapter9;

public class Person {
	
	public Person(){
		System.out.println("In Person default constructor");
	}
	
	public Person (String name) {
		System.out.println("In Person 2nd construtcor, name is set");
	}
	
	private String name;
	private String age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
}


