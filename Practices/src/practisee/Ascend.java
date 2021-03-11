package practisee;
import java.util.*;
public class Ascend {
	public int count(int n)
	{
		int coun=0;
		while(n!=0)
		{
			coun++;
			n=n/10;
		}
		return coun;
	}
	public boolean asc(int n)
	{
		int co=1;int r,k,f,t;int cou=2;
		int p=count(n);
		while(co<=p)
		{
			 r= (int) (n%(Math.pow(10, co)));
			 f=(int) (r/(Math.pow(10, co-1)));
			 k=(int) (n%(Math.pow(10,cou)));
			 t=(int) (k/(Math.pow(10,cou-1)));
			if(f<t)
			{
				return false;
				
			}
			co++;cou++;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(new Ascend().asc(n))
		{
			System.out.println("Ascending number");
		}
		else
			System.out.println("not an Ascending number");
		in.close();
	}

}
