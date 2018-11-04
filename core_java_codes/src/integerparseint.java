
public class integerparseint {

	public static void main(String[] args) {

		String s = "100";
		String s1 = "300";
		
		System.out.println(s+s1);//yahan par operator overloading ho raho hai
		
		//Now we make all aritmetic operations
		//so we convert to integer data type
		
		int p = Integer.parseInt(s);
		int p1 = Integer.parseInt(s1);
		
		System.out.println("this is addition" + (p+p1));
		System.out.println("this is multipliction"+(p*p1));
		System.out.println("this is subtraction" + (p1-p));
		
		
		
		String q = "111";
		int d = Integer.parseInt(q,2);
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
	}

}
