class shape
{
	int height;
	int width;

	shape(int h, int w)
	{
		height = h;
		width = w;
	}

	int area()
	{
		System.out.println("Area of shape is not defined");
		return 0;
	}
}

class Rectangle extends shape
{
	Rectangle(int h, int w)
	{
		super(h, w);
	}

	int area()
	{
		System.out.print("Area of Rectangle is ");
		return height * width;
	}
}

class Triangle extends shape
{
	Triangle(int h, int w)
	{
		super(h, w);
	}

	int area()
	{
		System.out.print("Area of triangle is ");
		return (int)(height * width * 0.5);
	}
}

public class figure
{
	public static void main (String args[])
	{
		int w = 5;
		int h = 4;
		shape sp = new shape(h, w);
		Rectangle r = new Rectangle(h, w);
		Triangle t = new Triangle(h, w);

		sp.area();
		System.out.println(r.area());
		System.out.println(t.area());

	}
}