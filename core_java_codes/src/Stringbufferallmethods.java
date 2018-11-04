
public class Stringbufferallmethods {

	public static void main(String[] args) {
		
		//constructor of StringBuffer class;
		StringBuffer s= new StringBuffer("gwalior");
		int t = s.capacity();
		
		System.out.println(t);
		
		//1)method of the Stringbuffer
		
		s.append("hello world iam krishna");
		System.out.println("here new overridden string is " + s);
		
		//2)method of the Stringbuffer;
		int p	=s.length();
		
	System.out.println(p);
	
	//3)method of the stringbuffer
	int f=s.capacity();
	System.out.println(f);
	
	s.insert(3, "hello i am krishna yadav");
	System.out.println(s);

	s.deleteCharAt(3);
	System.out.println(s);
	
	s.delete(2,5);
	System.out.println(s);
	
	s.setCharAt(3, 'Y');
	System.out.println(s);
	
	s.reverse();
	System.out.println(s);
	
	s.toString();
	System.out.println(s);
	
	
	
	
		
		
		
	}

}
