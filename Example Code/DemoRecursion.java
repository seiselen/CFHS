public class DemoRecursion {
	
	public static void main(String[] args) {

		int ex_sum = 5;	
		
		System.out.println(sumRec(ex_sum,1));
		System.out.println(sumIter(ex_sum));
				
		//int[] ex_binSchArr = {1,2,3,5,8,9,10,12,15,17,18};
		//int   ex_binSchVal = 2;
		
		//System.out.println(binSearchRec(ex_binSchArr,ex_binSchVal,0,ex_binSchArr.length));
		//System.out.println(binSearchIter(ex_binSchArr,ex_binSchVal));

	}
	
	public static int sumIter(int k) {
		// Init sum total to zero
		int sum = 0;
		
		// For i=0 to k (inclusive), increment sum by i
		for (int i = 0; i <= k; i++) {
			System.out.println("sum was ["+sum+"] | will now be ["+(sum+i)+"]");
						
			sum+=i;
			}
		
		// Return total sum		
		return sum;

	} // Ends Method sumIter

	
	// NOTE: returns (k)+(k-1)+(k-2)+...+(k-k)
	public static int sumRec(int k, int numTimesCalled) {
		
		System.out.println("k is now = "+k+" | this is call # "+numTimesCalled+"!");
		
		// Inductive Clause: return k + sum of recursion on k-1
	    if (k > 0) {
	    	System.out.println("now calling myself with value "+(k-1));
	    	return k + sumRec(k-1,numTimesCalled+=1);
	    } 
	      
	    // Base Case (Terminal Clause): k<=0 --> return zero
	    else {
	    	return 0;
	    }
	 
	} // Ends Method sumRec
	
	
    public static int binSearchRec(int[] a, int q, int lo, int hi) {
  	
    	// Base Case 1: Unsuccessful search -> not in array!
        if (hi < lo) {return -1;}
        
        // Get 'midpoint' of span [lo...hi]
        int midpt = (hi + lo) / 2;
        
        // Inductive Clause 1: Query < midpoint value --> recurse on lower 1/2!       
        if (a[midpt] > q) {return binSearchRec(a, q, lo, midpt-1);} 
          
        // Inductive Clause 2: Query > midpoint value --> recurse on upper 1/2!        
        else if (a[midpt] < q) {return binSearchRec(a, q, midpt+1, hi);}
        
        // Base Case 2: Successful Search! Return index of query value.
        return midpt;
        
    } // Ends Method binSearchRec
	
        
    public static int binSearchIter(int[] a, int q) {
        int hi = a.length - 1;    
        int lo = 0;
        
        // Loop Invariant 1: While search NOT unsuccessful
        while (hi >= lo) {
            
        	// Get 'midpoint' of span [lo...hi]
        	int midpt = (lo+hi)/2 ;
            
            // Midpoint value > query --> set new hi span to midpoint [exclusive]
            if (a[midpt] > q) {hi = midpt - 1;} 
            
            // Midpoint value < query --> set new lo span to midpoint [exclusive]
            else if (a[midpt] < q) {lo = midpt + 1;} 
            
            // "Loop Invariant 2": Successful Search! Return index of query value.
            else {return midpt;}
        }
        
        // Handle of Loop Invariant 1 --> return -1 implying unsuccessful search
        return -1;
        
    } // Ends Method binSearchIter

}
