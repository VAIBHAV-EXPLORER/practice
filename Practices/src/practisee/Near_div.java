package practisee;

 class Near_div {
	public static int check(int n,int m)
	{
		int sum=(int)Math.ceil(n/(double)m);
		for(int i=1;i<=sum;i++)
		{
			int j=-i;
			if((n+i)%m==0)
			{
				return i;
			}
			else if((n+j)%m==0)
				return j;
		}
		return 0;
	}

	public static void main(String[] args) {
		int n=15;
		int m=6;
		int f=check(n,m);
		System.out.print(n+f);
	}
 }
class Trip
{
	public static void main(String args[])
	{
		System.out.println("2nd class ");
	}
}