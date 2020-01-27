package chapter9;

public class Employee extends Person {
	
	//public Employee() {
		//System.out.println("In Employee default constructor");
	//}
	
	public Employee() {
		super("angie");
		System.out.println("In Employee default constructor");
	}

	private String employeeId;
	private String title;
	
	public String getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	
}
