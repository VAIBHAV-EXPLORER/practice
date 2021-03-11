package practisee;

import java.util.Scanner;

public class Rot_array_2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		int k=in.nextInt();
		int temp[]=new int[k];
		for(int i=0;i<k;i++)
		{
			temp[i]=ar[ar.length+i-k];			
		}
		for (int i=ar.length-1;i>k-1;i--)
		{
			ar[i]=ar[i-k];
		}
		for(int i=0;i<k;i++)
		{
			ar[i]=temp[i];
		}
		for(int i:ar)
			System.out.print(i+"  ");
		in.close();
	}

}
