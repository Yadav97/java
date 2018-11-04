import java.util.Scanner;


class Employee
{
	
	private int code;
	private String name;
	private long salary;
	
	Scanner kb = new Scanner(System.in);
	
	
	void getEmployee() 
	{
		System.out.println("enter the employee code");
		code = kb.nextInt();
		System.out.println("enter the employee name");
		name = kb.next();
		System.out.println("enter the employee salary");
		salary = kb.nextLong();
	}
	
	void showEmployee()
	{
		
		System.out.println("employee code is " + code);
		System.out.println("employee name is " + name);
		System.out.println("employee salary is " + salary);
	}
	boolean search(int code)
	{
		if(this.code == code)
		{
			return true;
		}
		else
		{
			return false;
			
		}
		
		
	}
	
	
}

public class objectasanarray {

	public static void main(String[] args)
	{
		int n;
		System.out.println("how many employees you want to maintain");
		Scanner p = new Scanner(System.in);
		n=p.nextInt();
		
		Employee a[] = new Employee[n];   //this (a) is object as an array.
		
		for(int i = 0 ; i<a.length;i++)
		{
			a[i]=new Employee();
			
			a[i].getEmployee();
			a[i].showEmployee();
			System.out.println("\n employee is prepared \n");
			System.out.println("\n now put data for preparing other Employee \n");
			
			
			
		}
		
		System.out.println("enter the employee code you want to search");
		int coding = p.nextInt();

		boolean found = false;
		for(int i = 0 ;i<a.length;i++)
		{
			found = a[i].search(coding);
			if(found)
			{
				System.out.println("found the employee");
				 a[i].showEmployee();
				break;
			}
			if(!found)
			{
				System.out.println("not found");
			}
		}
		
		
		
		
		
		
	}

}
