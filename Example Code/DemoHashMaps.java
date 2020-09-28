/*======================================================================
| Project: BRIEFING ON HASH MAPS FOR IMPLEMENTATION IN FH-47XX HW-2/3
| Author:  Steven Eiselen, CFHS Computer Science
| Sources: https://www.w3schools.com/java/java_hashmap.asp
|          https://stackoverflow.com/questions/81346
| Version: 09/24/20 - Original
+-----------------------------------------------------------------------
| Description: Demonstrates a partial implementation of the 'arrayMode'
|              method from FH-47XX 2020-2021 HW-2; as well as its use of
|              the Java HashMap Data Structure. 
+-----------------------------------------------------------------------
| Briefing Follows >>>
| 
| A HashMap utilizes a "key-value" mapping. Long story short, this means
| that we can 'map' a some type of value to a unique key, such that if
| we provide the key, we can get its corresponding value. A good way to 
| understand this concept is with the notation demonstrated below:
|
|     [ <KEY> : <VALUE> ]
| 
| Where:
|  <KEY>   can be seen as an ID# that its data value[s] belong to
|  <VALUE> is the value that relates with its corresponding key
|  ':'     expresses that this is a KEY->VALUE mapping
|
| Let's see an example... Suppose we wish to create a HashMap which maps
| US States to their abbreviations. For example: "Arizona" would  map to 
| "AZ", "New York" to "NY", etc. We can show this relationship via the 
| above notation as follows: [ STATE NAME : STATE ABBREV ]. This would 
| encompass both a key and value of type <String>, though we can use any
| combination of datatypes as desired (provided they're objects, as we 
| need to use Wrapper classes for primitives such as ints!) Therefore, 
| we would create a HashMap of type <String,String> within Java.
|
| Onto our use of HashMap for the 'arrayMode(...)' method. Recall that
| our goal is to return the value which appears the most amount of times
| within the input int array. Since this would imply iterating through 
| the array and keeping a tally on which values are discovered alongside
| the # of times they appeared: we get our KEY->VALUE mapping naturally, 
| and express it as:  [ ARRAY VALUE : # OF TIMES IT APPEARS ]
|
| For our example of arr = {1,2,3,3,4,5,6,7,7,7,8,9,10}, we would expect
| the key of greatest value to be '7' because it appears 3 times in this
| array - more than any other value therein. Thus the KEY->VALUE mapping
| for 7 would be [7 : 3]; and it is also what is known as an 'argmax' or
| 'Argument of Maximum Value' for reasons which should be self-evident; 
|  as argument <-> key in this context. 
| 
| [Re]Introduction having been made, let's see how it's done in Java...
*=====================================================================*/

// Don't forget to import it!
import java.util.HashMap;

public class DemoHashMaps {
	
	public static void main(String[] args) {
			
		// Nice example of how you would do a simple HW-2/3 Test Case.
		int[] testArray  = {1,2,3,3,4,5,6,7,7,7,8,9,10};	
		int   testResult = arrMode(testArray);	
		System.out.println("arrMode test => Expected: 7 | Returned: "+testResult);
			
	} // Ends Method main

	
	/*----------------------------------------------------------------------
	|>>> Method arrMode 
	+-----------------------------------------------------------------------
	| Purpose: Given an array of integers, returns the mode i.e. most common
	|          value among its elements. Does not [yet] handle ties, but we
	|          suggest using a boolean to indicate if the current argmax and
	|          its value is a tie. If it is after iterating through the hash
	|          map: return -1. Else, return the argmax.
	| Inputs:  > int[] inArray: array of integer values
	| Outputs: > Most common value within array else first occurrence of the
	|            largest tie thereof (s.t. [1]-> all elements unique values)
	+---------------------------------------------------------------------*/
	public static int arrMode(int[] arr) {
		
		// Initialize the HashMap (for objects: this means declare and instantiate)	
		HashMap<Integer, Integer> valueCounts = new HashMap<Integer, Integer>();
		
		// Iterate through the input array...
		for (int i = 0; i < arr.length; i++) {
			
			// Hello Ternary Operator! Handles case of new xor existing entry
			int count = valueCounts.containsKey(arr[i]) ? valueCounts.get(arr[i]) : 0;
			
			// Then update entry given evaluation of the above ternary expression
			valueCounts.put(arr[i], count + 1);		

		} // Ends For Loop
		
		// Keep a record of both the max and argmax values.
		int curModeKey = -1; // aka 'argmax'
		int curModeVal = -1;
		
		// Being OCD here, as you can initialize it within the foreach loop no worries
		int val = 0; 
		
		// Here's a 'Foreach' loop BTW! Iterate on the keys of our hash map...
		for (Integer key : valueCounts.keySet()) {
			
			// Grab the value of the corresponding key
			val = valueCounts.get(key);
			
			// If it's the new largest, update accordingly
			if(val>curModeVal) {
				curModeVal = val;
				curModeKey = key;
			}
			
			// Un-comment line below to see [key:value] mapping foreach member of hash map
			// System.out.println("key: " + key + " value: " + val);	  
		}
		
		// And return argmax to the caller, we're done!
		return curModeKey;
		
	} // Ends Method ArrayMode

} // Ends Class HashMapsDemo
