
public class Switch12 {

	public static void main(String[] args) {
		//switch 
		int index = 3;
		System.out.println("1. Traditional switch statement");
		switch(index) {
		case 1:
			System.out.println("1 case");
			break;
		case 2:
			System.out.println("2 case");
			break;
		case 3:
			System.out.println("3 case");
			break;
		default:
			System.out.println("default");
		
		}
		System.out.println("2. Enchanced switch statement");
index = 2;
switch(index) {
case 1 -> System.out.println("1 case");
case 2 -> System.out.println("2 case");
case 3 -> System.out.println("3 case");
default -> System.out.println("default");	
}

System.out.println("3. Multiple case statements");
index = 1;
switch(index) {
case 1 -> {System.out.println("1 case");
System.out.println("Additional 1  case");
}
case 2 -> System.out.println("2 case");
case 3 -> System.out.println("3 case");
default -> System.out.println("default");	
}
System.out.println("4. Multiple case labels");
index = 8;	
String caseNumberStr = 
switch(index) {
case 0 -> "0 case";
case 1, 3, 5, 9 -> "odd case";
case 2, 4, 6, 8 -> "even case";
default -> "default case";	
};

System.out.println(caseNumberStr);

}
}


