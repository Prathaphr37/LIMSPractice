package rupesh_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;
//program to remove the duplicate words in a sentence and count the number of times word is occured
public class RepetitionOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence");
		String s1 = sc.nextLine();
		String s2=" ";
		String[] a = s1.split(s2);
		
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		for (int i = 0; i < a.length; i++) {
			h.add(a[i]);
		}
		
		System.out.println(h);
		System.out.println("----------");
		
		for (String lv:h) {
			int count=0;
			
			for (int j = 0; j < a.length; j++) {
				if (lv.contains(a[j])) {
					count++;
				}
			}
			
			System.out.println(lv+ "----->occures:-"+count+" times");
		}

	}
}
