import java.util.Random;
import java.util.Scanner;

public class Launcher {
	
	public static void main(String[] args) {	
		int numTests = 20;
		
		runUserInputTest(numTests);
		runPresetTests(numTests);
	}
	
	public static void runUserInputTest(int numTests) {	
		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		
		for (int i = 0; i < numTests; i++) {
			System.out.println("Test # "+(i+1));
			System.out.print("Enter integer here: ");
			int userInt = scanner.nextInt(); // gets sample int from user
			boolean result = es900100hw2.isEven(userInt); // runs isEven with user input
			isEvenPrompt(userInt,result);	
		}		
	}
	
	
	public static void runPresetTests(int numTests) {	
		Random random = new Random();
		
		int[] randTests = new int[numTests];
		
		// makes array of 20 random ints
		for (int i = 0; i < randTests.length; i++) {
			System.out.println("Test # "+(i+1));
			randTests[i] = random.nextInt(100);				
		}
		
		for (int i = 0; i < randTests.length; i++) {
			isEvenPrompt(randTests[i],es900100hw2.isEven(randTests[i]));
		}		
	}
	
	
	public static void isEvenPrompt(int inputVal, boolean returnVal) {		
		String isItEven;
		if(returnVal == true) {isItEven = "Yes!";}
		else {isItEven = "No!";}		
		System.out.println("You have entered "+inputVal+". Is this even? "+isItEven);	
	}
	
}