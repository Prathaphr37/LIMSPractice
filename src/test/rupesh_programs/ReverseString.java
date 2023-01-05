package rupesh_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the sentence");
	String s1 = sc.nextLine();
	String s2=" ";
	String[] a = s1.split(s2);
	String rev="";
	ArrayList arr = new ArrayList<>();
	for (int i = a.length-1; i >=0; i--) {
		arr.add(a[i]);
	}
	System.out.println(arr);
	}
}
