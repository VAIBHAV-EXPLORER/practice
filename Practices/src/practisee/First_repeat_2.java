package practisee;

import java.util.Scanner;

public class First_repeat_2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		str=str.toLowerCase();
		int ar[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			int ch=str.charAt(i)-'a';
			ar[ch]++;
			if(ar[ch]==2)
			{
				System.out.print("The repeated character is "+(char)(ch+97));
				break;
			}
		}

	}

}
