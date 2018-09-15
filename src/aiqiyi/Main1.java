package aiqiyi;

import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int[] pre = new int[3];
		int[] back = new int[3];
		for(int i=0;i<3;i++) {
			pre[i] = (int)(str.charAt(i)-'0');
			back[i] = (int)(str.charAt(i+3)-'0');
		}
		boolean flag = false;//代表前面大于后面
		int sum1 = 0;
		for(int i = 0;i<3;i++) {
			sum1 = sum1+pre[i]-back[i];
		}
		if(sum1==0) {
			System.out.println(0);
			return ;
		}
		if(sum1<0) {
			flag = true;
			sum1 = - sum1;
		}
		boolean[] pp = new boolean[3];
		boolean[] ff = new boolean[3];
		int num = 0;
		if(flag==false) {//调整为前面矩阵小于等于后面的矩阵
			for(int i =0;i<3;i++) {
				int temp = pre[i];
				pre[i] = back[i];
				back[i] = temp;
			}
		}
		while(sum1!=0) {//后面大于前面，前面+，后面减
			int max1 = 0;
			int index1 = 0;
			for(int i =0;i<3;i++) {
				if(!pp[i]&&max1<(9-pre[i])) {
					max1 = 9-pre[i];
					index1 = i;
				}
			}
			int max2 = 0;
			int index2 = 0;
			for(int i =0;i<3;i++) {
				if(!ff[i]&&max2<back[i]) {
					max2 = back[i];
					index2 = i;
				}
			}
			if(max1>max2) {
				if(sum1<=max1) {
					num++;
					break;
				}else {
					sum1 -= max1;
					num++;
				}
				pp[index1] = true;
			}else {
				if(sum1<=max2) {
					num++;
					break;
				}else {
					sum1 -= max2;
					num++;
				}
				ff[index2] = true;
			}	
		}
		System.out.println(num);
	}
}

