import java.util.Scanner;
public class Launcher {
	
	// TODO: PROCESSING EXAMPLE
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		
		//System.out.println(<your HW-2 class name>.isEven(32)); 
		//System.out.println(<your HW-2 class name>.isOdd(31)); 
				
		int testNum = 0;
		int maxTests = 10;
		for (int i = 0; i < maxTests; i++) {
			System.out.println("Test # "+ (testNum+1) +"...");		
			doEvenTest(scanner);
			testNum++;
		}
	
	}
	
	public static void doEvenTest(Scanner s) {
		System.out.print("Enter integer here: ");
		int userInt = s.nextInt(); // gets sample int from user
		boolean result = es900100hw2.isEven(userInt); // runs isEven with user input
		isEvenPrompt(userInt,result);
	}
	
	
	public static void isEvenPrompt(int inputVal, boolean returnVal) {		
		String isItEven;
		if(returnVal == true) {isItEven = "yes";}
		else {isItEven = "no";}		
		System.out.println("You have entered "+inputVal+". Is this even? "+isItEven);	
	}
	
}