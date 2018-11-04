import java.util.Scanner;

class School
{
	
	
	private int roll;
	private String name;
	
	
	Scanner kb = new Scanner(System.in);
	
	void getStudent()
	{
		System.out.println("enter the roll no");
		roll = kb.nextInt();
		
		System.out.println("enter the name of the student");
		name = kb.next();
	}

	void show()
	{
		
		System.out.println("roll no of the student " + roll);
		System.out.println("name of the student" + name);
	}
	
}

public class constructor {

	public static void main(String[] args) 
	{
		School s = new School();  //default constructor //instantiate the constructor.
	
		s.getStudent();
		s.show();
		s.getClass();
		
		
		
		
		
		
	}

}
