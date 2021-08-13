// "Sneak Peek Demo of Switch Statements in Java"

public class Main {
  enum DayOfWeek {
      MONDAY,    //0
      TUESDAY,   //1
      WEDNESDAY, //2
      THURSDAY,  //3
      FRIDAY,    //4
      SATURDAY,  //5
      SUNDAY     //6
  } // Ends Enum
  
  public static void main(String[] args) {
   
    DayOfWeek today = DayOfWeek.THURSDAY;
        
    switch(today){
      case MONDAY : System.out.println("MON"); break;
      case TUESDAY : System.out.println("TUES"); break;
      case WEDNESDAY : System.out.println("WED"); break;
      case THURSDAY : System.out.println("THURS"); break;
      case FRIDAY : System.out.println("FRI"); break;
      case SATURDAY : System.out.println("SAT"); break;
      case SUNDAY : System.out.println("SUN"); break;
    } // Ends Switch
    
    System.out.println(today);
    
  } // Ends Function Main
} // Ends Class Main