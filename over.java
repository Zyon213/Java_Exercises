class test{
	void calc()
	{
		System.out.println("void");
	}

	void calc(int i)
	{
		System.out.println("Int " + i);
	}

	void calc(double d)
	{
		System.out.println("double " + d);
	}

	void calc(float f)
	{
		System.out.println("Float " + f);
	}
	void calc(int i, int j)
	{
		System.out.print("Int1 " + i);
		System.out.print("Int2 " + j);
		System.out.println(" Int sum i + j " + (i + j));
	}
}


class over{
public static void main(String args[])
{
	test mytest = new test();

	mytest.calc();
	mytest.calc(5);
	mytest.calc(7, 8);
	mytest.calc(12.2);
	mytest.calc(54.2f);
}
}