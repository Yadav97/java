
public class hashcode{

	public static void main(String[] args) 
	
	{
		
		String s = new String("hello");
				String s1 = new String("Hello");
		
				if(s.equals(s1))
				{
					
					System.out.println("hash code of the s is " + s.hashCode());
					System.out.println("hash code of the s1 is " + s1.hashCode());
				}
		
				
				else
				{
					
					System.out.println("not equal");
					System.out.println("hash code of the s is " + s.hashCode());
					System.out.println("hash code of the s1 is " + s1.hashCode());
					System.out.println(s.compareTo(s1));
					
				}
				

	}

}
