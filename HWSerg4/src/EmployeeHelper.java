
public class EmployeeHelper {

	public static IEmployee getEmployeeByName(String name, IEmployee...employees) {
		for(int i = 0; i < employees.length; i++) {
			if(employees[i].getName().equals(name)) {
				return employees[i];
			}
		}
		return null;
		
	}
	public static int getSum(IEmployee...employees) {
		int result = 0;
		for(int i = 0; i < employees.length; i++) {
			result += employees[i].getSalary();
		}
		return result;
	}
	
	public static Manager getManagerByMinNumberofSubordinates(Manager...managers) {
		
		Manager result = null;
		int min = Integer.MAX_VALUE;;
		for(int i = 0; i < managers.length; i++) {
			if(min > managers[i].getNumberOfSubordinates()) {
				result = managers[i];
				min = result.getNumberOfSubordinates();
			}
		}
		return result;
		
	}
}
