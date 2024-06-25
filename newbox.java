class box
{
	private double width;
	private double height;
	private double depth;
	double val;

	box()
	{
		width = -1;
		height = -1;
		depth = -1;
	}
	box(box mybox)
	{
		width = mybox.width;
		height = mybox.height;
		depth = mybox.depth;
	}

	box(double len)
	{
		width = height = depth = len;
	}

	box(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	box copyBox(double w, double h, double d)
	{
		box mybox = new box(w, h, d);
		return mybox;
	}

	double volume()
	{
		return (width * height * depth);
	}

	void showAll()
	{
		System.out.println("show all " + width + " " + height + " " + depth);
	}
}

class boxWeight extends box
{
	double mass;

	boxWeight()
	{
		super();
		mass = -1;
	}

	boxWeight(boxWeight bw)
	{
		super(bw);
		mass = bw.mass;
	}
	boxWeight(double w, double h, double d, double m)
	{
		super(w, d, h);
		mass = m;
	}

	boxWeight(double l, double m)
	{
		super(l);
		mass = m;
	}

	boxWeight(double m)
	{
		super();
		mass = m;
	}

	double weight()
	{
		return mass;
	}
}

class boxColor extends box
{
	double color;
	double val;

	boxColor(double w, double h, double d, double c)
	{
		super(w, h, d);
		color = c;
	}
	boxColor(boxColor bc)
	{
		super(bc);
		color = bc.color;
	}

	double viewColor()
	{
		return color;
	}

	void changeVal(double v)
	{
		super.val = 43;
		val = v;
		System.out.println("super var is " + super.val);
		System.out.println("var is " + val);
	}
	void showAll()
	{
		super.showAll();
		System.out.println("show all " + color);
	}
}

public class newbox
{
	public static void main(String args[])
	{
		box b = new box(3, 4, 6);
		// boxWeight bw = new boxWeight(b, 54.2);
		// boxWeight bw1 = new boxWeight(8, 4, 6, 54.2);

		// b = bw;
		// System.out.println("volume of box is " + b.volume());
		// System.out.println("volume of box is " + bw.volume());
		// System.out.println("weight of box is " + bw.weight());
		// b = bw1;
		// System.out.println("volume of box is " + b.volume());
		
		boxWeight bw2 = new boxWeight(21.23);
		System.out.println("volume of box is " + bw2.volume());
		
		boxWeight bw3  = new boxWeight(6, 12.35);
		System.out.println("volume of box is " + bw3.volume());
		
		box b2 = new box();
		b2 = bw3;
		System.out.println("volume of box is " + b2.volume());

		boxColor bc = new boxColor(4, 5, 2, 4.24);
		boxColor bc1 = new boxColor(bc);
		System.out.println("color of box is " + bc1.viewColor());
		bc1.changeVal(87);

		bc1.showAll();

		box b4 = new box();

		b4 = bc1;
		b4.showAll();
		b4.val = 65;

		
	}
}