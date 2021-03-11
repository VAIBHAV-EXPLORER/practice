package practisee;
class Aa
{
	static void m1()
	{
		System.out.println("A.m1");
		int k=12345;
		int r=k%1000;
		System.out.println(r);
	}
	void m2()
	{
		System.out.println("A.m2");
	}
}
public class C extends Aa{
	static void m1()
	{
		System.out.println("C.m1");
	}
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{
		C ob=new C();
		ob.m1();ob.m2();
		
		Aa a=new C();
		a.m1();
		a.m2();
	}
}


