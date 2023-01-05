package rupesh_programs;

import java.util.Scanner;

import org.testng.annotations.Test;

public class HappyNumber {

	@Test
	public void happyNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int happy = sc.nextInt();
		int num = happy;
		int sum = 0;
		int rem = 0;

		while (num > 1) {
			sum = 0;
			rem = 0;
			while (num > 0) {
				rem = num % 10;
				sum = sum + (rem * rem);
				num /= 10;
			}

			if (sum >= 1 && sum < 10) {
				num = sum;
				break;
			}
		}

		if (num == 1) {
			System.out.println(happy + "  is happy number");
		} else {
			System.out.println(happy+ "   is sad number");
		}
	}

}
