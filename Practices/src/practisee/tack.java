package practisee;

import java.util.Arrays;
import java.util.Scanner;

public class tack {
	public static void main(String args[])
	{
//		int l=10000001;
//		int p=l;
//		System.out.println(p);
//		p=20012;
//		System.out.println(p);
//		System.out.println(l);
//		int ar1[]= {1,2,3,4};
//		int ar2[]=new int[4];
//		for(int i=0;i<4;i++)
//			ar2[i]=ar1[i];
//		 ar2 = Arrays.copyOf (ar1, ar1.length);
//		for (int i:ar2)
//			System.out.print(i+" ");
//		System.out.println();
//		ar2[0]=100;
//		for (int i:ar2)
//			System.out.print(i+" ");
//		System.out.println();
//		for (int i:ar1)
//			System.out.print(i+" ");
		probab();
		double m=1.00;
		double s=(double)Math.round(m*100000d)/100000d;
//		System.out.format("%.4f",m);
		
	}
	public static void probab()
	{
		Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0)
	    {
	        int r=in.nextInt();
	        int g=in.nextInt();
	        double r1=r;
	        double g1=g;
	        double pr;
	        if(g==0 && r==0)
	        {
	        	System.out.format("%.6f",1.0);
	        	System.out.println();
	        	
	        }
	        else if(g==0 || r==0)
	        {
	        	pr=(r1/r1);
	        	System.out.format("%.6f",1.0);
	        	System.out.println();
	        }
	        else
	        {
	        	pr= (r1/(r1+g1));
	        	System.out.format("%.6f",pr);
	        	System.out.println();
	        }
    }
	}
}
