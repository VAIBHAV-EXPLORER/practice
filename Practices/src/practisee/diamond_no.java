package practisee;
import java.util.*;
public class diamond_no {
	public static void main(String[] args)
		   {
		       Scanner sc = new Scanner(System.in);
		    
		       System.out.println("Enter the number of rows: ");
		       int rows = 5;  
		       for (int i=1; i<= rows ; i++) { 
		    	   for (int j = rows; j > i ; j--) {
		               System.out.print(" ");
		           }
		           System.out.print(i);
		           for (int k = 1; k < 2*(i -1) ;k++) {
		        	   System.out.print(" "); 
		        	   }
		           if( i==1) {
		        	   System.out.println(); 
		        	   } 
		           else { 
		        	   System.out.println(i);
		        	   } 
		           } 
		       for (int i=rows-1; i>= 1 ; i--)
		           {
		           for (int j = rows; j > i ; j--) {
		               System.out.print(" ");
		           }
		           System.out.print(i);
		           for (int k = 1; k < 2*(i-1) ;k++) {
		               System.out.print(" ");
		           }
		           if( i==1)
		               System.out.println();
		           else {
		               System.out.println(i);
		       }
		       sc.close();
		   }
		   }
	}
