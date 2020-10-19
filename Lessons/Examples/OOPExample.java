
class Robot{
	public static int maxHealth  = 200;
	public static int maxEnergy  = 600;	
	public static int maxDamage  = 100;	
	
	private int health;
	private int energy;

	public Robot(){
		health = 100;
		energy = 100;
	}

	public Robot(int h, int e){
		heal(h);
		energize(e);
	}
	
	public void heal(int amt) {
		health = (health+amt>maxHealth) ? maxHealth : health+amt;
	}
	
	public void energize(int amt) {
		energy = (energy+amt>maxEnergy) ? maxEnergy : energy+amt;
	}
	
	public void attack(int amt, Robot target) {
		if(amt>maxDamage) {amt=maxDamage;}
		if(amt>energy) {amt=energy;}
		target.takeDamage(amt);
		energy-=amt;
	}
	
	public void takeDamage(int amt) {
		health = (health-amt<0) ? 0 : health+amt;
	}
} // Ends Class Robot


public class RobotEx{
	public static void main(String[] args) {
		// Initialize the robots
		Robot robot1 = new Robot();
		Robot robot2 = new Robot(150,  300);
		Robot robot3 = new Robot(245, 9001);
		Robot robot4 = new Robot(127,  445);		
		
		// Simulate a small game
		robot1.attack(50, robot4);
		robot3.attack(25, robot1);
		robot2.attack(87, robot4);
		robot4.heal(87);
		robot1.energize(100);
		robot2.attack(100, robot1);
	}
}