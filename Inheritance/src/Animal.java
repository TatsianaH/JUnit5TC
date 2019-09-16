
public class Animal {

	private String type;
	
	//constructor
	public Animal(String aType) {
		type = aType;
	}
	//default constructor
	public Animal() {
		type = "";
	}
	//operations
	public void eat() {
		System.out.println("Eating...");
	}
//getter
	public String getType() {
		return type;
	}
	// we don't need to have setter here, because we already have the constructor
	//public void setType(String type) {
	//	this.type = type;
	//}
	
	
}
