package com.testing;

import java.util.Arrays;
import java.util.Scanner;
public class JobSequencing {
	public static void greedyMethod(int profit[],int deadline[],String name[])
	{
		for(int i=0;i<profit.length-1;i++)
		{
			for(int j=0;j<profit.length-i-1;j++)
			{
				if(profit[j]<profit[j+1])
				{
					int temp=profit[j];
					profit[j]=profit[j+1];
					profit[j+1]=temp;
					int t=deadline[j];
					deadline[j]=deadline[j+1];
					deadline[j+1]=t;
					String n=name[j];
					name[j]=name[j+1];
					name[j+1]=n;
				}
			}
		}
		int max=deadline[0];
	    for(int i=0;i<deadline.length;i++)
	    {
	      if(deadline[i]>max)
	      {
	        max=deadline[i];
	      }
	    }
	    String x[]=new String[max];
	    boolean k[]=new boolean[max];
	    Arrays.fill(k, false);
	    int pro=0;
	    for(int i=0;i<deadline.length;i++)
	    {
	      int te=deadline[i];
	      te=te-1;
	      if(k[te]==false )
	      {
	        x[te]=name[i];
	        pro+=profit[i];
	        k[te]=true;
	      }
	      else
	      {
	        while(te!=-1)
	        {
	          if(k[te]==false)
	          {
	            x[te]=name[i];
	            pro+=profit[i];
	            k[te]=true;
	            break;
	          }
	            te=te-1;
	        }
	      }
	    }
	    for(int i=0;i<max;i++)
	    {
	    	if(x[i]!=null)
	        System.out.print(" "+x[i]+"  ");
	    }
	    System.out.println();
	    System.out.print("Profit Earned  "+pro);
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of jobs");
		int n=in.nextInt();
		int profit[]=new int[n];
		int deadline[]=new int[n];
		String name[]=new String[n];
		System.out.println("Enter the job names");
		for(int i=0;i<n;i++)
		{
			name[i]=in.next();
		}
		System.out.println("Enter the job deadlines");
		for(int i=0;i<n;i++)
		{
			deadline[i]=in.nextInt();
		}
		System.out.println("Enter the job profit");
		for(int i=0;i<n;i++)
		{
			profit[i]=in.nextInt();
		}
		greedyMethod(profit, deadline, name);
		
		
		
		

	}

}
