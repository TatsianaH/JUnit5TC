
public class Worker implements IEmployee{
	
	
private String name; 
private int baseSalary;


	public Worker(String name, int baseSalary) {
	this.name = name;
	this.baseSalary = baseSalary;
}

@Override
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public int getBaseSalary() {
		return this.getBaseSalary();
	}

	@Override
	public int getSalary() {
	
		return 0;
	}
}
