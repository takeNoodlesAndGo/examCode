package tencent;

import java.util.Scanner;

public class Main1 {
	//ͨ��70����һ��͵���ķ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();//m�ķ�ΧΪn+1~2*n;
		scan.nextLine();
		System.out.println(2*maxPrime(n));
	}
	public static int maxPrime(int num) {
		int i = num;
		while(i>1){
	        int m=2,n=i-1;
	        while (m<=n) {
	        	if (m*n==i) {
	        		break;
	        	}
	        	else if (m*n>i) {
	                n--;
	            }
	            else {
	                m++;
	            }
	        }
	        if (m>n) {
	            return i;
	        }
	        i--;
	    }
	    return 1;
	}
}
