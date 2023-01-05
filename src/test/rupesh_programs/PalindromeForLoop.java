package rupesh_programs;

import java.util.Scanner;

//reverse the given string and check whether it is palindrome or not using for loop
public class PalindromeForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = sc.next();
		String reverse="";
		for (int i = s.length()-1; i >=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		
		System.out.println(reverse);
		
//		for palindrome check
		if (reverse==s) {
			System.out.println(s +"  is palindrome");
		} else {
			System.out.println(s +"  is not palindrome");
		}
	}
}
