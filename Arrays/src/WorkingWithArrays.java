
public class WorkingWithArrays {

	public static void main(String[] args) {
//array declaration		
		int[] myArray;
		int myArray2[];// 2nd case of C++ representation
		myArray = new int[66];// create length of array
		myArray[0] = 24;

		String myString2[];
		String[] myString = new String[2];
		myString[0] = new String("Tony");// можно задавать 2 способами String
		myString[1] = "Vlad";//

		for (int i = 0; i < myString.length; i++) {
			System.out.println(myString[i]);// если хотим распечатать элементы массива
		}

// array initialization
		String[] family = { "Mama", "Papa" };
		
// for each
		for(String string: family) {
			System.out.println(string);
		}
		

	}

}
