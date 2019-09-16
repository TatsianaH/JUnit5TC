
public class Director extends Manager {

	

	public Director(int baseSalary, String name, int numberOfSubordinates) {
		super(baseSalary, name, numberOfSubordinates);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSalary() {
		if(getNumberOfSubordinates () == 0) {
			return super.getSalary();
		} else {
		return getBaseSalary() * getNumberOfSubordinates()/ 100 * 9;
	}
	}
}
