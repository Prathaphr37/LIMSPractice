package rupesh_programs;

import java.util.Scanner;
//reverse the given string and check whether it is palindrome or not using while loop
public class PalindromeWhileLoop {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = sc.next();
		String reverse="";
		int i=s.length()-1;
		while (i>=0) {
			reverse=reverse+s.charAt(i);
			i--;
		}
		
		System.out.println(reverse);
		
		//for palindrome check
		if (reverse==s) {
			System.out.println(s +"  is palindrome");
		} else {
			System.out.println(s +"  is not palindrome");
		}
	}

}
