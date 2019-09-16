
public class Manager extends Worker implements IManager{
	private int numberOfSubordinates;

	
	public Manager(int baseSalary, String name, int numberOfSubordinates) {
		super(name, baseSalary);
	this.numberOfSubordinates = numberOfSubordinates;
	}
	
	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}

	public void setNumberOfSubordinates(int numberOfSubordinates) {
		this.numberOfSubordinates = numberOfSubordinates;
	}
	@Override
	public int getSalary() {
		if(getNumberOfSubordinates () == 0) {
			return super.getBaseSalary();
		} else {
		return getBaseSalary() * getNumberOfSubordinates() / 100 * 3;
	}
	}
}
