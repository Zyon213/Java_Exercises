class factor{
	int fct(int i)
	{
		int res;

		if (i == 1)
			return 1;
		res = fct(i - 1) * i;
		return res;
	}
}

public class fact
{
	public static void main(String args[])
	{
		factor f = new factor();
		System.out.println("Factorial of " + 3 + " is " + f.fct(3));
		System.out.println("Factorial of " + 4 + " is " + f.fct(4));
		System.out.println("Factorial of " + 5 + " is " + f.fct(5));
	}
}