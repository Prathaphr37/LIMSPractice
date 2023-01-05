package rupesh_programs;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 6, 10, 12, 14, 18, 20 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length-1; i++) {
			int temp = a[i];
			for (; temp < a[i+1]; temp++) {
				if (temp!=a[i]) {
					System.out.println(temp);
				}
				
			}
		}
	}
}
