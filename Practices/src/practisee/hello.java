package practisee;

public class hello {
	 int i=1;
	public static void main(String args[])
	{
//		System.out.println("Hello world");
//		System.out.print("Hello ");
//		System.out.println("Hello world222222");
//		System.out.println("Hello world is okk");
//		int z=4;
//		int y=z++;
//		System.out.println(y);
//		System.out.println(z);
//		int ar[]= {1,2,3,4,5};
//		System.out.println(ar[2]);
		char a='A';
		int k=a;
		char t=(char) k;
		System.out.println(t);
		String st="abc";
		char ch='b';
		if(Character.isLowerCase(ch))
		{
			System.out.println("True");
		}
		new hello().no();
	}
	public  int no()
	{
		
		if(i==1)
			{System.out.println("!st case");
			return 1;
			}
		else
			return 2;
	}
	

}
