
public class StringManipulation {

	public static void main(String[] args) {
	
		String sentence = "I like learning Java";// print in reverse order
		char c = sentence.charAt(0);
		String reverseSent = "";
		for (int i = 0; i < sentence.length(); i++) {
			reverseSent = sentence.charAt(i) + reverseSent;
		}
		System.out.println(reverseSent);
		System.out.println("2 case");
		
		for (int i = sentence.length() - 1; i >= 0; i--) {
			
			System.out.print(sentence.charAt(i));
			
		}
		System.out.println();
// Vladimir's solution
		int sizeOfSentence = sentence.length();
		for(int i = 0; i < sizeOfSentence; i++) {
			System.out.print(sentence.charAt(sizeOfSentence - 1 - i));	
		}
		System.out.println();
		
//StringBuilder
		
		String palindrome = "Dot saw I was Tod";
		StringBuilder sb = new StringBuilder(palindrome.toLowerCase());
		sb.reverse();
		System.out.println("\n" + sb);
		if(sb.toString().equals(palindrome.toLowerCase()))
			System.out.println("This is a palindrome");

//split sentence on tokens Для вывода предложения отдельными словами
		String [] words = sentence.split(" ");
		for(String word: words)
			System.out.println(word);
		
		char [] sent = sentence.toCharArray();// вывод посимвольно предложения
			System.out.println(sent[0]);
			
			for(int i = 0; i < sent.length; i++) {//output all chars separately
				System.out.println(sent[i]);
			}
		
	}

}
