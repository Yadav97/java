import java.util.Scanner;

class Student
{
	private String name;
	private int rollno;
	
	Scanner kb = new Scanner(System.in);
	
	void getStudent()
	{
		System.out.println("enter the name of the student");
		name = kb.nextLine();
		
		System.out.println("enter the roll no of the student");
		rollno = kb.nextInt();
	}
	
	
	void show()
	{
		
		System.out.println("name of the student is " + name);
		System.out.println("roll no of the student is " + rollno);
	}
	
}

class Marks extends Student
{
	private int p,c,m;
	
	void getMarks()
	{	
		
		getStudent();
		System.out.println("enter the physics marks");
		p = kb.nextInt();
		System.out.println("enter the chemistry marks");
		c = kb.nextInt();
		System.out.println("enter the maths marks");
		m = kb.nextInt();
	}
	
	void showMarks()
	{
		show();
		System.out.println("physics marks = " + p);
		System.out.println("chemistry marks = " + c);
		System.out.println("maths marks = " + m);

	}
	
	
	
	
	
}







public class singleinheritence {

	public static void main(String[] args)
	{
		
		Marks s = new Marks();
		s.getMarks();
		s.showMarks();
				
		
		
		
		
	}

}
