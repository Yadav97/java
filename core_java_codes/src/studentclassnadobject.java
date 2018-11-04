import java.util.Scanner;

class Student
{
	private String name;
	private int rollno;
	private int p,c,m;
	
	Scanner kb = new Scanner(System.in);
	
	void getStudent()
	{
		System.out.println("enter the your name");
		name = kb.nextLine();
		
		System.out.println("enter the roll no");
		rollno = kb.nextInt();
	}
	
	void getMarks()
	{
		
		System.out.println("enter yout  physics marks");
		p = kb.nextInt();
		System.out.println("enter your chemistry marks");
		c=kb.nextInt();
		System.out.println("enter your maths marks");
		m = kb.nextInt();
	}
	
	void show()
	{
		System.out.println("name is " + name);
		System.out.println("roll no is " + rollno);
		System.out.println("physics marks is" + p);
		System.out.println("chemistry marks is " + c);
		System.out.println("maths marks is " + m);
		
		int t = p+c+m;
		float per = t/3;
		System.out.println("your percentage is " + per);
	}
	
	
}



public class studentclassnadobject {
	
	public static void main(String args[])
	{
		
		
		Student s = new Student();
		s.getStudent();
		s.getMarks();
		s.show();
	}
	
	

}
