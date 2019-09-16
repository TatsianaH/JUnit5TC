
public class StringMethods {
public static void main(String[]args) {
	String mstr = new String("Vlad");
	String palindrome = "Madam Im Adam";
	String palindrome2 = "Madam Im Adam";
	
	char ch = palindrome.charAt(2);
	System.out.println("Char [2]: " + ch);
	
	int position = palindrome.indexOf('I');
	System.out.println("Position of I: " + position);
	
	int length = palindrome.length();
	System.out.println(length);
	
	System.out.println(("Palindrome length: " + length).indent(3));
	
	if(palindrome == palindrome2)
		System.out.println("==: equals");
	else 
		System.out.println("==: not equals");
	
	if(palindrome.equals(palindrome2))
		System.out.println("Strings are equal");
	
	//output formatting
	int intVar = 24;
	float floatVar = 6.6f;
	char charVar = 'V';
	
	
	System.out.printf("The formatted string: %d %f %c %s", intVar, floatVar, charVar, palindrome + "\n");

	String str = new String("String");
	String str2 = new String("String");
	if(str == str2) {
		System.out.println("==: Equals");
	} else {
		System.out.println("==: Not equals");
	}
	
	System.out.println(str.equals(str2));
	
}
}
