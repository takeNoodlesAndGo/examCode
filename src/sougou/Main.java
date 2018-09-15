package sougou;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] arrs = new int[n];
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 0 ; i < n ; i++) {
			arrs[i] = scan.nextInt();
			if(arrs[i]>max) {
				max = arrs[i];
				index = i;
			}
			scan.nextLine();
		}
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=index;i<n;i++) {
			list.add(arrs[i]);
		}
		for(int i=0;i<index;i++) {
			list.add(arrs[i]);
		}
		int sum1 = 0;
		int sum2 = 0;
		while(!list.isEmpty()) {
			if(list.get(0)<list.getLast()) {
				sum1 += list.removeLast();
			}else {
				sum1 += list.removeFirst();
			}
			if(list.isEmpty())
				break;
			if(list.get(0)<list.getLast()) {
				sum2 += list.removeLast();
			}else {
				sum2 += list.removeFirst();
			}
		}
		int sum = sum2>sum1?(sum2-sum1):(sum1-sum2);
		System.out.println(sum);
	}

}
