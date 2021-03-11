package practisee;

import java.util.Scanner;
@SuppressWarnings({"unused","resource"})
public class Distinct {
	public boolean isDistin(int ar1[],int num)
	{
		for(int i=0;i<ar1.length;i++)
			if (num==ar1[i])
					return false;
		return true;
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
			ar[i]=in.nextInt();
		for(int i=0;i<n;i++)
		{
			int count=i+1;
			if(new Distinct().isDistin(ar, ar[i]))
				System.out.print(ar[i]+"   ");
		}
		
	}

}
