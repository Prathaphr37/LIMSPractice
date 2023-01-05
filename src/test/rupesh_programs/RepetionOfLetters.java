package rupesh_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;

//program to remove the duplicates in a word and count how many time it occures in the word
public class RepetionOfLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();

		LinkedHashSet<Character> h = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			h.add(s.charAt(i));
		}
		System.out.println(h);

		for (Character lv : h) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (lv==(s.charAt(i))) {
					count++;
				}
			}
			System.out.println(lv + " occures --->" + count + "  times");
		}
		
	}
}
