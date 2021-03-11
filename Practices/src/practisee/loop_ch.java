package practisee;

public class loop_ch {
	 static int  add(int a,int b)
	{
		return a+b;
	}
	 public static void Strcon()
	 {
		 int n=10;
		 String s=Integer.toString(n);
		 System.out.println(s);
		 int k=Integer.parseInt(s);
		 System.out.println(k+k);
		 System.out.println(s.charAt(0));
		 System.out.println(s.length());
		 
	 }
	public static void main(String[] args) {
	/*	int n=0;
		while(n<9)
		{
			if(n==3)
				break;
			System.out.print(n+"  ");
			n++;
		}
		if(true)
		{
			System.out.print(" Hello ");
		}
		*/
		//System.out.print("yes");
		//add(10,20);
		Strcon();
	}

}
