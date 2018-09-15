package aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int p = scan.nextInt();
		int[] nums = new int[n+1];
		scan.nextLine();
		for(int i =1;i<=n;i++) {
			nums[i] = scan.nextInt();
		}
		scan.nextLine();
		for(int i=0;i<m;i++) {
			String str = scan.nextLine().trim();
			String[] strs = str.split(" ");
			int num = Integer.parseInt(strs[1]);
			if(strs[0].equals("A")) {
				nums[num]++;
			}else {
				nums[num]--;
			}
		}
		int k = nums[p];
		Arrays.sort(nums);
		int index = 1;
		for(int i =n;i>0;i--) {
			if(nums[i]!=k) {
				index++;
			}else {
				break;
			}
		}
		System.out.println(index);
	}

}
