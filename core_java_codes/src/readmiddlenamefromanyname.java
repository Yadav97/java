import java.util.Scanner;



public class readmiddlenamefromanyname {
	
	public static void main(String args[])
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("enter the full name");
		String j = kb.nextLine();
		int d = j.indexOf(' ');
		int last = j.lastIndexOf(' ');
		String s = j.substring(d,last);
		System.out.println(s);
		
	}
	
	

}
