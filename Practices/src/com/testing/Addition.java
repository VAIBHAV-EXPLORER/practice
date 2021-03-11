package com.testing;

import java.util.Scanner;

public class Addition {
	public static void pattern(int t,int n)
	{
		if(t==0)
			return;
		System.out.print(n+"  ");
		 pattern(t-1, n+5);
		 return;
	}
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of times");
		int t=in.nextInt();
		System.out.println("Enter the first number");
		int n=in.nextInt();
		pattern(t, n);
	}

}


