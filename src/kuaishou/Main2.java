package kuaishou;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char[] strs = str.toCharArray();
		int len  = str.length();
		if(len==0)
			System.out.println(0);
		int[][] dp = new int[len][len];
		for(int i =len-1;i>=0;i--) {
			dp[i][i] = 1;
			for(int j =i+1;j<len;j++) {
				if(strs[i]==strs[j]) {
					dp[i][j] = dp[i+1][j-1]+2;
				}else {
					dp[i][j] = Math.max(dp[i][j-1], dp[i+1][j]);
				}
			}
		}
		System.out.println(dp[0][len-1]);
	}
}
