package practisee;

import java.util.Scanner;
import java.util.stream.IntStream;
public class SchedulingAlgoithm {
	public static void FcfsAlgorithm(int burst[])
	{
		int wt[]=new int[burst.length];
		int ct[]=new int[burst.length];
		int sum=0;
		for(int i=1;i<burst.length;i++)
		{
			wt[i]=sum+burst[i-1];
			sum=wt[i];
			ct[i-1]=wt[i];
		}
		ct[burst.length-1]=sum+burst[burst.length-1];
		for(int i: wt)
		System.out.println(i);
		System.out.println("Average waiting time is:   "+(double)(IntStream.of(wt).sum())/(double)burst.length);
		System.out.println("Average completion time is:   "+(double)(IntStream.of(ct).sum())/burst.length);
		
	}
	public static void ShortestJobFirst(String process[],int burst[])
	{
		int min=0;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of process");
		int n=in.nextInt();
		System.out.println("Enter the process names along with the burst time");
		//String process[]=new String[n];
		int burst[]=new int[n];
		for(int i=0;i<n;i++)
		{
			//process[i]=in.next();
			burst[i]=in.nextInt();
		}
		FcfsAlgorithm(burst);
	}

}
