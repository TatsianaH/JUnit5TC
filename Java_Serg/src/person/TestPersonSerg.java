package person;

import person.Employee;
import person.Salary;

public class TestPersonSerg {

	public static void main(String... args) {

		Employee employee1 = new Employee("Mike", 30, 'M', 300);
		Employee employee2 = new Employee("Mila", 31, 'M', 500);
		
		Salary salary = new Salary();
		int sum = salary.getSum(employee1, employee2);
		
		System.out.println(sum);

	}

}
