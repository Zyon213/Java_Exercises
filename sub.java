class A
{
	private int a;
	int b;

	void viewAB()
	{
		System.out.println("A and B " + a + " " + b);
	}
}

class B extends A
{
	int c;

	void viewABC()
	{
		System.out.println("A and B and C from sub " + a + " " + b + " " + c);
	}
}

public class sub
{
	public static void main(String args[])
	{
		A aa = new A();
		B bb = new B();

		aa.a = 6;
		aa.b = 9;

		aa.viewAB();

		bb.a = 65;
		bb.b = 87;
		bb.c = 31;

		bb.viewABC();
	}
}