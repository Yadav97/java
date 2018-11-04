
public class conversionofstringbuffertostring {

	public static void main(String[] args) 
	
	{
		String h = new String("gwalior"); //simple string
	
		StringBuffer s = new StringBuffer(h);
	
	System.out.println("this string is StringBuffer" + s);
	String f = s.toString();
		System.out.println("thsi string is of type String" + f);
		
		if(h.equals(f))
			System.out.println("equals");
		else
			System.out.println("not equal");
		
		
		
		

	}

}
