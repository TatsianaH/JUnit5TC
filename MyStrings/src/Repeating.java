
public class Repeating {

	public static void main(String[] args) {
		String name = "Tatsiana Hantsevich";
		char first = name.charAt(0);
		int space = name.indexOf(' ');
		char last = name.charAt(space + 1);
		String initials = "" + first + last;
		System.out.println(initials);

	}

}
