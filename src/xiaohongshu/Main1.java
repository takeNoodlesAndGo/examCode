package xiaohongshu;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n==0) {
			System.out.println(0);
			return ;
		}
		if(n<0) {
			System.out.println(0);
			return ;
		}
		int[] dp5 = new int[n+1];
		for(int i=1;i<=n;i++) {
			int count=0;
			int k = i;
			while(k%5==0) {
				k = k/5;
				count++;
			}
			dp5[i] = dp5[i-1]+count;
		}
		int count5 = 0;
		for(int i =1;i<=n;i++) {
			count5 +=dp5[i];
		}
		System.out.println(count5);
	}

}
