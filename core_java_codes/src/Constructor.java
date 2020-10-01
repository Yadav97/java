
class BaseVersion1
{
	
	BaseVersion1() //Constructor-Meathod name is same as class name
	{
		
		System.out.println("Base version");
		
		
	}
	BaseVersion1(int x) //Constructor overloading
	{
		System.out.println("Base version" + x);
		
	}
	
	
	
	
	
}
class DeriveVersion1 extends BaseVersion1
{
	
	DeriveVersion1() //Constructor 
	{
		
		System.out.println("Derive version");
		
	}
	
	DeriveVersion1(int x , int y) //Constructor overloading
	{
	
		
	super(y);
	System.out.println("Derive version" + x +y);
	
	}
	
}













public class Constructor {

	public static void main(String[] args) 
	{
		DeriveVersion1 d = new DeriveVersion1();
		DeriveVersion1 d1 = new DeriveVersion1(10,20);
	}

}
