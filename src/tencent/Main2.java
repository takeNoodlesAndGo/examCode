package tencent;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {
	//暴利做的，只能ace30，不清楚为什么
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		boolean[][] arrs = new boolean[n+1][n+1];
		for(int i =0;i<m;i++) {
			int m1 = scan.nextInt();
			int m2 = scan.nextInt();
			arrs[m1][m2] = true;
		}
		HashSet<Integer> set = null;
		Stack<Integer> stack = null;
		int[] xs = new int[n+1];
 		for(int i =1;i<=n;i++) {
 			set = new HashSet<Integer>();
			stack = new Stack<Integer>();
			stack.push(i);
			while(!stack.isEmpty()) {
				int size = stack.size();
				for(int k =0;k<size;k++) {
					int temp = stack.pop();
					for(int j=1;j<=n;j++) {
						if(j==i) //不处理自己
							continue;
						if(arrs[j][temp]&&!set.contains(j)) {
							set.add(j);
							stack.add(j);
						}
					}
				}
			}
			xs[i] = set.size();
		}
 		int[] ys = new int[n+1];
 		for(int i =1;i<=n;i++) {
 			set = new HashSet<Integer>();
			stack = new Stack<Integer>();
			stack.push(i);
			while(!stack.isEmpty()) {
				int size = stack.size();
				for(int k =0;k<size;k++) {
					int temp = stack.pop();
					for(int j=1;j<=n;j++) {
						if(j==i) //不处理自己
							continue;
						if(arrs[temp][j]&&!set.contains(j)) {
							set.add(j);
							stack.add(j);
						}
					}
				}
			}
			ys[i] = set.size();
		}
 		int num = 0;
 		for(int i =0;i<=n;i++) {
 			if(ys[i]>xs[i])
 				num++;
 		}
 		System.out.println(num);
	}
}
