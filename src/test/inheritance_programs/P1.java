package inheritance_programs;

public class P1 {
	int a;
	int b;

	public P1() {

		System.out.println("no argument constructor");
	}

	public P1(int a, int b) {
		this();
		this.a = a;
		this.b = b;
		System.out.println(a + b);
	}
	
	{
		System.out.println("non static block");
	}
	public static void main(String[] args) {
		P1 ob = new P1(100, 200);
	}
}
