package practisee;

import java.util.Scanner;

public class Word_sen_rev {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String nstr="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch==' ')
			nstr=nstr+" ";
		nstr=ch+nstr;
	}
	System.out.println(str);
	System.out.println(nstr);
  }
}
