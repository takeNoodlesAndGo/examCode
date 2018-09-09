package zijietiaodong9_9;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int[] a = new int[n];
		for(int i =0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		scan.nextLine();
		System.out.println(utf(a));
	}
	public static int utf(int[] data) {
		int count = 0;
		for(int a:data) {
			if(count!=0) {
				if((a>>5)==0b110)
					count = 1;
				else if((a>>4)==0b1110)
					count = 2;
				else if((a>>3)==0b11110)
					count = 3;
				else if((a>>7)!=0)
					return 0;
				continue;
			}
			if((a>>6)!=0b10)
				return 0;
			count--;
		}
		return 1;
	}
}
