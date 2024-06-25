class test{
	int height;
	int width;

	test(int h, int w)
	{
		height = h;
		width = w;
	}

	boolean compTest(test t)
	{
		if (height == t.height && width == t.width)
			return true;
		else 
			return false;
	}
}

class equal
{
	public static void main(String args[])
	{
		test t1 = new test(4, 6);
		test t2 = new test(4, 6);
		test t3 = new test(8, 3);

		System.out.println("boxes are " + t1.compTest(t2));
		System.out.println("boxes are " + t1.compTest(t3));
	}
}