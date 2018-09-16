package zhaoyinxinzhongka;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine().trim();
		String line2 = scan.nextLine().trim();
		
		String[] l1s = line1.split(" ");
		String[] l2s = line2.split(" ");
		
		int[] g = new int[l1s.length];
		int[] s = new int[l2s.length];
		for(int i = 0; i < l1s.length; i++) {
			g[i] = Integer.parseInt(l1s[i]);
		}
		
		for(int j = 0; j < l2s.length; j++) {
			s[j] = Integer.parseInt(l2s[j]);
		}
		
		Arrays.sort(g);
		Arrays.sort(s);
		
		int ig = g.length - 1;
		int js = s.length - 1;
		
		int count = 0;
		
		while(ig >= 0 && js >= 0) {
			if(s[js] >= g[ig]) {
				count++;
				js--;
				ig--;
			}else {
				ig--;
			}
		}
		System.out.println(count);

	}
}

