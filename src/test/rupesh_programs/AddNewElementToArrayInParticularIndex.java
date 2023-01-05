package rupesh_programs;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewElementToArrayInParticularIndex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the a array");
		int c = sc.nextInt();
		int[] a = new int[c];
		System.out.println("add elements to array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int ln = a.length;

		int[] b = new int[ln + 1];
		System.out.println("enter the element value to be added");
		int value = sc.nextInt();
		System.out.println("enter the index where to be adding");
		int index = sc.nextInt();
		int j = 0;
		for (int i = 0; i < b.length; i++,j++) {
			if (i == index) {
				b[i]=value;
				i++;
			}
			b[i] = a[j];

		}

		System.out.println(Arrays.toString(b));
	}
}
