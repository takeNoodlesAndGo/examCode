package meituan;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	//����9-6�ű��Ե�һ��
	//��ĿҪ��:����һ����������߱����еĽڵ�����·��
	//�������е�����Ҫ��һ���ٻص�ԭ�㣬��ô����2*(n-1)�����ǵ���һ����֮������Ҫ�ٻ����������󵽴�ĵ������Զ��
	//��Զ�㼴��Զ����ȣ����ֻҪ���������ȼ���
	//�����Ϊ2*(n-1)-���	
	//�ù�����������ҳ���ȼ���
	
	
	
	//��Ŀ�Ƚϼ򵥣����ǲ��������Լ�˼ά�Ķ�ʽ����������ʵ�ܼ�.

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
