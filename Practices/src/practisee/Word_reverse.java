package practisee;

import java.util.Scanner;

public class Word_reverse {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String p="";
		String ar[]=str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			String sub=ar[i];
			for(int j=sub.length()-1;j>=0;j--)
			{
				 p=p+sub.charAt(j);
			}
			ar[i]=p;
			p="";
		}
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
