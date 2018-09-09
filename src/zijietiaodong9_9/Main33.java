package zijietiaodong9_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		System.out.println(restoreIpAddresses(string).size());
	}

	public static List<String> restoreIpAddresses(String s) {
		List<String> ans = new ArrayList<String>();
		restoreIpAddresses(s, ans, 0, "", 0);
		return ans;
	}

	private static void restoreIpAddresses(String str, List<String> answer, int idx, String restore, int count) {
		if (count > 4)
			return;
		if (count == 4 && idx == str.length()) {
			answer.add(restore);
		}
		for (int i = 1; i < 4; i++) {
			if (idx + i > str.length())
				break;
			String ip = str.substring(idx, idx + i);
			if ((ip.length() != 1 && ip.startsWith("0")) || (ip.length() == 3 && Integer.parseInt(ip) >= 256)) {
				continue;
			}
			restoreIpAddresses(str, answer, idx + i, restore + ip + (count == 3 ? "" : "."), count + 1);
		}
	}
}
