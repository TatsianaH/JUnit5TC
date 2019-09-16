package person;

public class Employee extends Person {
	
	private int salary;

	public Employee(String name, int age, char sex, int salary) {
		super(name, age, sex);
		this.salary = salary;
	}

	public boolean isSameName(Employee employee) {
		return getBaseName().equals(employee.getBaseName());

	}

	public int getSalary() {
		return salary;
	}
}
