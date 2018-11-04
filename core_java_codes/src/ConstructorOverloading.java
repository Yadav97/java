
class Over
{
	
	public  Over()
	{
		System.out.println("this is Over constructor");
		
		}
	 
	 Over(int x, int y)
	 {			
		 this();
		 System.out.println("this is Over parametrized constructor" + x + y);
	}
	
}
	
	
	








public class ConstructorOverloading {

public static void main(String[] args) {
	
		Over o = new Over();
		Over o2= new Over(10,20);
		

}

}
