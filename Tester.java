/*----------------------------------------------------------------------
| Class Tester
+-----------------------------------------------------------------------
| Author:  Steven Eiselen, UArizona / CFHS Computer Science
| Project: FH-4710/4750 FA-20 Homework 2/3
+-----------------------------------------------------------------------
| Description: Testing Program for the FH-4710/4750 FA-20 Homework 2 and
|              3 coding projects. The methods of this class allow a user
|              (i.e. student) to call methods that will test each of the
|              methods required for definition to determine if they were 
|              implemented correctly according to the HW spec. Note that
|              the methods 'mapToRange'/'arrayAvg'/'arrayTForm' are not
|              supported, as they will be visually inspected instead.
+-----------------------------------------------------------------------
| To Use:      1) Put this java file in your HW 2/3 project folder (i.e.
|                 where your HW 2/3 solution code is located.
|
|              2) You may need to rename the class that this code calls
|                 to run HW 2/3 tests to that of your HW 2/3 class. That
|                 is: these tests currently call methods in the form:
|                   "hw2.isEven(...)", etc.
|                 You will need to rename this to a form such as:
|                   "es900100hw2.isEven(...)", etc.
|
|                 To do this:
|
|                 A) Find a place where the hw2 class is being invoked
|                    in a method call (i.e. "hw2.isEven(samples[i])" 
|                    on the 8th line of the _isEven() method), then
|                 B) Right click over the "hw2" part of it, and select
|                    refactor->rename. This will allow you to type in
|                    a new name which will replace all other times it
|                    it exists in the Tester.java code.
|                 C) Enter the name of your HW 2/3 solution code, i.e.
|                    my version could be 'es900100hw2', then click the
|                    enter or return key to set the change. Now, every
|                    'hw2' should be 'es900100hw2', as for the tester 
|                    app to now 'see' and call your code.
|
|              3) Run the application. You can comment in/out the method
|                 calls below to run/not-run their respective tests.
+---------------------------------------------------------------------*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Tester {
	public static void main(String[] args) {
		Tester test = new Tester();
			
		//==============================================================
		//>>> HW-2 Tester Methods
		//==============================================================		
		
		//>>> Test All Methods Of All Parts
		//test._HW2();
		
		//>>> Test All Methods Of One Part
		//test._1A();		
		//test._1B();		
		//test._2A();		
		//test._2B();		
		
		//>>> Part 1A Individual Method Tests
		//test._isEven();
		//test._isOdd();
		//test._getEvens();	
		//test._getOdds();
		
		//>>> Part 1B Individual Method Tests
		//test._time24to12();	
		//test._time12to24();
		//test._isMealtime();
		
		//>>> Part 2A Individual Method Tests
		//test._far2cel_cel2far();
		//test._isFreezing();
		//test._isBoiling();
		
		//>>> Part 2B Individual Method Tests
		//test._coord2ToCell();		

		
		//==============================================================
		//>>> HW-3 Tester Methods
		//==============================================================
		
		//>>> Part 3A Individual Method Tests
		// TODO: _binToHex();
		// TODO: _hexToBin();
		// TODO: _decToHex();
		// TODO: _decToBin();
		// TODO: _binToDec();
		// TODO: _hexToDec();

	
		//>>> Part 3B Individual Method Tests		
		// TODO: _addBin();
		// TODO: _negateBin();
		// TODO: _subBin();

		
		//>>> Part 4A Individual Method Tests
		//test._arrayMin();
		//test._arrayMax();
		//test._arrayRange();
		//test._arrayMode();
		
		
	} // Ends Main Method [Tester]
		
	//##################################################################
	//>>> TEST CASE INNER CLASS
	//##################################################################
	class STestCase{
		public Object testCase;
		public Object testParm;
		public Object expected;
		
		public STestCase(int val, boolean exp) {
			this.testCase = new Integer(val);
			this.expected = new Boolean(exp);
		}
		
		public STestCase(int val, float exp) {
			this.testCase = new Integer(val); 
			this.expected = new Float(exp);		
		}
		
		public STestCase(int val, String exp) {
			this.testCase = new Integer(val);
			this.expected = exp;		
		}

		public STestCase(int val, int[] exp) {
			this.testCase = new Integer(val);
			this.expected = exp;		
		}	

		public STestCase(int[] val, int exp) {
			this.testCase = val;
			this.expected = new Integer(exp);		
		}
		
		public STestCase(String val, String exp) {
			this.testCase = val;
			this.expected = exp;		
		}	
		
		public STestCase(float val, char parm, boolean exp) {
			this.testCase = new Float(val);
			this.testParm = new Character(parm);
			this.expected = new Boolean(exp);
		}
		
		public STestCase(float[] val, int[] exp, int cSize) {
			this.testCase = val;
			this.expected = exp;
			this.testParm = new Integer(cSize);
		}	
		
	} // Ends Class TestCase

	
	//##################################################################
	//>>> Data Structure Declarations
	//##################################################################		
	public Random random;
	private int nPassed;
	
	private int[] samples;
	
	private int nTests    = 50;
	private int nTestsArr = 10;
	
	//##################################################################
	//>>> Constructors
	//##################################################################	
	public Tester() {random = new Random();}
	public Tester(int seed) {random = new Random(seed);}
	
	//##################################################################
	//>>> Bulk Test Methods
	//##################################################################		
	
	//>>> FOR HW-2
	public void _HW2(){_1A();_1B();_2A();_2B();}
	
	public void _1A(){_isEven();_isOdd();_getEvens();_getOdds();}	
	public void _1B(){_time24to12();_time12to24();_isMealtime();}
	public void _2A(){_far2cel_cel2far();_isFreezing();_isBoiling();}
	public void _2B(){_coord2ToCell();}
	
	
	//>>> FOR HW-3
	
	public void _4A(){_arrayMin();_arrayMax();_arrayRange();_arrayMode();}
	
	
	//##################################################################
	//>>> Part 1-A Tests
	//##################################################################	
	public void _isEven() {		
		printIntroBlurb("isEven");
		
		samples = new int[nTests];
		for (int i = 0; i < nTests; i++) {samples[i] = i*2;}		
				
		nPassed = 0;		
		for (int i = 0; i < nTests; i++) {	
			if(hw2.isEven(samples[i])==true) {nPassed++;}	
			else {printFailInfo(""+samples[i],""+true,""+false);}
			if(hw2.isEven(samples[i]+1)==false) {nPassed++;}	
			else {printFailInfo(""+(samples[i]+1),""+false,""+true);}		
		}
		
		reportScore(nPassed,nTests*2);	
	} // Ends Method _isEven
	

	public void _isOdd() {		
		printIntroBlurb("isOdd");
		
		samples = new int[nTests];
		for (int i = 0; i < nTests; i++) {samples[i] = i*2;}		
			
		nPassed = 0;		
		for (int i = 0; i < nTests; i++) {	
			if(hw2.isOdd(samples[i]+1)==true) {nPassed++;}	
			else {printFailInfo(""+(samples[i]+1),""+true,""+false);}
			if(hw2.isOdd(samples[i])==false) {nPassed++;}	
			else {printFailInfo(""+samples[i],""+false,""+true);}		
		}
		
		reportScore(nPassed,nTests*2);	
	} // Ends Method _isOdd	
	
	
	public void _getEvens() {
		printIntroBlurb("getEvens");
		nPassed = 0;
		int[] expect;
		int[] result;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();
		
		tests.add(new STestCase(1, new int[]{0}));
		tests.add(new STestCase(3, new int[]{0,2}));
		tests.add(new STestCase(4, new int[]{0,2,4}));
		tests.add(new STestCase(10, new int[]{0,2,4,6,8,10}));
		tests.add(new STestCase(19, new int[]{0,2,4,6,8,10,12,14,16,18}));
			
		for (STestCase t : tests) {
			result = hw2.getEvens((Integer)t.testCase);
			expect = (int[])t.expected;		
			if(Arrays.equals(result,expect)) { nPassed++;}
			else {printFailInfo(""+(Integer)t.testCase,intArrString(expect),intArrString(result));}		
		}
		
		reportScore(nPassed,tests.size());
	} // Ends Method _getEvens	
	
		
	public void _getOdds() {
		printIntroBlurb("getOdds");
		nPassed = 0;
		int[] expect;
		int[] result;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();
		
		tests.add(new STestCase(1, new int[]{1}));
		tests.add(new STestCase(4, new int[]{1,3}));
		tests.add(new STestCase(5, new int[]{1,3,5}));		
		tests.add(new STestCase(11, new int[]{1,3,5,7,9,11}));
		tests.add(new STestCase(20, new int[]{1,3,5,7,9,11,13,15,17,19}));
			
		for (STestCase t : tests) {
			result = hw2.getOdds((Integer)t.testCase);
			expect = (int[])t.expected;		
			if(Arrays.equals(result,expect)) { nPassed++;}
			else {printFailInfo(""+(Integer)t.testCase,intArrString(expect),intArrString(result));}		
		}
		
		reportScore(nPassed,tests.size());
	} // Ends Method _getEvens		
	
	
	//##################################################################
	//>>> Part 1-B Tests
	//##################################################################	
	public void _time24to12() {
		printIntroBlurb("time24to12");
		nPassed = 0;
		
		String expect; String result;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();
		
		tests.add(new STestCase("00:00", "12:00 AM"));
		tests.add(new STestCase("12:00", "12:00 PM"));
		tests.add(new STestCase("13:01", "01:01 PM"));
		tests.add(new STestCase("01:01", "01:01 AM"));
		tests.add(new STestCase("10:10", "10:10 AM"));		
		tests.add(new STestCase("06:30", "06:30 AM"));
		tests.add(new STestCase("18:30", "06:30 PM"));
		tests.add(new STestCase("23:59", "11:59 PM"));
		tests.add(new STestCase("16:45", "04:45 PM"));
		tests.add(new STestCase("04:45", "04:45 AM"));	
		
		for (STestCase t : tests) {
			result = hw2.time24to12((String)t.testCase);
			expect = (String)t.expected;		
			if(result.equals(expect)) { nPassed++;}
			else {printFailInfo((String)t.testCase,expect,result);}		
		}
		
		reportScore(nPassed,tests.size());		
	} // Ends Method _time24to12		
	
	
	public void _time12to24() {
		printIntroBlurb("time12to24");
		nPassed = 0;
		
		String expect; String result;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();
		
		tests.add(new STestCase("12:00 AM","00:00"));
		tests.add(new STestCase("12:00 PM","12:00"));
		tests.add(new STestCase("01:01 PM","13:01"));
		tests.add(new STestCase("01:01 AM","01:01"));
		tests.add(new STestCase("10:10 AM","10:10"));		
		tests.add(new STestCase("06:30 AM","06:30"));
		tests.add(new STestCase("06:30 PM","18:30"));
		tests.add(new STestCase("11:59 PM","23:59"));
		tests.add(new STestCase("04:45 PM","16:45"));
		tests.add(new STestCase("04:45 AM","04:45"));
		
		for (STestCase t : tests) {
			result = hw2.time12to24((String)t.testCase);
			expect = (String)t.expected;		
			if(result.equals(expect)) { nPassed++;}
			else {printFailInfo((String)t.testCase,expect,result);}		
		}
		
		reportScore(nPassed,tests.size());	
	} // Ends Method _time12to24	
	

	public void _isMealtime() {
		printIntroBlurb("isMealtime");
		nPassed = 0;
		
		String expect; String result;
		
		String[] outs = {"Breakfast!","Lunch!","Dinner!","Not Mealtime..."};
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();
		
		tests.add(new STestCase("07:59 AM", outs[3]));
		tests.add(new STestCase("08:00 AM", outs[0]));
		tests.add(new STestCase("08:30 AM", outs[0]));
		tests.add(new STestCase("08:59 AM", outs[0]));
		tests.add(new STestCase("09:01 AM", outs[3]));
		tests.add(new STestCase("11:29 AM", outs[3]));
		tests.add(new STestCase("11:30 AM", outs[1]));
		tests.add(new STestCase("12:00 PM", outs[1]));
		tests.add(new STestCase("12:30 PM", outs[1]));
		tests.add(new STestCase("12:31 PM", outs[3]));
		tests.add(new STestCase("04:29 PM", outs[3]));
		tests.add(new STestCase("04:30 PM", outs[2]));
		tests.add(new STestCase("05:30 PM", outs[2]));
		tests.add(new STestCase("06:30 PM", outs[2]));
		tests.add(new STestCase("06:31 PM", outs[3]));
	
		for (STestCase t : tests) {
			result = hw2.isMealtime((String)t.testCase);
			expect = (String)t.expected;		
			if(result.equals(expect)) { nPassed++;}
			else {printFailInfo((String)t.testCase,expect,result);}		
		}
		
		reportScore(nPassed,tests.size());
	} // Ends Method _isMealtime	
	

	//##################################################################
	//>>> Part 2-A Tests
	//##################################################################
	public void _far2cel_cel2far() {	
		printIntroBlurb("farToCel> and <celToFar");
		
		samples = new int[nTests];
		for (int i = 0; i < nTests; i++) {samples[i] = random.nextInt(200)-100;}		
		
		nPassed = 0;
		for (int i = 0; i < nTests; i++) {		
			if(Math.abs(hw2.celToFar(hw2.farToCel(samples[i]))-samples[i])<=0.1f) {nPassed++;}
		}
		
		reportScore(nPassed,nTests);
	} // Ends Method _far2cel_cel2far	
	
	
	public void _isFreezing() {
		printIntroBlurb("isFreezing");
		nPassed = 0;
		
		boolean expect; boolean result; char parm;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();

		tests.add(new STestCase(31,'f',true));
		tests.add(new STestCase(32,'f',true));
		tests.add(new STestCase(33,'f',false));
		tests.add(new STestCase(31,'c',false));
		tests.add(new STestCase(32,'c',false));
		tests.add(new STestCase(33,'c',false));
		
		tests.add(new STestCase(-1,'f',true));
		tests.add(new STestCase(0,'f',true));
		tests.add(new STestCase(1,'f',true));
		tests.add(new STestCase(-1,'c',true));
		tests.add(new STestCase(0,'c',true));
		tests.add(new STestCase(1,'c',false));
		
		tests.add(new STestCase(87,'f',false));
		tests.add(new STestCase(87,'c',false));

		tests.add(new STestCase(16,'f',true));
		tests.add(new STestCase(16,'c',false));
		
		tests.add(new STestCase(-16,'f',true));
		tests.add(new STestCase(-16,'c',true));		
		
		tests.add(new STestCase(212,'f',false));
		tests.add(new STestCase(100,'c',false));		
				
		for (STestCase t : tests) {
			result = hw2.isFreezing((Float)t.testCase,(Character)t.testParm);
			expect = (Boolean)t.expected;
			parm   = (Character)t.testParm;
				
			if(result==expect) { nPassed++;}
			else {printFailInfo(""+t.testCase,""+parm,""+expect,""+result);}		
		}
		
		reportScore(nPassed,tests.size());		
	} // Ends Method _isFreezing	
	
	
	public void _isBoiling() {
		printIntroBlurb("isBoiling");
		nPassed = 0;
		
		boolean expect; boolean result; char parm;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();

		tests.add(new STestCase(211,'f',false));
		tests.add(new STestCase(212,'f',true));
		tests.add(new STestCase(213,'f',true));
		tests.add(new STestCase(211,'c',true));
		tests.add(new STestCase(212,'c',true));
		tests.add(new STestCase(213,'c',true));
		
		tests.add(new STestCase(99,'f',false));
		tests.add(new STestCase(100,'f',false));
		tests.add(new STestCase(101,'f',false));
		tests.add(new STestCase(99,'c',false));
		tests.add(new STestCase(100,'c',true));
		tests.add(new STestCase(101,'c',true));
		
		tests.add(new STestCase(87,'f',false));
		tests.add(new STestCase(87,'c',false));

		tests.add(new STestCase(150,'f',false));
		tests.add(new STestCase(150,'c',true));
		
		tests.add(new STestCase(32,'f',false));
		tests.add(new STestCase(32,'c',false));		
		
		tests.add(new STestCase(0,'f',false));
		tests.add(new STestCase(0,'c',false));		
				
		for (STestCase t : tests) {
			result = hw2.isBoiling((Float)t.testCase,(Character)t.testParm);
			expect = (Boolean)t.expected;
			parm   = (Character)t.testParm;
				
			if(result==expect) { nPassed++;}
			else {printFailInfo(""+t.testCase,""+parm,""+expect,""+result);}		
		}
		
		reportScore(nPassed,tests.size());		
	} // Ends Method _isBoiling		
	
	
	//##################################################################
	//>>> Part 2-B Tests
	//##################################################################		
	public void _coord2ToCell() {
		printIntroBlurb("coord2ToCell");
		nPassed = 0;
		
		int[] expect; int[] result; float[] inputs; int parm;
		
		ArrayList<STestCase> tests = new ArrayList<STestCase>();

		tests.add(new STestCase(new float[]{516.631f,480.520f},new int[]{4,5},100));	
		tests.add(new STestCase(new float[]{0f,0f},new int[]{0,0},100));
		tests.add(new STestCase(new float[]{901.36f,449.63f},new int[]{7,14},64));
		tests.add(new STestCase(new float[]{901.36f,449.63f},new int[]{4,9},100));
		tests.add(new STestCase(new float[]{121.03f,791.33f},new int[]{12,1},64));
		tests.add(new STestCase(new float[]{121.03f,791.33f},new int[]{7,1},100));
		tests.add(new STestCase(new float[]{414.51f,752.88f},new int[]{11,6},64));
		tests.add(new STestCase(new float[]{414.51f,752.88f},new int[]{7,4},100));
		tests.add(new STestCase(new float[]{845.54f,872.65f},new int[]{13,13},64));
		tests.add(new STestCase(new float[]{845.54f,872.65f},new int[]{8,8},100));
		tests.add(new STestCase(new float[]{166.01f,903.96f},new int[]{14,2},64));
		tests.add(new STestCase(new float[]{166.01f,903.96f},new int[]{9,1},100));
		tests.add(new STestCase(new float[]{539.79f,828.84f},new int[]{12,8},64));
		tests.add(new STestCase(new float[]{539.79f,828.84f},new int[]{8,5},100));
		tests.add(new STestCase(new float[]{835.97f,789.21f},new int[]{12,13},64));
		tests.add(new STestCase(new float[]{835.97f,789.21f},new int[]{7,8},100));
		tests.add(new STestCase(new float[]{838.31f,671.36f},new int[]{10,13},64));
		tests.add(new STestCase(new float[]{838.31f,671.36f},new int[]{6,8},100));
		tests.add(new STestCase(new float[]{657.99f,294.73f},new int[]{4,10},64));
		tests.add(new STestCase(new float[]{657.99f,294.73f},new int[]{2,6},100));
		tests.add(new STestCase(new float[]{116.10f,839.74f},new int[]{13,1},64));
		tests.add(new STestCase(new float[]{116.10f,839.74f},new int[]{8,1},100));
		tests.add(new STestCase(new float[]{172.94f,17.99f},new int[]{0,2},64));
		tests.add(new STestCase(new float[]{172.94f,17.99f},new int[]{0,1},100));
		tests.add(new STestCase(new float[]{924.07f,750.56f},new int[]{11,14},64));
		tests.add(new STestCase(new float[]{924.07f,750.56f},new int[]{7,9},100));
		tests.add(new STestCase(new float[]{28.83f,353.28f},new int[]{5,0},64));
		tests.add(new STestCase(new float[]{28.83f,353.28f},new int[]{3,0},100));
		tests.add(new STestCase(new float[]{759.11f,239.21f},new int[]{3,11},64));
		tests.add(new STestCase(new float[]{759.11f,239.21f},new int[]{2,7},100));
		tests.add(new STestCase(new float[]{388.49f,468.68f},new int[]{7,6},64));
		tests.add(new STestCase(new float[]{388.49f,468.68f},new int[]{4,3},100));
		tests.add(new STestCase(new float[]{636.54f,802.01f},new int[]{12,9},64));
		tests.add(new STestCase(new float[]{636.54f,802.01f},new int[]{8,6},100));
		tests.add(new STestCase(new float[]{947.93f,723.55f},new int[]{11,14},64));
		tests.add(new STestCase(new float[]{947.93f,723.55f},new int[]{7,9},100));
		tests.add(new STestCase(new float[]{565.99f,650.46f},new int[]{10,8},64));
		tests.add(new STestCase(new float[]{565.99f,650.46f},new int[]{6,5},100));
		tests.add(new STestCase(new float[]{283.55f,126.96f},new int[]{1,4},64));
		tests.add(new STestCase(new float[]{283.55f,126.96f},new int[]{1,2},100));
		tests.add(new STestCase(new float[]{394.37f,908.08f},new int[]{14,6},64));
		tests.add(new STestCase(new float[]{394.37f,908.08f},new int[]{9,3},100));
		tests.add(new STestCase(new float[]{571.90f,306.01f},new int[]{4,8},64));
		tests.add(new STestCase(new float[]{571.90f,306.01f},new int[]{3,5},100));
		tests.add(new STestCase(new float[]{37.12f,85.79f},new int[]{1,0},64));
		tests.add(new STestCase(new float[]{37.12f,85.79f},new int[]{0,0},100));
		tests.add(new STestCase(new float[]{69.71f,452.27f},new int[]{7,1},64));
		tests.add(new STestCase(new float[]{69.71f,452.27f},new int[]{4,0},100));
		tests.add(new STestCase(new float[]{541.10f,681.14f},new int[]{10,8},64));
		tests.add(new STestCase(new float[]{541.10f,681.14f},new int[]{6,5},100));
			
		for (STestCase t : tests) {		
			inputs = (float[])(t.testCase);
			parm   = (Integer)t.testParm;
						
			result = hw2.coordToCell(inputs[0],inputs[1],parm);
			expect = (int[])t.expected;
					
			if(Arrays.equals(result, expect)) { nPassed++;}
			else {printFailInfo(""+inputs[0]+", "+inputs[1]+", "+parm,intArrString(expect),intArrString(result));}		
		}
		
		reportScore(nPassed,tests.size());	
	} // Ends Method _coord2ToCell	
	
	
	

	
	
	
	
	
	//##################################################################
	//>>> Part 3 (SUBPARTS 'A' AND 'B') Tests
	//##################################################################		
	
	public static void test_subBin(int nTests) {
		short pDec  = 516;
		short qDec  = 480;
		short dDec  = (short)(pDec-qDec);
		
		char[] pBin = hw2.decToBin(pDec);
		char[] qBin = hw2.decToBin(qDec);		
		char[] dBin = hw2.subBin(pBin, qBin);
		
		int sBinAsDec = hw2.binToDec(dBin);				
		System.out.println("Subtracted "+qDec+" from "+pDec+". Exp: "+dDec+" | Got: "+sBinAsDec+" as char[16] -> "+char16AsBinString(dBin));
	}	
	
	public static void test_addBin(int nTests) {		
		short pDec  = 516;
		short qDec  = 631;
		short sDec  = (short)(pDec+qDec);
		
		char[] pBin = hw2.decToBin(pDec);
		char[] qBin = hw2.decToBin(qDec);
		char[] sBin = hw2.addBin(pBin, qBin);
				
		int sBinAsDec = hw2.binToDec(sBin);
		System.out.println("Added "+pDec+" to "+qDec+". Exp: "+sDec+" | Got: "+sBinAsDec+" as char[16] -> "+char16AsBinString(sBin));
	}
	
	public static void test_dec2bin_bin2dec(int nTests) {	
		// Demonstrates a single test
		short tVal = 7;
		char [] testDecToBin = hw2.decToBin(tVal);	
		
		System.out.println(char16AsBinString(testDecToBin));

		short testBinToDec = hw2.binToDec(testDecToBin);	
		System.out.println(testBinToDec);
	}
	
	public static void test_dec2hex_hex2dec(int nTests) {
		// dec2Hex
		short  valIn = 5281;
		char[] hexOut = hw2.decToHex(valIn);
		printArray(hexOut);
		
		// hex2dec
		char[] h2d_in = {'1','4','A','1'};		
		int h2d_out = hw2.hexToDec(h2d_in);
		System.out.println(h2d_out);			
	}	
	
	public static void test_hex2bin_bin2hex(int nTests) {	
		// hex2bin
	 	char[] hexIn = {'1','4','A','1'};		
		char[] binOut = hw2.hexToBin(hexIn);
		printArray(binOut);		
	}	
	
	public static void doBinToHexTest() {
		// 1110 0010 0100 0000 = E240 = 57,920
		char [] test = {'1','1','1','0', '0','0','1','0', '0','1','0','0' ,'0','0','0','0'};
		
		// expecting char[4] of hex chars , specifically 'E','2','4','0'
		char[] result = hw2.binToHex(test);
		
		// print elements of char[4] one by one
		System.out.print("Expecting E240, got ");
		for (int i = 0; i < result.length; i++) {System.out.print(result[i]);}
		
		System.out.println();
	}	
	
	
	//##################################################################
	//>>> Part 4-A Tests
	//##################################################################
	
	public void _arrayMin(){
		printIntroBlurb("arrayMin");
		nPassed = 0; int expect; int result;
		
		int[] arr = new int[nTests];	
		for (int i = 0; i < nTestsArr; i++) {			
			for (int j = 0; j < arr.length; j++) {arr[j] = random.nextInt(800)-400;}	
			result = hw2.arrayMin(arr);		
			Arrays.sort(arr);	
			expect = arr[0];
				
			if(result==expect) {nPassed++;}
			else {printFailInfo(intArrString(arr), ""+expect, ""+result);}	
		}
		reportScore(nPassed,nTestsArr);			
	} // Ends Method _arrayMin	
	
	public void _arrayMax(){
		printIntroBlurb("arrayMax");
		nPassed = 0; int expect; int result;
		
		int[] arr = new int[nTests];	
		for (int i = 0; i < nTestsArr; i++) {			
			for (int j = 0; j < arr.length; j++) {arr[j] = random.nextInt(800)-400;}	
			result = hw2.arrayMax(arr);		
			Arrays.sort(arr);	
			expect = arr[nTests-1];
				
			if(result==expect) {nPassed++;}
			else {printFailInfo(intArrString(arr), ""+expect, ""+result);}	
		}
		reportScore(nPassed,nTestsArr);			
	} // Ends Method _arrayMax		

	public void _arrayRange(){
		printIntroBlurb("arrayRange");
		nPassed = 0; int expect; int result;
		
		int[] arr = new int[nTests];	
		for (int i = 0; i < nTestsArr; i++) {			
			for (int j = 0; j < arr.length; j++) {arr[j] = random.nextInt(800)-400;}
						
			result = hw2.arrayRange(arr);		
			Arrays.sort(arr);	
			expect = arr[nTests-1]-arr[0];
				
			if(result==expect) {nPassed++;}
			else {printFailInfo(intArrString(arr), ""+expect, ""+result);}	
		}
		reportScore(nPassed,nTestsArr);			
	} // Ends Method _arrayRange	
				
	public void _arrayMode() {
		printIntroBlurb("arrayMode");
		nPassed = 0;
		
		int expect; int result;
				
		ArrayList<STestCase> tests = new ArrayList<STestCase>();
		
		// Controls
		tests.add(new STestCase(new int[]{9001},9001));
		tests.add(new STestCase(new int[]{0,0,1,2,3,4,5,10,9,8,7,6},0));
		tests.add(new STestCase(new int[]{1,2,3,4,17,19,23,29,31,2},2));		
		tests.add(new STestCase(new int[]{516,631,520,480,212,718,520},520));
		
		// All-Unique
		tests.add(new STestCase(new int[]{1,2,3,4,5,6,7,8,9,10},-1));
		tests.add(new STestCase(new int[]{516,631,520,480,212,718},-1));

		// 2-Way Tie
		tests.add(new STestCase(new int[]{1,2,2,2,3,5,5,5,6},-1));
		tests.add(new STestCase(new int[]{2,1,3,5,7,6,9,11,13,2,15,17,19,6,21},-1));
		
		// 3-Way Tie
		tests.add(new STestCase(new int[]{1,1,2,3,4,3,5,8,8,9},-1));
		tests.add(new STestCase(new int[]{1,1,1,2,2,2,5,5,5},-1));
			
		for (STestCase t : tests) {
			result = hw2.arrayMode((int[])t.testCase);
			expect = (int)t.expected;
				
			if(result==expect) { nPassed++;}
			else {printFailInfo(""+t.testCase,""+expect,""+result);}		
		}		
		
		reportScore(nPassed,tests.size());		
	} // Ends Method _arrayMode
	
	
	
	
	//##################################################################
	//>>> PRINT / GET-STRING / MISC. UTILS
	//##################################################################
	
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
			for (int i = 0; i < arr.length; i++) {
				arrAsString += arr[i];
				if(i<arr.length-1) {arrAsString+=", ";}
			}	
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
	
	
	
	private static void printIntroBlurb(String testName) {
		System.out.println("Running Tests On Method: <"+testName+">");		
	}
	
	private static void printFailInfo(String in, String exp, String got) {
		String blurb = "Test Case Failed >>> ";
		blurb += "\n  Input:     "+in;
		blurb += "\n  Expected:  "+exp;
		blurb += "\n  Returned:  "+got;
		System.err.println(blurb);
	}
	
	private static void printFailInfo(String inV, String inP, String exp, String got) {
		String blurb = "Test Case Failed >>> ";
		blurb += "\n  Input:     "+inV;
		blurb += "\n  Parm Val:  "+inP;		
		blurb += "\n  Expected:  "+exp;
		blurb += "\n  Returned:  "+got;
		System.err.println(blurb);
	}
	
	// Utils for formatting/printing test results
	public static void reportScore(int p, int n) {System.out.println(" > Results: "+ratPassed(n,p)+" Passed ("+pctPassed(n,p)+")");}
	public static String ratPassed(int n, int p) {return ""+p+"/"+n;}	
	public static String pctPassed(int n, int p) {return String.format("%.2f", (((float)p/(float)n)*100))+"%";}

	
	
	

} // Ends Class Tester
