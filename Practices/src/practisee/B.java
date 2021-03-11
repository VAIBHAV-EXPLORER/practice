package practisee;
class A
{
	 void m1()
	{
		System.out.println("A.m1");
	}
	void m2()
	{
		System.out.println("A.m2");
	}
}
public class B extends A{
	void m1()
	{
		System.out.println("B.m1");
	}
	public static void main(String args[])
	{
		B ob=new B();
		ob.m1();
		ob.m2();
		
		A a=new B();
		a.m1();// if m1 of A is private then here it will be a error in this line
		a.m2();
		
		A k=new A();
		k.m2();
	}
}
