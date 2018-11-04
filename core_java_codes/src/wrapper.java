
public class wrapper {

	public static void main(String[] args) {
		int j=65;
		Integer  i = new Integer(j);  //boxing
		
		Integer l = i; //autoboxing
		
		//System.out.println(i);
		
		
		
		int p =  i.intValue(); //unboxing
		
		int f = i;  //autounboxing;
		
		float  t = i.intValue();
		System.out.println(t);
		
		byte u = i.byteValue();
		
		System.out.println(u);
		
		
		double d = i.intValue();
		System.out.println(d);
		
	
				
		
		
		
		
		

	}

}
