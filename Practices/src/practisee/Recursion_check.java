package practisee;

public class Recursion_check {
	public int trial(int n)
	{
		if(n==1)
			return 1;
		int k= n+trial(n-1);
		System.out.println("hello");
		System.out.println(k);
		return k;
	}

	public static void main(String[] args) {
		new Recursion_check().trial(5);
		//System.out.println(new Recursion_check().trial(3));
	}

}
