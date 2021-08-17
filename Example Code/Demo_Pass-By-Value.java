/*----------------------------------------------
|>>> Java 'Pass-By-Value' Comparison Demo
+-----------------------------------------------
| Description: Provides a simple but [hopefully] 
|              intuitive comparison to how Pass-
|              By-Value works for primitive data
|              types <vs> objects in Java.  
+---------------------------------------------*/
public class Main {
  public static void main(String[] args) {
  	// Initialize the Primitive and Object variables
  	int     myIntPrim = 5;
  	YoloInt myIntYolo = new YoloInt(5);
    
    // Print their values
    System.out.println("Before the calls...");
    System.out.println(" > myIntPrim: "+myIntPrim);
    System.out.println(" > myIntYolo: "+myIntYolo.val);    
  
  	// Call their respective <x>IntSq methods
    PrimIntSq(myIntPrim);
    YoloIntSq(myIntYolo);

	// Print their values [again]
	System.out.println("\nAfter the calls...");
    System.out.println(" > myIntPrim: "+myIntPrim);
    System.out.println(" > myIntYolo: "+myIntYolo.val);      
    
  } // Ends Function main
  
  public static void PrimIntSq(int i){
    i *= i;
  } // Ends Function PrimIntSq

  public static void YoloIntSq(YoloInt i){
    i.val *= i.val;
  } // Ends Function YoloIntSq

} // Ends Class Main

class YoloInt {
  int val = 5;
  public YoloInt(int v){
    this.val = v;
  } // Ends Constructor
} // Ends Class YoloInt