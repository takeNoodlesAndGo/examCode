package xiecheng;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();
		scan.nextLine();
		int count = 0;
	    while(num!=0){
	        count++;
	        num = num&(num-1);
	    }
	    System.out.println(count);
	}

}
