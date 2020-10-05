
public class SUtils {
	
	// Prints 'raw' int[16] representation of binary #
	public static void printBinary(int[] arr){
		String ret = "";
		for(int i=0; i<arr.length; i++){
			if(i==0) {ret+="[";}	
			if(i>0 && i%4==0){ret+='-';}
			ret+=arr[i];
			if(i==arr.length-1){ret+="]";}
		}
		System.out.println(ret);
	}
	
	// Produces formatted version of char[16] as binary string
	public static String char16AsBinString(char[] arr){
		String ret = "";
		for(int i=0; i<arr.length; i++){
			if(i==0) {ret+="[";}	
			if(i>0 && i%4==0){ret+=' ';}
			ret = ret + arr[i];
			if(i==arr.length-1){ret+="]";}
		}
		return ret;	
	}
	
	
	
	
	// Gets 1D int array as string
	public static String intArrString(int[] arr) {
		String arrAsString = "[";	
		for (int i = 0; i < arr.length; i++) {arrAsString += arr[i];if(i<arr.length-1) {arrAsString+=", ";}}	
		return arrAsString+"]";		
	}

	// Gets 1D int array as string
	public static String floatArrString(float[] arr) {
		String arrAsString = "[";	
		for (int i = 0; i < arr.length; i++) {arrAsString += arr[i];if(i<arr.length-1) {arrAsString+=", ";}}	
		return arrAsString+"]";		
	}	
	
	
	// Prints 1D int array
	public static void printArray(int[] arr) {
		System.out.println(intArrString(arr));	
	}
	
	
	
	// Prints 1D char array
	public static void printArray(char[] arr) {
		String arrAsString = "";	
		for (int i = 0; i < arr.length; i++) {arrAsString += arr[i]; if(i<arr.length-1) {arrAsString+=", ";}	}	
		System.out.println(arrAsString);		
	}
	
	// Prints 1D float array	
	public static void printArray(float[] arr){
		String arrAsString = "";	
		for (int i = 0; i < arr.length; i++) {arrAsString += arr[i]; if(i<arr.length-1) {arrAsString+=", ";}}	
		System.out.println(arrAsString);		
	}	

}
