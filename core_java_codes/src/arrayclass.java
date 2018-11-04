
import java.util.Scanner;

public class arrayclass {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("how many numbers you want to enter");
		int k = kb.nextInt();
		
		int l[] = new int[k];  //define the array
		
		for(int i = 0;i<l.length;i++)
		{
			l[i]=kb.nextInt();
			System.out.println("eneter l[" + i + "]");			
			
			
		}
		
		for(int j = 0;j<l.length;j++)
		{
			System.out.println(l[j]);
			
		}
		
		

	}

}
