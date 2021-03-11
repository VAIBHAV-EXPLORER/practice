package com.testing;

import java.util.Scanner;

public class StockPrice {
	public static int max_profit(int ar[]) {
		int max = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				max = Math.max(max, ar[j] - ar[i]);
			}
		}
		return max;
	}

	public static int profit2(int ar[]) {
		if (ar.length > 2) {
			int t = ar[0];
			int min = ar[0];
			int max = ar[1];
			for (int i = 1; i < ar.length; i++) {
				if (ar[i] - t > max - min) {
					max = ar[i];
					min = t;
				}
				if (ar[i] < t)
					t = ar[i];
			}
			return max-min;
		}
		else
			return 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
		System.out.println(max_profit(ar));
		System.out.println(profit2(ar));
		in.close();
	}

}
