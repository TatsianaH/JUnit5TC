package person;

public class Person {
	private String name;
	private int age;
	private char sex;

	public Person(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	protected String getBaseName() {
		return this.name;
	}

	public String getName() {
		return (sex == 'W' ? "Ms. " : "Mr. ") + name;
	}

	public int getAge() {
		return age;
	}

	public int getSex() {
		return sex;
	}
}
