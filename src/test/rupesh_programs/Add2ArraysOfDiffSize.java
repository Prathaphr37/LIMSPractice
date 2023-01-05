package rupesh_programs;

import java.util.Scanner;
//program for adding the 2 arrays of different sizes
public class Add2ArraysOfDiffSize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the a array");
		int c = sc.nextInt();
		System.out.println("enter the size of the b array");
		int d = sc.nextInt();
		
		int[] a = new int[c];
		int[] b = new int[d];
		
		System.out.println("add values to a array");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("add values to b  array");
		for (int j = 0; j < b.length; j++) {
			b[j]=sc.nextInt();
		}
		
		int length= a.length;
		
		if (a.length<b.length) {
			length=b.length;
		}
		System.out.println("after adding the a and b array");
		
		for (int i = 0; i < length; i++) {
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				
				if (a.length>b.length) 
					System.out.println(a[i]);
				else
					System.out.println(b[i]);
			}
			
		}
	
				
		
	}
}
