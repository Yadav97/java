import java.lang.String;
public class functionsofstrings {

	public static void main(String[] args)
	{
		String s  = new String("gwLior");
		System.out.println(s);
		int l = s.length();

		System.out.println(l);
				
		String sq  = new String("gwLior");
		String a =sq.toUpperCase();
		System.out.println(a);
		
		String y  = new String("GWALIOR");
		
		
		String p = y.toLowerCase();	
		System.out.println(p);
		
		String c = new String("hello world");
		char f = c.charAt(3);
		System.out.println(f);
		
	//reverse print of the string
		
		String cq = new String("hello world");
		for(int i = cq.length()-1;i>0;i--)
		{
			System.out.println(cq.charAt(i));
		}
	
	}
	
	
	

}
