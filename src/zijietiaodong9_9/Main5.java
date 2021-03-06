package zijietiaodong9_9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用dfs的思路进行暴力搜索，然后会出现循环，用一个set保存已经循环过的节点，
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int m = scan.nextInt();
		scan.nextLine();
		boolean[][] arrs = new boolean[n+1][n+1];
		for(int i =0;i<m;i++) {
			int key = scan.nextInt();
			int value = scan.nextInt();
			arrs[key][value] = true;
		}
		if(m<n-1) {//关注的数量小于n-1.则肯定不能全部关注
			System.out.println(0);
			return ;
		}
		HashSet<Integer> set = null;
		Stack<Integer> stack = null;
		int num = 0;
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
			if(set.size()==n-1) {//set的大小为n-1说明构成达人
				num++;
			}
		}
		System.out.println(num);
	}

}
