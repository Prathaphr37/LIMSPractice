package rupesh_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class MaximumOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the word");
		String s = sc.next();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		int x = 0;
		char y = ' ';
		for (int i = 0; i < s.length(); i++) {
			lh.add(s.charAt(i));
		}

		System.out.println(lh);

		for (Character lv : lh) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (lv == s.charAt(i)) {
					count++;
				}
			}
			if (count > x) {
				x = count;
				y = lv;
			}
		}
		System.out.println(y + "  has occured maximum times i.e, ---->" + x+" times");
	}
}
