package rupesh_programs;

import java.util.Arrays;
import java.util.Scanner;
//program to delete value 
public class DeleteElementInArray {

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
		int[] b = new int[ln-1];
		
		System.out.println("enter the index to be deleted");
		int index=sc.nextInt();
		
		int j=0;
		for (int i = 0; i < b.length; i++,j++) {
			
			if (i>=index) {
				b[i]=a[j+1];
			}
			else if (i<index) {
				b[i]=a[j];
			}
		}
			System.out.println(Arrays.toString(b));
	}
}
