public class TryItEditorSucks {
	
  public static void main(String[] args) {
  	//TryItEditorSucks.Demo4(); // compare ternary with if-else   	
    //TryItEditorSucks.Demo5(); // overview of for loop  	
  	//TryItEditorSucks.Demo2(); // ext for loop parts  	
  	//TryItEditorSucks.Demo1(); // linear search | break
  	//TryItEditorSucks.Demo6(); // forward and reverse for loop 	
  	//TryItEditorSucks.Demo3(); // while <vs> do-while
  } // Ends Method Main

  
  //############################################
  public static void Demo1(){
  	
  	// Create 'int array literal' of 100 random
  	// values within the span [10,100] (WLOG)
  	int[] arr = {
  	  75,32,93,94,53,24,36,65,46,75,
  		92,38,98,78,20,41,48,71,27,96,
  		31,12,20,32,17,88,79,77,67,83,
  		69,72,38,86,88,12,96,61,30,33,
  		12,85,69,35,70,62,45,77,93,41,
  		53,61,93,39,81,52,66,24,73,24,
  		67,19,32,94,83,83,59,93,36,77,
  		93,93,76,70,76,99,90,15,65,17,
  		59,52,35,87,20,69,25,93,42,57,
  		60,80,73,33,73,32,47,52,54,49
  	};
  	
  	// Let's reassign one of the array elements
  	// with a value well outside the span...
  	arr[0] = 9001;
  	
  	// Let's make that value our query to search
  	// for within the array...
  	int query = 9001; // A.K.A. arr[25];
  	
  	// Now we'll search for the query...
  	boolean foundIt = false;
  	int foundIndex  = -1; // <= another use of 'sentinel vals'
  	for (int i = 0; i < arr.length; i++) {
			
  		// And if we find it...
  		if(arr[i] == query) {
  			foundIt = true; // indicate that we did
  			foundIndex = i; // indicate the index it was found
  			break; // and 'break out of the loop'
  		}
  		
		} // Ends For Loop

  	
  	String strMess = "";
  	
  	if(foundIt) {
  		strMess = "Query "+query+" was found at index "+foundIndex;
  	}
  	else {
  		strMess = "Query was NOT found";  		
  	}
  	
  	System.out.println(strMess);
  	
  } // Ends Method Demo1

  
  //############################################  
  public static void Demo2(){
    int i = 0;
    int stopAt = 10;
			    
    for (;;) {
      System.out.println(i);
      i++;
      if(i>stopAt){break;}
    } // Ends For Loop	
  } // Ends Method Demo2
 
  
  //############################################
  public static void Demo3(){
  	
  	//------------------------------------------
  	//> Part 0: The Setup
  	//------------------------------------------  	
  	int[] exVals = {516,631,520,480,212,800,718};
  	int i = 0;

  	//------------------------------------------
  	//> Part 1: While Loop
  	//------------------------------------------
  	System.out.println("Start of While Loop");

  	while( i>0 && i<exVals.length ) {
  		System.out.println(" > index #"+i+" = "+exVals[i]);
  		i++;
  	}
  	
  	System.out.println("End of While Loop\n");

  	//------------------------------------------
  	//> Part 2: Do-While Loop
  	//------------------------------------------
  	System.out.println("Start of Do-While Loop");
  	
  	do {
  		System.out.println(" > index #"+i+" = "+exVals[i]);
  		i++;
  	} while( i>0 && i<exVals.length );
  	
  	System.out.println("End of Do-While Loop");
  
  } // Ends Method Demo3
  
  
  //############################################
  public static void Demo4(){
  	
  	int dayOfWeek    = 3;  // goes from [1,7]
  	String typeOfDay = "";
  	
  	// technique 1 -> use an if-else
  	if(dayOfWeek<=5) {typeOfDay = "weekday";}
  	else             {typeOfDay = "weekend";}
  	
  	// technique 2 -> use a ternary
  	typeOfDay = (dayOfWeek<=5) ? "weekday" : "weekend";
  	
    System.out.println(typeOfDay);

  } // Ends Method Demo4

  
  //############################################
  public static void Demo5(){
  	int numIterations = 10;
  	
  	/* >>> The 'Hypothetical' For Loop that this demo models
  	for (int i = 0; i < numIterations; i++) {
  		System.out.println(i);
  		// pretend there's also a bunch of other stuff
  	}
  	*/
  	
		System.out.println("We just assigned [0] to an int named 'i'");

  	for (int i = 0; i < numIterations; i++) {
  		System.out.println("is ("+i+"<"+numIterations+") => true? YES, so...");
  		System.out.println("run the code in the block, then");
  		System.out.println("increment i by 1, i.e. ("+i+"++)=["+(i+1)+"]");  		
  		System.out.println("this iteration is done, onto the next one...\n");  	
  	}
		
  	System.out.println(" is ("+10+"<"+numIterations+") => true? NO, so...");  		
		System.out.println(" the loop 'breaks out' i.e. terminates...\n");  	
  	
		System.out.println(" and we continue running the rest of the program");  	
  } // Ends Method Demo5

  
  //############################################
  public static void Demo6(){
  	
  	int[] smallEx = {3,8,12};
  	
  	for (int i=0; i<smallEx.length; i++){
  		System.out.print(smallEx[i]+" ");
  	}
  	System.out.println();

  	for (int i=smallEx.length-1; i>=0; i--){
  		System.out.print(smallEx[i]+" ");
  	}
  } // Ends Method Demo6
  
  
} // Ends Class TryItEditorSucks
