package practisee;

import java.util.*;

public class Lowest_Triangle {
	 static int lowestTriangle(int base, int area){
	        // Complete this function
	        int height=(int)Math.ceil ((double)2*area/base);
	        System.out.println(height);
	        
	        return height;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int base = in.nextInt();
	        int area = in.nextInt();
	        int height = lowestTriangle(base, area);
	        System.out.println(height);
	        in.close();
	    }


}
