package kuaishou;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int P = scan.nextInt();
		int H = scan.nextInt();
		int W = scan.nextInt();
		int[] nums = new int[N];
		for(int i =0;i<N;i++) {
			nums[i] = scan.nextInt();
		}
		int begin = 1;
		int max = Math.max(H,W);
		while(begin<=max) {
			if(isTrue(begin, N, P, H, W, nums))
				begin++;
			else {
				scan.nextLine();
				System.out.println(begin-1);
				return ;
			}
		}
		scan.nextLine();
		System.out.println(begin-1);
	}
	private static boolean isTrue(int mid, int n, int p, int h, int w,int[] nums) {
		if(mid>w||mid>h)
			return false;
		// TODO Auto-generated method stub
		int hnum = h/mid;
		int lines = hnum*p;
		for(int i =0;i<nums.length;i++) {
			int line = nums[i]/(w/mid);
			if(lines<=0)
				return false;
			else {
				lines -=line;
			}
		}
		if(lines<0)
			return false;
		return true;
	}

}
