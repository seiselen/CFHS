/*======================================================================
| Project: FH-4710/4750 2020-2021 Example Code
| Author:  Steven Eiselen, UArizona/CFHS Computer Science
+-----------------------------------------------------------------------
| Description: Demonstrates an example of Procedural Programming for a
|              game where robots attack each other. When looking at it,
|              ask yourself questions such as:
|                > How much work would be involved in creating a 4th
|                  robot? Or to create 10 more?
|                > How much work would be involved in both creating and
|                  working with additional robot attributes? Especially
|                  when it comes to the methods which 'realize' them?
|                > How easy would it be to pass unintentional/mistaken 
|                  inputs to the methods?
|
| Scalability: These questions relate to a MAJOR Software Engineering
|              concept/strategy called 'scaling' or 'scalability', for
|              which we offer a basic definition...
|                > Scalability: How possible is it for some program or
|                  system to grow/expand to support additional features,
|                  functionality, and capacity (in terms of data and the
|                  number of things defined by / using that data)?
|                > Scaling: The process of growing/expanding a program
|                  or system to support such features, functionality, 
|                  and capacity.
+-----------------------------------------------------------------------
| Special Notes: 
|   - For this example, pretend that arrays and strings are NOT objects
|     (as is the case with the 'C' language).
*=====================================================================*/

public class ProceduralExample {
	
	static int robot_maxHealth  = 200;
	static int robot_maxArmor   = 150;
	static int robot_maxEnergy  = 600;
	
	public static void main(String[] args) {
		
		//--------------------------------------------------------------
		//>>> DECLARE STATE DATA
		//--------------------------------------------------------------		
		String[]  robotName    = new String[3];
		boolean[] robotAlive   = new boolean[3];
		int[]     robotHealth  = new int[3];
		int[]     robotArmor   = new int[3];
		int[]     robotEnergy  = new int[3];	
		int[]     robotAttacks = new int[3];
		
		//--------------------------------------------------------------
		//>>> INITIALIZE STATE
		//--------------------------------------------------------------

		// Initialize Robot 1 data
		robotName   [0] = "Robot One";
		robotHealth [0] = 92;
		robotArmor  [0] = 150;
		robotEnergy [0] = 17;
		robotAlive  [0] = true;

		// Initialize Robot 2 data
		robotName   [1] = "Robot Two";
		robotHealth [1] = 127;
		robotArmor  [1] = 98;
		robotEnergy [1] = 516;
		robotAlive  [1] = true;
		
		// Initialize Robot 3 data
		robotName   [2] = "Robot Three";
		robotHealth [2] = 200;
		robotArmor  [2] = 135;
		robotEnergy [2] = 445;
		robotAlive  [2] = true;
		
		//--------------------------------------------------------------
		//>>> EXAMPLE OF METHODS IN ACTION
		//--------------------------------------------------------------

		// Robot 0 attacks robot 1 with 50 damage
		attack(robotHealth, robotArmor, robotAlive, robotAttacks, 0, 1, 50);
		

	}
	
	
	
	/*>>> Method Attack
	 * 
	 * Note: Look at all of those parameters - yikes! We'll reduce them
	 *       [by a lot] in the OOP version!
	 * 
	 * Algorithm: 
	 *   (1) Target's armor absorbs damage first. 
	 *   (2) If armor now below zero, target's health absorbs deficit,
	 *       and armor is reset to zero.
	 *   (3) If health now below zero, target's health is reset to zero,
	 *       and its alive status set to false.
	 *   (4) Attacker's attack count is incremented by one.
	 */
	public static void attack(int[] rHealth, int[] rArmor, boolean[] rAlive, 
			int[] rAttacks, int attID, int tarID, int damage){
		
		rArmor[tarID] -= damage;

		if(rArmor[tarID]<0){ 
			rHealth[tarID] += rArmor[tarID];
			rArmor[tarID] = 0;
		}
		
		if(rHealth[tarID]<0){ 
			rHealth[tarID] = 0;
			rAlive[tarID] = false;
		}
		
		rAttacks[attID]++;	
	} // Ends Method attack

	
	/*>>> Method energize
	 * 
	 * Note: We need to pass in both the data structure containing all 
	 *       robots' state, and the ID of the robot that this affects.
	 *       How easy is it to mistakenly pass in the wrong array, robot
	 *       ID, energy amount, or confuse the order of int parameters?
	 *       
	 * Algorithm: For robot of specified ID...
	 *   (1) Add in specified amount, then
	 *   (2) Clamp to max val of specified item. 
	 */
	public static void energize(int[] r, int ID, int amt){
		r[ID] += amt;
		if(r[ID]>robot_maxEnergy){r[ID]=robot_maxEnergy;}
	} // Ends Method energize

	
	/*>>> Method heal
	 * 
	 * Note: Another case of needing to pass in both the data structure
	 *       containing all robots' state and the ID of the robot that
	 *       this affects (i.e. just as much chance to make mistakes!)
	 * 
	 * Algorithm: For robot of specified ID...
	 *   (1) Add in specified amount, to the specified item, then
	 *   (2) Clamp to max val of specified item. 
	 */
	public static void heal(int[] r, int ID, char t, int amt){
		r[ID] += amt;
		
		if(t=='H' && r[ID]>robot_maxHealth){r[ID]=robot_maxHealth;}
		if(t=='A' && r[ID]>robot_maxArmor){r[ID]=robot_maxArmor;}
	} // Ends Method heal
		
}


