package practisee;

import java.util.Random;
import java.util.Scanner;

public class QuickSelect {
	static Scanner in=new Scanner(System.in);
	static int n=in.nextInt();
	static int ar[]=new int[n];
	
	public static int select(int firstIndex,int lastIndex,int k)
	{
		int pivot=new QuickSelect().partition(firstIndex,lastIndex);
		if(k<pivot)
		{
			return select(firstIndex,pivot-1,k);
		}
		else if (k>pivot) {
			return select(pivot+1, lastIndex, k);
		}
		else
			return ar[pivot];
	}
	
	public int partition(int firstIndex,int lastindex)
	{
		int pivot=new Random().nextInt(lastindex-firstIndex+1)+firstIndex;
		System.out.println(pivot);
		swap(pivot,lastindex);
		for(int i=firstIndex;i<lastindex;i++)
		{
			if(ar[i]<ar[lastindex])
			{
				swap(i,firstIndex);
				firstIndex++;
			}
		}
		swap(firstIndex,lastindex);
		return firstIndex;
	}
	
	public void swap(int pivot, int lastindex) {
		int temp=ar[pivot];
		ar[pivot]=ar[lastindex];
		ar[lastindex]=temp;
		
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the values in array ");
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
			
		}
		System.out.println("Enter the postion ");
		int k=in.nextInt();
		System.out.println(select(0, n-1, k-1));
	}

}
