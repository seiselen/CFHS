# Object-Oriented Programming



## Intro to Programming Paradigms

* Reference / Additional Information can be found at [this link](https://cs.lmu.edu/~ray/notes/paradigms/)

**Programming Paradigm:** A particular 'style' or 'way' of programming, plus the means by which programming languages are classified into groups thereof based on common features. We will look at two such paradigms for this topic: **Procedural** and **Object-Oriented** Programming (which you have already seen or have worked with in your coding projects!)

**Procedural Programming:** Basically sees an entire program as a giant procedure i.e. sequence of computer code instructions. In this paradigm, a program is 'broken up into' procedures (i.e. methods) and other control flow structures (e.g. loops, switches, conditionals) to operate on its data; with the focus being defining methods to perform such operations.

* **An Idea:** Imagine if there were no classes or other ways to separate data and operations on it into individual 'things'. Everything gets 'thrown into' the 
***main*** method except method definitions. How quickly would the code get cluttered?!?

***(Rather Silly) Example of Procedural Programming:***
```java
class RobotGame{

  static int robot_maxHealth  = 200;
  static int robot_maxArmor   = 150;
  static int robot_maxEnergy  = 600;

  public static void main(String[] args) {
  
  String[] robotName = new String[3];
  int[] robotHealth  = new int[3];
  int[] robotArmor   = new int[3];
  int[] robotEnergy  = new int[3];

  // Initialize Robot 1
  robotName   [0] = "Robot One"
  robotHealth [0] = 92;
  robotArmor  [0] = 150;
  robotEnergy [0] = 17;

  // Initialize Robot 2
  robotName   [1] = "Robot Two"
  robotHealth [1] = 127;
  robotArmor  [1] = 98;
  robotEnergy [1] = 516;

  // Initialize Robot 3
  robotName   [2] = "Robot Three"
  robotHealth [2] = 200;
  robotArmor  [2] = 135;
  robotEnergy [2] = 445;
  
    
  }
  
  
  public static void attack(int[] h, int[] a, int ID, int dam){
    // armor absorbs damage
    a[ID] -= dam;

    // armor depleted -> deduct remaining damage from health, then set armor to zero
    if(a[ID]<0){ h[ID] -= dam; a[ID] =  0; }

    // health depleted beyond zero -> set health to zero
    if(h[ID]<0){ h[ID]=0; }
  }

  // replenish energy, clamping to max
  public static void energize(int[] r, int ID, int amt){
    r[ID] += amt;
    if(r[ID]>robot_maxEnergy){r[ID]=robot_maxEnergy;}
  }

  // heal health xor armor, clamping to max
  public static void heal(int[] r, int ID, char t, int amt){
    r[ID] += amt;
    if(t=='H' && r[ID]>robot_maxHealth){r[ID]=robot_maxHealth;}
    if(t=='A' && r[ID]>robot_maxArmor){r[ID]=robot_maxArmor;}
  }
} // Ends Class RobotGame
```

**Object-Oriented Programming:** Basically sees an entire program as a universe of objects of all different kinds and sizes, in which each realize a 'thing' in terms of its data and operations thereof. As w3schools puts it: ***"(OOP) is about creating objects that contain both data and methods"**.  

* **Another Idea:** Now there are classes / object instances thereof to represent individual 'things' and what those things can do. All 'unique things' can now be interacted with (when desired), and one at a time (or in groups / hierarchies). All Java Programs still start in ***main***, but we can now contain 'things' and their behaviors within their own objects; such that all they need to do to be brought to life in a program is be initialized and interacted with within ***main*** (or some hierarchry of methods and other objects that is rooted therein). Will the code be less cluttered than with Procedural Programming?!?

***Example of Procedural Programming:***
```java

class TestClass{
  int hi = 1;
  


}


```


w3schools offers some advantages of OOP –vs – Procedural Programming (hereafter 'POP') [source], for which we provide some additional insights…
 
OOP is faster and easier to execute: whereas POP can be much more [needlessly] complex as a 'jungle' of control flow statements, etc.
OOP provides a clear structure for the programs: whereas POP can encompass massive and confusing nested code block hierarchies, etc.
OOP helps to keep Java code DRY (Don't Repeat Yourself) and makes the code easier to maintain, modify and debug: whereas the complexity of larger POP code is naturally, oppositely adverse thereto. 
OOP makes it possible to create full reusable applications with less code and shorter development time: whereas POP, while modular in its own way, can still be much more difficult to decompose, recompose, etc.


