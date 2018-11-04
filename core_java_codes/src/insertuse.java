
public class insertuse {

	public static void main(String[] args) 
	{

		StringBuffer s = new StringBuffer("hello world krishna yadav"); //here are total byte is 24
		System.out.println(s.capacity());
		
		s.insert(11, " i am"); //total byte is 4      
		
		System.out.println(s);
		
		
		
		//24+16+1(for space in " i am"  )=41
		
		
		
		
		
		
	}

}
