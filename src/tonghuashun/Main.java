package tonghuashun;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int num = scan.nextInt();
		scan.nextLine();
		String str = scan.nextLine();
		int max = 0;
		Queue<Integer> queue = new LinkedList<Integer>();
		int index = 0;
		int sum = 0;
		while(index<size) {
			if(str.charAt(index)=='1') {
				sum++;
			}else {//Îª0½øÐÐ²¹³ä
				if(num!=0) {
					queue.add(index);
					num--;
					sum++;
				}else {
					queue.add(index);
					int temp = queue.poll();
					sum = index - temp;
				}
			}
			index++;
			if(max<sum)
				max = sum;
		}
//		return max;
		System.out.println(max);
	}

}
