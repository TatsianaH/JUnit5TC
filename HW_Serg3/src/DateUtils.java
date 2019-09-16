
public class DateUtils {

	public static class Month {
		private String name;
		private int days;
		private int workDays;

		public Month(String name, int days, int workDays) {
			this.name = name;
			this.days = days;
			this.workDays = workDays;
		}

		public String getName() {
			return name;
		}

		public int getDays() {
			return days;
		}

		public int getWorkDays() {
			return workDays;
		}
	}

	private static final Month[] months = { new Month("January", 31, 24), new Month("February", 28, 19) };

	public static Month[] getMonths() {
		return months;

	}
	public static int getSalary(Employee employee, Month[] monthArray) {
		int workDays = 0;
		for(int i = 0; i < monthArray.length; i++) {
			workDays += monthArray[i].getWorkDays();
		}
		return employee.getSalary() * workDays;
	}
}
