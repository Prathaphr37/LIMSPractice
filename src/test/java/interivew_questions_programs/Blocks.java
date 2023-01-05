package interivew_questions_programs;

public class Blocks {

	Blocks()
	{
		System.out.println("constructotr");
	}
	
	{
		System.out.println("non staic");
	}
	
	static 
	{
		Blocks.main(null);
		System.out.println("static");
	}
	
	public static void main(String[] args) {
		System.out.println("hi main");
		new Blocks();
	}
}
