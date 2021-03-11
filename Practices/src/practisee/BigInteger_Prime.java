package practisee;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger_Prime {
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String n = scanner.nextLine();
	        BigInteger bn=new BigInteger(n);
	    if(bn.isProbablePrime(1)){
	        System.out.println("prime");
	    }
	    else{
	        System.out.println("not prime"); 
	    }

	        scanner.close();
	    }
	}


