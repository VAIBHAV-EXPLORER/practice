package practisee;
import java.util.*;
@SuppressWarnings({"resource"})
public class Twin_prime {
	public static boolean calcul(int n)
	{
			for (int j=2;j<(int)(Math.sqrt(n)+1);j++)
			{
				if(n%j==0) 
					return false;
			}
			return true;
	}


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int s=in.nextInt();
		int e=in.nextInt();
		if(s>2)
			for(int i=s;i<e-1;i++)
			{
				
				if(calcul(i) && calcul(i+2))
				{
					System.out.println("("+i+"  "+(i+2)+")");
				}
			}
		else
			System.out.print(" The starting value should be more than 2 ");
	}

}
