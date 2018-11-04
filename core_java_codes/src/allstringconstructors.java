
public class allstringconstructors {

	public static void main(String[] args) {
		
		String s = new String();
		System.out.println(s);
		

		String s1 = new String("gwalior");
		System.out.println(s1);


		
		char [] a = {'b','h','o','p','a','l'};
		
		String s2 = new String(a);
		System.out.println(s2);
		

		String s3 = new String(a,2,4);
		System.out.println(s2);
		
		byte b[] = {67,68,69,70,71,72,73,74,75};
		String w = new String(b);
		System.out.println(w);

		String w3 = new String(b,4,3);
		System.out.println(w3);

		
		
		
		
		

	}

}
