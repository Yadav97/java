class Garbage
{
	void show()
	{
		
		System.out.println("hello this show method of the class");
	}
	
	protected void finalize()
	{
		
		System.out.println("finalize is called and after executing final object is destroyed");
	}
	
	
	
	
	
}








public class garbagecollector {

	public static void main(String[] args) 
	
	{
		
		Garbage f = new Garbage();
		f.show();
		f=null;
		System.gc();
		
		
		
		
		
		
		
		
		
	}

}
