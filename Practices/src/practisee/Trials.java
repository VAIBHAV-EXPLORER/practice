package practisee;

import java.util.Scanner;

public class Trials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t=5;
		int co=0;
		while(t-->0)
			co++;
			
		//System.out.println(co);
		//maini();
		main2();
	}

	


		public static void maini()
		{
			try {
			Scanner in=new Scanner(System.in);
			int t=in.nextInt();
			while(t-->0)
			{
			    int n=in.nextInt();
			    int k=in.nextInt();
			    int ar[]=new int[n];
			    for(int i=0;i<n;i++)
			    {
			        ar[i]=in.nextInt();
			    }
			    boolean flag=false;
				int sum=0;
			    for(int i=0;i<n;i++)
			    {
			        ar[i]+=sum;
			        if(ar[i]>=k)
			        {
			            sum=ar[i]-k;
			        }
			        else{
			            System.out.println(i+1);
			            flag=true;
			            break;
			        }
			    }
			    if(!flag)
			    {
			      System.out.println(n+(ar[n-1]/k)); 
			    }
			}
		}
			catch(Exception e)
			{
				
			}
	}
		public static void main2()
		{
			try {
			    Scanner in=new Scanner(System.in);
			    int t=in.nextInt();
			    while(t-->0)
			    {
			        int n=in.nextInt();
			        int k=in.nextInt();
			        int x=in.nextInt();
			        int y=in.nextInt();
			        int ar[]=new int[n];
			        for(int i=0;i<n;i++)
			        {
			            ar[i]=i;
			        }
			        boolean flag=false;
			        for(int i=(ar[x]);i<n;i=i+k)
			        {
			        	
			        	System.out.println(i);
			            if(ar[i]==y||((ar[(i+k)]<n) && (ar[(i+k)]==y))){
			            System.out.println("YES");
			            flag=true;
			            break;
			            }
			        }
			        if(!flag)
			        	System.out.println("NO");
			        
			    }
			    
			} 
			catch(Exception e) {
			}
		}
}
