
class Base4
{
	
	void show()
	{
		
		System.out.println("Base classs");
		
	}
	
}
class DeriveOne extends Base4
{
	
	void show()
	{
		
		System.out.println("DeriveOne classs");
		
	}
	
	
	
	
}

class DeriveTwo extends Base4
{
	
	void show()
	{
		
		System.out.println("DeriveTwo classs");
		
	}

	
	
}








public class Dynamic {
	public static void main(String arg[])
	{
		DeriveOne d1 = new DeriveOne();
		DeriveTwo d2 = new DeriveTwo();
		Base4 B;
		B = d1;
		B.show();
		B = d2;
		B.show();
		Base4 b=new Base4();
		B=b;
		B.show();
		
	}
	


	

}
