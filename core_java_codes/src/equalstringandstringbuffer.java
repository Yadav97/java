import java.util.Scanner;

public class equalstringandstringbuffer {

	public static void main(String[] args)
	
	{
	
	Scanner kb = new Scanner(System.in);	
	System.out.println("enter the any name");
	 String name = kb.nextLine();
	
		StringBuffer s = new StringBuffer(name);
		
			
			s.reverse();
			System.out.println(s);
				
			String g = s.toString();
			
			if(name.equals(g))
			{
				
				System.out.println("equal");
			}
		
			else
			{
				System.out.println(" not equal");
				
			}
		
		
		

	}

}
