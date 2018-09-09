package zijietiaodong9_9;

import java.util.Scanner;

public class Main3 {
	public static int num = 0;
	public static int len = 0;//…Ó∂»
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		if(str==null||str.length()<4||str.length()>12) {
			System.out.println(0);
			return ;
		}
		if(str.startsWith("0")) {
			System.out.println(0);
			return ;
		}
		dfs(str);
		System.out.println(num);
	}
	public static void dfs(String str) {
		if(str==null||str.length()==0) {
			if(len==4) {
				num++;
			}
			return ;
		}
		for(int i=0;i<3&&i<str.length();i++) {
			String temp = str.substring(0, i+1);
			int n = Integer.parseInt(temp);
			if(0<=n&&n<=255) {
				if(len>=4)
					return ;
				len++;
				dfs(str.substring(i+1));
				len--;
			}
		}
	}

}
