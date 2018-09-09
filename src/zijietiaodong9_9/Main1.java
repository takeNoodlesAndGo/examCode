package zijietiaodong9_9;

import java.util.HashMap;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] arrays = str.toCharArray();
		int maxValue = Integer.MIN_VALUE;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int begin = 1;
		for (int i = 1; i <= arrays.length; i++) {
			char temp = arrays[i - 1];
			if (map.containsKey(temp) && map.get(temp) >= begin) {
				begin = map.get(temp) + 1;
				map.put(temp, i);
			} else {
				map.put(temp, i);
				maxValue = Math.max(maxValue, i - begin + 1);
			}
		}
		System.out.println(maxValue);
	}
}

