import java.util.Scanner;


class Bank1
{
	private int acno;
	private String name;
	private long balance;
	static private long bankbalance;
	Scanner kb = new Scanner(System.in);
	


void account()
{
	System.out.println("enter the account no");
	acno = kb.nextInt();
	
	System.out.println("eneter the name of customer");
	name = kb.next();
	
	System.out.println("enter the balance");
	balance = kb.nextLong();
	
	bankbalance = balance + bankbalance;
}

void show()
{
	System.out.println("accont no is " + acno);
	System.out.println("name of customer " + name);
	System.out.println("balance " + balance);
}
 void bankbalance() 
{
	
	System.out.println("bankbalance of the customer is " + bankbalance);
	
}


}


public class Bank {

	public static void main(String[] args)	 		
	{

		
	



		System.out.println("enter the number of customer you want to handle");
		Scanner p = new Scanner(System.in);
		int n = p.nextInt();
		
		Bank1 b[];
		b = new Bank1[n];
		
		
		for(int i = 0;i<b.length;i++)
		{
			
			b[i] = new Bank1();
			b[i].account();
					
			
		}
		
		for(int i = 0;i<b.length;i++)
		{
			b[i].show();
			b[i].bankbalance();
			
		}
		
		
	}
}

		
		
		
		
		
		
	


