
public class wrapperallclasses {

	public static void main(String[] args) 
	{
		/*int i = 10;
		float f = 20f;
		long l = 30;
		short s = 40;
		
		
		//all this is are 1 boxing and autoboxing
		
		Integer integer = new Integer(i);
		Float floating = f;
		Long longing = l;
		Short shorting = s;
		

		//unboxing of one data type to all other datatype
		//upar waale ke liye karenge sab
		
		//1)Integer Object converted to all other primitive data type;means jo wrapper object mein jo integer store hai use hum 
		//primitive int,float,long,short mein convert kar rahen means convert the object to other data types;		
		int qint = integer.intValue();  //integre object converted to primitive int
		float qfloat = integer.intValue();//integre object converted to primitive float;
		long qlong = integer.longValue();//integre object converted to primitive long
		short qshort = (short)integer.floatValue();//integre object converted to primitive short
		
		System.out.println(qint);
		System.out.println(qfloat);
		System.out.println(qlong);
		System.out.println(qshort);*/
		
		
		
		
		
		//yahan par jo string HUMNE PASS KI THI WEH Integer CLASS KE OBJECT MEIN STORE HAI SO THIS STRING IS AUTOMATICALLY
		//OF TYPE INTEGER SO WE EASILY PERFORM THE ARITMETIC OPERTAION WITHOUT TYPECASTING.
		
		
		
		String str = "10";
		String str1 = "20";
		Integer clasing = new Integer(str);
		Integer clasing1 = new Integer(str1);
		
		int r = clasing.intValue();
		int r1 = clasing1.intValue();
		System.out.println(r+r1);

		
		//System.out.println(str+str1);
		
		//System.out.println(clasing+clasing1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
