
public class TestHWSerg3 {

	public static void main(String[] args) {

		Employee employee = new Employee("Joe", 30, 'M', 100);

		System.out.println(DateUtils.getSalary(employee, DateUtils.getMonths()));
	}

}