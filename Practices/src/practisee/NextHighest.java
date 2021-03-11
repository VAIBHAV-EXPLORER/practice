//Find next greater number with same set of digits
package practisee;
import java.util.Arrays;
import java.util.Scanner;

public class NextHighest {

	public static void main(String[] args) {
		try(Scanner in=new Scanner(System.in))
		{
			int i;int min;
			String n=in.next();
			int ar[]=new int[n.length()];
			int ar1[]=new int[n.length()];
			ar1=Arrays.copyOf(ar,ar.length);
			for (int k=0;k<n.length();k++)
			{
				ar[k]=Integer.parseInt(String.valueOf(n.charAt(k)));
			}
			for(i=ar.length-2;i>=0;i++)
			{
				if(ar[i]<ar[i+1])
					break;
			}
			int c=i;
			min=c+1;
			for(int j=c+2;j<ar.length;j++)
			{
				min=Math.min(ar[min],ar[j]);
			}	
			
		}
		

	}

}
//Multiple classes can exist in a file
//class Note
//{
//	public static void main(String args[])
//	{
//		System.out.println("hello");
//	}
//}
