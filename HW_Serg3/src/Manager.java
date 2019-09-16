
public class Manager extends Employee {

	private int countOfEmployee;

	public Manager(String name, int age, char sex, int salary, int countOfEmployee) {
		super(name, age, sex, salary);
		this.countOfEmployee = countOfEmployee;
	}

	public int getCountOfEmployee() {
		return countOfEmployee;
	}

	public void setCountOfEmployee(int countOfEmployee) {
		this.countOfEmployee = countOfEmployee;
	}

}
