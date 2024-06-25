abstract class shape{
	double height;
	double width;

	shape(double h, double w)
	{
		height = h;
		width = w;
	}

	abstract double area();
	final void msg()
	{
		System.out.println("Welcome to the shape creater");
	}
}

class rectangle extends shape
{
	double depth;

	rectangle(double h, double w, double d)
	{
		super(h, w);
		depth = d;
	}

	double area()
	{
		System.out.print("Area of rectangle is ");
		return (width * height);
	}

	void mydepth()
	{
		System.out.println("My depth is " + depth);
	}

	void msg()
	{
		System.out.println("rectangle shape creater");
	}
}

class triangle extends shape
{
	String color;

	triangle(double h, double w, String c)
	{
		super(h, w);
		color = c;
	}

	double area()
	{
		System.out.print("Area of triangle is ");
		return (width * height * 0.5);
	}

	void mycolor()
	{
		System.out.println("triangle color is " + color);
	}
}

public class subfig
{
	public static void main(String args[])
	{
		double w = 4.2;
		double h = 53.4;
		double d = 52.6;
		String c = "Yellow";
		rectangle r = new rectangle(h, w, d);
		triangle t = new triangle(h, w, c);

		shape s;
		s = r;
		System.out.println(s.area());
		r.mydepth();
		s = t;
		System.out.println(s.area());
		t.mycolor();
	}
}