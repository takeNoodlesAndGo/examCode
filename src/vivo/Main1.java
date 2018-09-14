package vivo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
				Collections.sort(list, new Comparator<String>() {
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						if(o1.length()<o2.length())
							return -1;
						else if(o1.length()>o2.length()) {
							return 1;
						}else {
							return o1.compareTo(o2);
						}
					}
				});
	}

}
