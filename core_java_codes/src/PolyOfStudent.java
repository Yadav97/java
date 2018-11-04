
import java.util.Scanner;

class Student10
{
	protected int rollno;
	protected String name;
	
	Scanner kb = new Scanner(System.in);
	
	
	void get() {}
	void put() {}
}

class ba extends Student10
{
	
	private int his,eco,eng;
	
	void get()
	{
		System.out.println("enter the rollno");
		rollno = kb.nextInt();
		System.out.println("enter the name");
		name = kb.next();
		System.out.println("enter the history marks");
		his = kb.nextInt();
		System.out.println("enter the economics matrks");
		eco = kb.nextInt();
		System.out.println("enter the english marks");
		eng = kb.nextInt();
	}
	
	void put()
	{
		System.out.println("rollno is " + rollno);
		System.out.println("name is " + name);
		System.out.println("history marks is " + his);
		System.out.println("economics marks is " + eco);
		System.out.println("english marks is " + rollno);
	}
}

class bsc extends Student10
{
	private int p,c,m;
	
	void get()
	{
		System.out.println("enter the rollno");
		rollno = kb.nextInt();
		System.out.println("enter the name");
		name = kb.next();
		System.out.println("enter the physics marks");
		p = kb.nextInt();
		System.out.println("enter the chemistry matrks");
		c= kb.nextInt();
		System.out.println("enter the maths marks");
		m = kb.nextInt();
		
		
	}
	
	void put()
	{
		System.out.println("rollno is " + rollno);
		System.out.println("name is " + name);
		System.out.println("physics marks is " + p);
		System.out.println("chemistry marks is " + c);
		System.out.println("maths marks is " + m);
		
		
	}
	
	
	
}

public class PolyOfStudent {

	public static void main(String[] args)
	{
		Student10 s ;
		ba s1 = new ba();
		s=s1;
		s.get();
		s.put();
		bsc s2 = new bsc();
		s=s2;
		s.get();
		s.put();
		System.out.println("we can achieve the polymorphism at run time");
		
		
	}

}
