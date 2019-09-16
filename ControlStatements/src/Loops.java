
public class Loops {

	public static void main(String[] args) {
		// while
		int count = 11;
		while (count < 11) {
			System.out.println("Count is: " + count);
			count++;

		}
		// do while
		count = 11;
		do {
			System.out.println("Count in do while is: " + count);
			count++;
		} 
		while (count < 11);
		
		//for
		for(int i = 1; i < 11; i++) {
			System.out.println("Count in for is : " + i);
		}
	}
}
