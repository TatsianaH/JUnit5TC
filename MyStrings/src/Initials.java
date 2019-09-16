
public class Initials {

	public static void main(String[] args) {
	String name = "Tanya Hantsevich";

	char first = name.charAt(0);
	int space = name.indexOf(' ');
	char last = name.charAt(space + 1);
	
System.out.println(first + last);
System.out.printf("%c%c\n", first, last);

System.out.println(first);
System.out.println(last);

System.out.print(first);
System.out.print(last);
	
	}

}
