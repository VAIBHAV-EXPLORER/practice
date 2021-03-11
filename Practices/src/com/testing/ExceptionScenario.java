package com.testing;

public class ExceptionScenario extends Object{

	@SuppressWarnings("finally")
	public static String checker()
	{
		try
		{
			return "app";
		}
		finally
		{
			return "Gotcha";
		}
	}
	public static String checker2()
	{
		try
		{
			return "macro";
		}
		finally
		{
			System.out.println("Still");
		}
	}
	public static void checker3()
	{
		try
		{
			System.out.println("ABC");
		}
		catch(Exception ex)
		{
		}
	}
	public static void main(String[] args) {
//		try {
//			System.out.println("A");
//			int a=10/0;
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//		finally
//		{
//			System.out.println("C");
//		}
		//System.out.println(checker());
		//System.out.println(checker2());
		checker3();
	
	}
	
}
