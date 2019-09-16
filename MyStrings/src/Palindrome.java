
public class Palindrome {

	public static void main(String[] args) {
		String pal = "Madam Im Adam";

		String res = "true";
		pal = pal.toLowerCase().replaceAll("\\s", "");
		
		for (int i = 0; i < pal.length() / 2; i++) {
			if (pal.charAt(i) == pal.charAt(pal.length() - 1 - i)) {
				res = "true";
			} else {
				res = "false";
			}
		}

		System.out.println(res);

	}

}
