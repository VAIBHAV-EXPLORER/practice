package practisee;

import java.util.Scanner;

public class String_palin_recursion {
	public static void main(String[] args) { 
	    Scanner sc=new Scanner(System.in);
	    String A=sc.next();        
	    String result = isPalindrome(A, 0, A.length()-1);        
	    System.out.println(result); 
	    sc.close();
	}   

	public static String isPalindrome(String word, int first, int last){       

	    if (word == null || "".equals(word))
	       return "The string is null or empty.";     

	    return isPalindRecursive(word.toLowerCase(), first, last);
	}    


	private static String isPalindRecursive(String word, int first, int last){                

	    if (first >= last)
	        return "Yes";              

	    if (word.charAt(first) != word.charAt(last))
	        return "No";

	    return isPalindRecursive(word, ++first, --last); 
	}


}




