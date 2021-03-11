package practisee;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 
  https://www.geeksforgeeks.org/microsoft-interview-experience-for-software-engineering-internship-2019/
*/
public class FIrst_repeat {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(map.containsKey(ch)) {
				System.out.println("The first repeated character is "+ch);
				break;
			}else {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			}
			
			/*if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
				if(map.get(ch)==2)
				{
					System.out.println("The first repeated character is "+ch);
					break;
				}
			}
			else
				map.put(ch, 1);*/
		}
		in.close();
	}

}
