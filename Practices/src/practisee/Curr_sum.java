package practisee;

import java.util.*;
import java.util.HashMap;

public class Curr_sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			String curr[] = new String[n];
			int ar[] = new int[n];
			for (int i = 0; i < n; i++) {
				curr[i] = in.next();
			}
			for (int i = 0; i < n; i++) {

				ar[i] = in.nextInt();
			}
			System.out.print(Arrays.toString(curr) + "  ");
			System.out.println();
			System.out.print(Arrays.toString(ar) + "  ");
			System.out.println();
			Map<String, Integer> map = new HashMap<>();
			int sum = 0;
			for (int i = 0; i < n; i++) {
				String st = curr[i];
				if (map.containsKey(st)) {
					sum = ar[i] + map.get(st);
					map.put(st, sum);
				} else {
					map.put(st, ar[i]);
					sum = 0;
				}
			}
			System.out.println(map);
		}
	}

}
