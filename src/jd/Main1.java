package jd;

import java.util.Scanner;

public class Main1 {
	//京东第二题
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[][] pro = new int[n][3];
		for(int i=0;i<n;i++ ) {
			pro[i][0] = scan.nextInt();
			pro[i][1] = scan.nextInt();
			pro[i][2] = scan.nextInt();
			scan.nextLine();
		}
		int res = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(pro[j][0]>pro[i][0]&&pro[j][1]>pro[i][1]&&pro[j][2]>pro[i][2]) {
					res++;
					break;
				}
			}
		}
		System.out.println(res);
	}
}
