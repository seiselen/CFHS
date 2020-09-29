/*======================================================================
| Project: FH-4710/4750 2020-2021 Example Code
| Author:  Steven Eiselen, UArizona/CFHS Computer Science
+-----------------------------------------------------------------------
| Description: Demonstrates correct implementation of arrayMode method
|              from FH-4710/4750 2020-2021 HW 2/3, alongside some simple 
|              tests and the code thereof. The tests include one control 
|              case which has a mode and 3 cases which do not; they are:
|              'all-unique vals', '2-way tie', and '3-way tie'.
+-----------------------------------------------------------------------
| Version Info:
|  > 09/28/20 - Original
*=====================================================================*/
import java.util.HashMap;

public class DemoArrayMode {
	
	// Using main to run some tests
	public static void main(String[] args) {
		
		// declare variables needed for testing, we'll re-use them
		int[] test; int expect, actual;

		// control test: expecting [2]
		test = new int[]{1,2,3,4,17,19,23,29,31,2};
		expect = 2;
		actual = arrayMode(test);	
		arrayModePrintBlurb(expect,actual);

		// all-unique test: expecting -1
		test = new int[]{1,2,3,4,5,6,7,8,9,10};
		expect = -1;
		actual = arrayMode(test);	
		arrayModePrintBlurb(expect,actual);

		// two-way tie test: expecting -1
		test = new int[]{1,2,2,2,3,5,5,5,6};
		expect = -1;
		actual = arrayMode(test);	
		arrayModePrintBlurb(expect,actual);		
		
		// three-way tie test: expecting -1
		test = new int[]{1,1,2,3,4,3,5,8,8,9};
		expect = -1;
		actual = arrayMode(test);	
		arrayModePrintBlurb(expect,actual);
			
	} // Ends Method main
	
	// Prints nice message comparing expected -vs- actual value
	public static void arrayModePrintBlurb(int exp, int act) {
		System.out.println("arrayMode test >>> Expect:"+String.format("%3d", exp)+" | Actual:"+String.format("%3d", act));
	} // Ends Method arrayModePrintBlurb
	
	// Fully functional [defined] arrayMode Method
	public static int arrayMode(int[] arr){
		
		// Instantiate/Initialize Hash Map
		HashMap<Integer, Integer> valueCounts = new HashMap<Integer, Integer>();
		
		// Populate Hash Map with [VALUE : COUNT] pairing
		for (int i = 0; i < arr.length; i++) {			
			int count = valueCounts.containsKey(arr[i]) ? valueCounts.get(arr[i]) : 0;
			valueCounts.put(arr[i], count + 1);		
		} // Ends For Loop
		
		// 'Keep Score' of largest Hash Map value and corresponding key
		int curModeKey = -1;
		int curModeVal = -1;
		
		// Used to identify whether or not there's [currently] a tie
		boolean tieFound = false;
		
		// Just a 'buffer' value (could declare in foreach, but #yolo)
		int val = 0; 
		
		// Iterate through Hash Map via its set of keys
		for (Integer key : valueCounts.keySet()) {
			
			// Get value corresponding to current key
			val = valueCounts.get(key);	
			
			// New largest -> store it and its key, reset tie
			if(val>curModeVal){
				curModeVal = val; 
				curModeKey = key;
				tieFound   = false;
			}
			
			// Equal to largest -> set tie to true
			else if(val==curModeVal){
				tieFound = true;
			}
				
		} // Ends Foreach Loop
		
		// Tie -> return -1 | Else -> return argmax
		return (tieFound) ? -1 : curModeKey;
		
	} // Ends Method arrayMode
	
} // Ends Class ArrayModeIsolate
