package zhaoyinxinzhongka;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		int num = 0;
		for(int i =1;i<=n;i++) {
			if(isGood(i)) {
				num++;
			}
		}
		System.out.println(num);
	}

	private static boolean isGood(int i) {
		// TODO Auto-generated method stub
		String str = ""+i;
		char[] chs = str.toCharArray();
		for(int j =0;j<str.length();j++) {
			if(chs[j]=='2')
				chs[j] = '5';
			else if(chs[j]=='3'||chs[j]=='4'||chs[j]=='7'){
				return false;
			}else if(chs[j]=='5') {
				chs[j] = '2';	
			}else if(chs[j]=='6') {
				chs[j] = '9';
			}else if(chs[j]=='9')
				chs[j] = '6';
		}
		String temp = new String(chs);
		if(temp.equals(str))
			return false;
		return true;
	}

}

