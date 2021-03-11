package practisee;

public class naturnal_recur {
	static String s="";
	public static String recur(int n)
	{
	if(n==1) {
		//System.out.print(n);
		return n+" "+s;
	}
	else{
		s=n+" "+s;
		//System.out.print(n+"  ");
		return recur(n-1);
	}
	}

	public static void main(String[] args) {
		System.out.print(recur(10));

	}

}
