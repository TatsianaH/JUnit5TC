

public class Employee {

	private String  name;
	private int age;
	private char sex;
	private int salary;
	
	public Employee(String name, int age, char sex, int salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/*public int getSalary(DateUtils.Month[] monthArray) {
		int workDays = 0;
		for(int i = 0; i < monthArray.length; i++) {
			workDays += monthArray[i].getWorkDays();
		}
		return this.getSalary() * workDays;
	}*/
	
	
}
