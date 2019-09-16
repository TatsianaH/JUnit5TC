package person;

public class Salary {

	public int getSum(Employee... employeeArray) {
		int res = 0;
		for (int i = 0; i < employeeArray.length; i++) {
			res += employeeArray[i].getSalary();
		}
		return res;
	}
}
