
public class stringbuffer {

	public static void main(String[] args)
	
	{
	
		StringBuffer s =  new StringBuffer("gwalior");
		int len = s.length();
		int d = s.capacity();
	//	int total  = d-len;
		System.out.println(d);
		//System.out.println(total);
		
		//s.append("hello");
		//int w = s.capacity();
		//System.out.println(w);
		
//		System.out.println(s);
		
		
	//	System.out.println("hello world");
		
		System.out.println(len);
		s.append(100);
		System.out.println(s);
	
		
		
		
		
		
		
	}

}
