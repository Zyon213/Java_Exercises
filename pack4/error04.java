package pack4;

public class error04 {

	public error04() {
		// System.out.println("default");
	}

	static void tryMe() throws IllegalAccessException
	{
			System.out.println("Inside try me");
			throw new IllegalAccessException("Demo");
}