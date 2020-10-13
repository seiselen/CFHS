/*======================================================================
| Project: FH-4710/4750 2020-2021 Example Code
| Author:  Steven Eiselen, UArizona/CFHS Computer Science
+-----------------------------------------------------------------------
| Description: Demonstrates a simple object class and the parts thereof
|              for a Vector3 i.e. 3D vector / coordinate. 
|
|              Highlights of this demo include >>>
|                - Multiple Constructors: To show how they work and how
|                  they could be practically/realistically used.
|                - Encapsulation: Use of private variables alongside
|                  public 'getter' and 'setter' methods to secure access
|                  to the state of a [Vector3] object instance.
|                - System.err text output and invalid input handling for
|                  methods and switches therein.
|              
+-----------------------------------------------------------------------
| Version Info:
|  > 09/29/20 - Original
*=====================================================================*/

/*----------------------------------------------------------------------
|>>> Class Vector3
+---------------------------------------------------------------------*/
public class Vector3 {
	
	private float x;
	private float y;
	private float z;
	
	// optional name for this Vector3
	private String tag;
	
	//------------------------------------------------------------------
	//>>> CONSTRUCTORS
	//------------------------------------------------------------------
	
	// This constructor has no parameters but does initialize tag with a
	// default value. Question: Why don't we need to initialize x, y, z?
	public Vector3(){
		tag = "unnamed";
	}
	
	
	// This constructor has parameters for x, y, z which are assigned 
	// accordingly, before tag is initialized with a default value.
	public Vector3(float _x, float _y, float _z){
		x = _x;
		y = _y;
		z = _z;
		tag = "unnamed";
	}
	
	
	// This constructor has parameters for x, y, z, and the tag, which 
	// are assigned accordingly.
	public Vector3(float _x, float _y, float _z, String _t){
		x   = _x;
		y   = _y;
		z   = _z;
		tag = _t;
	}	
	
	//------------------------------------------------------------------
	//>>> GETTERS
	//------------------------------------------------------------------	
	
	// Note that since we are only dealing with three coordinate values,
	// i.e. ('x'/'y'/'z'), we can get individual coordinate values by
	// passing in their ID as a char. We could define a 'getX', 'getY',
	// 'getZ' method; but why? Use the 'Power of Parameters' to define
	// only one method that could get each based on an input char!
	public float getByCoord(char c){
		switch(c) {
			case 'x': 
				return x;
				
			case 'y': 
				return y;
				
			case 'z': 
				return z;
				
			default:
				// Note that we're calling System.*err* (vs *out*). This
				// will cause the text to appear red in the console for
				// most IDE's; which is useful if you have got a lot of
				// text appearing on it. More importantly: you can set 
				// System.err output to go inside of a special text file
				// for such messages; whereas System.out goes to its own
				// text file (or the console WLOG).
				System.err.println("Invalid input! Returning 0.");
				return 0;
		}
		
		// Note that we don't need to return anything after the switch
		// statement. This is because the Java compiler 'sees' that our
		// switch statement has a 'default' case which returns a float!
		
	} // Ends Method getOneCoord
	
	
	// Pretty straightforward: return a float array of the coord values
	public float[] getAsArray() {
		
		return new float[]{x,y,z};
		
	} // Ends Method getAsArray
	
	
	// Note that we're returning a NEW string of the same chars as tag,
	// not tag itself. What if we did return the value of tag? what is 
	// being returned, and what side effects are possible?
	public String getTag() {	
		return new String(tag);		
	} // Ends Method getTag
	
	
	// Prints a simple representation of a 3D coordinate i.e. "(x,y,z)".
	// Note that we are 'overriding' this method from that of Java's 
	// Object class, which is the 'top-most' class that all defined 
	// classes implicitly (yet nonetheless) inherit from.
 	@Override
	public String toString() {
		return "("+x+","+y+","+z+")"; // returns "(x,y,z)"
	}
	
	
	//------------------------------------------------------------------
	//>>> SETTERS
	//------------------------------------------------------------------	
	public void setByCoord(char c, float v){
		switch(c) {
			case 'x': x=v; break;
			case 'y': y=v; break;	
			case 'z': z=v; break;
			
			// Note how for the 
			default: System.err.println("Invalid input!");

		}
		
	} // Ends Method getOneCoord
	
	
	public void setAsArray(float[] newVals) {		
		x = newVals[0];
		y = newVals[0];
		z = newVals[0];		
	} // Ends Method getAsArray
	
	
	public void getTag(String newTag) {
		tag = new String(newTag);
	} // Ends Method getTag	
	
} // Ends Class Vector3
