
public class Employee extends Person {
	private int salary;
	private String company;

	public Employee (String aName, int aSalary, String aCompany) {
		super(aName);
		salary = aSalary;
		company = aCompany;
	}

	public int getSalary() {
		return salary;
	}

	public String getCompany() {
		return company;
	}
	
}
