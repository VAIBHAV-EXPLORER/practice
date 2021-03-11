package practisee;

public class StrBuilder_chk {
	public static void main(String args[])
	{
		StringBuilder s1=new StringBuilder("hello");
		StringBuilder s2=new StringBuilder("hello");
		String s3="he";
		if(s1.equals(s2))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
	}

}
