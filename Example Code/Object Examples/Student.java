
public class Student {
	
	private String name;
	private int gradeLevel; // [7-12]
	private float GPA;
	
	/*
	private Course[] completedCourses;
	private Course[] currentCourses;
	*/
	
	public Student myClone;
	
	public Student(String n, int l, float g) {	
		name = n;
		gradeLevel = l;
		GPA = g;
	}
	
	
	
	public void printName() {
		System.out.println(name);
	}
	
	
	// helper method used to print basic state info
	public String toString() {
		return "Name: | "+name + " | Grade: "+gradeLevel;
	}
	
	
	public void changeName(String newName) {
		name = newName;
	}


}
