package meituan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	//美团9-6号笔试第一题
	//题目要求:给出一个树，求解走遍所有的节点的最短路径
	//假设所有的树都要走一遍再回到原点，那么就是2*(n-1)，但是到达一个点之后则不需要再回来，因此最后到达的点就是最远点
	//最远点即最远的深度，因此只要求出树的深度即可
	//最后结果为2*(n-1)-深度	
	//用广度优先搜索找出深度即可
	
	
	
	//题目比较简单，还是不能陷入自己思维的定式，跳出来其实很简单.

	public static int len = -1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		boolean[][] arr = new boolean[n+1][n+1];
		for(int i =0;i<n-1;i++) {
			int k =scan.nextInt();
			int m = scan.nextInt();
			arr[k][m] = true;
			arr[m][k] = true;
			scan.nextLine();
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		while(!queue.isEmpty()) {
			len++;
			int size = queue.size();
			for(int i =0;i<size;i++) {
				int k = queue.poll();
				for(int j =1;j<=n;j++) {
					if(arr[k][j]||arr[j][k]) {
						arr[k][j] = false;
						arr[j][k] = false;
						queue.add(j);
					}
				}
			}
		}
		System.out.println(2*(n-1)-len);
	}
	
}
