
class Hp
{
	void show()
	{
		
	System.out.println("this is the base class fumnction");	
	
	}
}
class Lap extends Hp
{
	
	void show()
	{
		super.show();
		System.out.println("this is the derive  class fumnction");	
		
		
	}
	
	
	
}






public class MethodOverriding {

	public static void main(String[] args) 
	{
		Lap p = new Lap();
		p.show();
	}

}
