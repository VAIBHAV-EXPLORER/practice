package practisee;
	import java.util.*;
	public class CustomException {
		@SuppressWarnings("resource")
		public static void main(String args[])
		{
			Scanner in=new Scanner(System.in);
			int age=in.nextInt();
			if(age<18) {
				System.out.println("le");
				System.out.println("Y");
				throw new YoungerAge("You are not eligible to vote");
				//after this no statement should be written as it generates compile time error
			
			}else
				System.out.println("You can vote");
			in.close();
		}

	}

