package xiaohongshu;

import java.util.Scanner;

class ListNode {
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val = val;
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().trim();
		String[] strs = str.split(" ");
		int n = strs.length;
		int[] arrs = new int[n];
		for(int i =0;i<n;i++) {
			arrs[i] = Integer.parseInt(strs[i]);
		}
		ListNode head = new ListNode(arrs[0]);
		ListNode temp = head;
		for(int i =1;i<n;i++) {
			temp.next = new ListNode(arrs[i]);
			temp = temp.next;
		}
		int k = scan.nextInt();
		scan.nextLine();
		head = reverseKGroup(head, k);
		while(head!=null) {
			System.out.print(head.val+" ");
			head = head.next;
		}
	}
	public static  ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode i = head; i != null; n++, i = i.next);

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = fakeHead;
        for (ListNode tail = head; n >= k; n -= k) {
            for (int i = 1; i < k; i++) {
                ListNode next = tail.next.next;
                tail.next.next = pre.next;
                pre.next = tail.next;
                tail.next = next;
            }
            pre = tail;
            tail = tail.next;
        }
        return fakeHead.next;
    }

}
