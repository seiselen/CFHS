/*======================================================================
| ID:      FH-4710 FA-21 HW-2 CODE SKELETON ("LACK-OF-REPL CONTINGENCY")
| Author:  Steven Eiselen, UArizona/CFHS Computer Science 
+-----------------------------------------------------------------------
| Description: Code Skeleton for FH-4710 FA-21 HW-2, for use until and
|              after Repl is up-and-running. See comment boxes for the
|              'HW2LauncherA' and 'HW2' classes for more info.
*=====================================================================*/

/*----------------------------------------------------------------------
|>>> Class HW2LauncherA (A=> 4710 Version)
+-----------------------------------------------------------------------
| Purpose: Use this class to run/test/debug methods from the HW2 class 
|          as you implement them. I've provided two example methods in
|          the HW2 class skeleton alongside some example ways to test
|          each of them via HW2Launcher's main method. I also provided
|          an example helper method that you may want to use, called
|          'printStringArray' (3 guesses what it does?) You could also
|          define additional helpers as need-be to test your code, and
|          we may share a few throughout the week. Lastly, DO NOT SUBMIT
|          THIS CLASS NOR ANY [TEST] CODE WITHIN IT! All we want is your
|          solution code to the methods within the HW2 class (discussed
|          below, see its respective comment box for more info).
+---------------------------------------------------------------------*/
public class HW2LauncherA {
  public static void main(String[] args) {
    
    // Testing repeatWordXTimes...
    System.out.println(HW2.repeatWordXTimes("ha",5));      // should be "ha ha ha ha ha"
    System.out.println(HW2.repeatWordXTimes("Sunday!",3)); // should be "Sunday! Sunday! Sunday!"
    System.out.println(HW2.repeatWordXTimes(" ",4));       // should be "        "
    
    // Testing isMultipleOf...    
    System.out.println(HW2.isMultipleOf(25, 5)); // should be true
    System.out.println(HW2.isMultipleOf(36, 9)); // should be true
    System.out.println(HW2.isMultipleOf(15, 8)); // should be false
    System.out.println(HW2.isMultipleOf(3, 72)); // should be false

  } // Ends Method main

  /*--------------------------------------------------------------------
  |>>> Function printStringArray 
  +---------------------------------------------------------------------
  | Purpose: Prints the elements of a String array, 'Nuff Said.
  +-------------------------------------------------------------------*/
  public static void printStringArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  } // Ends Method printStrArr
  
} // Ends Class HW2LauncherA


/*----------------------------------------------------------------------
|>>> Class HW2
+-----------------------------------------------------------------------
| Purpose: Contains method stubs (i.e. method headers and default return
|          values) for all of the methods you are required to implement
|          for HW-2. IOW: your job is to fill in the blanks with code
|          that correctly solves each respective problem. If Repl is not
|          operational by 8/26/21, this class will also be what you will
|          submit to Google Classroom for grading.
+-----------------------------------------------------------------------
| Instructions for if we need to submit via Google Classroom:
|  (1) Copy all your solution code: from "class HW2 {", to the semicolon
|      closing the HW2 class code block, and everything in-between.
|  (2) Paste it into a new text file, and save it as "HW2.java".
|  (3) Submit your "HW2.java" solution to the google classroom item for
|      Homework-2; making sure to check that it uploaded successfully.
|  (*) You should NOT include ANY OTHER CODE besides class 'HW2' and/or 
|      as otherwise specified. Do NOT include class 'HW2LauncherA', any
|      'main' method[s], etc.
+---------------------------------------------------------------------*/
class HW2 {
  
  /*#####################################################################
  |>>> PART 0 : Example Methods
  #####################################################################*/
  
  public static String repeatWordXTimes(String word, int nTimes){
    String repeatedWord = "";
    for (int i=0; i<nTimes; i++) { repeatedWord += word + " ";}
    return repeatedWord;
  } // Ends Method repeatWordXTimes
  
  public static boolean isMultipleOf(int x, int mult){
    return (x%mult==0);
  } // Ends Method isMultipleOf 

  
  /*#####################################################################
  |>>> PART 1 : Warmup
  #####################################################################*/  
  
  public static boolean isEven (int val){
    // YOUR CODE HERE
    return false;
  } // Ends Method isEven
  
  public static boolean isOdd (int val){
    // YOUR CODE HERE
    return false;
  } // Ends Method isOdd
  
  public static int[] getEvens(int extent){
    // YOUR CODE HERE
    return null;
  } // Ends Method getEvens
  
  public static int[] getOdds(int extent){
    // YOUR CODE HERE
    return null;
  } // Ends Method getOdds 

  
  /*#####################################################################
  |>>> PART 2 : 12/24 Hour Time Conversion
  #####################################################################*/
  
  public static String time24to12(String time) {
    // YOUR CODE HERE
    return null;
  } // Ends Method time24to12  
  
  public static String time12to24(String time) {
    // YOUR CODE HERE
    return null;
  } // Ends Method time12to24  

 
  /*#####################################################################
  |>>> PART 3 : Temperature Unit Conversion / Queries
  #####################################################################*/
  
  public static float farToCel(float far) {
    // YOUR CODE HERE
    return -1f;
  } // Ends Method farToCel
  
  public static float celToFar(float cel) {
    // YOUR CODE HERE
    return -1f;
  } // Ends Method celToFar  
  
  public static boolean isFreezing(float temp, char type) {
    // YOUR CODE HERE
    return false;
  } // Ends Method isFreezing
  
  public static boolean isBoiling(float temp, char type) {
    // YOUR CODE HERE
    return false;
  } // Ends Method isBoiling

 
  /*#####################################################################
  |>>> PART 4 : Problems As-Seen-In Codingbat
  #####################################################################*/
  
  public static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
    // YOUR CODE HERE
    return false;
  } // Ends Method inOrderEqual
  
  public static int maxMod5(int a, int b) {
    // YOUR CODE HERE
    return -1;
  } // Ends Method maxMod5
  
  public static boolean old35(int n) {
    // YOUR CODE HERE
    return false;
  } // Ends Method old35
  
  public static String alarmClock(int day, boolean vacation) {
    // YOUR CODE HERE
    return null;
  } // Ends Method alarmClock
  
  public static boolean specialEleven(int n) {
    // YOUR CODE HERE
    return false;
  } // Ends Method specialEleven
  
  public static boolean shareDigit(int a, int b) {
    // YOUR CODE HERE
    return false;
  } // Ends Method shareDigit
  
  public static boolean evenlySpaced(int a, int b, int c) {
    // YOUR CODE HERE
    return false;
  } // Ends Method evenlySpaced
  
  public static boolean makeBricks(int small, int big, int goal) {
    // YOUR CODE HERE
    return false;
  } // Ends Method makeBricks
  
  public static String conCat(String a, String b) {
    // YOUR CODE HERE
    return null;
  } // Ends Method conCat
  
  public static String makeTags(String tag, String word) {
    // YOUR CODE HERE
    return null;
  } // Ends Method makeTags
  
  public static boolean xyzMiddle(String str) {
    // YOUR CODE HERE
    return false;
  } // Ends Method xyzMiddle
  
  public static String mixString(String a, String b) {
    // YOUR CODE HERE
    return null;
  } // Ends Method mixString
  
  public static String repeatSeparator(String word, String sep, int count) {
    // YOUR CODE HERE
    return null;
  } // Ends Method repeatSeparator
  
  public static String wordEnds(String str, String word) {
    // YOUR CODE HERE
    return null;
  } // Ends Method wordEnds
  
  public static String zipZap(String str) {
    // YOUR CODE HERE
    return null;
  } // Ends Method zipZap
  
  
  /*#####################################################################
  |>>> PART 5 : Mapping Between Ranges and Onto Cells
  #####################################################################*/
  
  public static int[] coordToCell(float xPos, float yPos, int cellSize) {
    // YOUR CODE HERE
    return null;
  } // Ends Method coordToCell
  
  // Code Derived From (https://rosettacode.org/wiki/Map_range#Java)
  public static float mapToRange(float val, float fMin, float fMax, float tMin, float tMax){
    // YOUR CODE HERE
    return -1f;
  } // Ends Method mapToRange  
  
  
  /*#####################################################################
  |>>> PART 6 : Some Parsing and Processing Methods
  #####################################################################*/
  
  public static String lettersInSentence(String sentence) {   
    // YOUR CODE HERE
    return null;
  } // Ends Method lettersInSentence  
  
  public static String[] lettersCountInSentence(String sentence) {
    // YOUR CODE HERE
    return null;
  } // Ends Method lettersInSentence
  
  
  /*#####################################################################
  |>>> PART 7 : Caesar Cipher Encrypting/Decrypting
  #####################################################################*/  

  public static String caesarCipherEncrypt(String input, int offKey, char rotDir) {
    // YOUR CODE HERE
    return null;
  } // Ends Method caesarCipherDecrypt

} // Ends Class HW2