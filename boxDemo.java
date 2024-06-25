class box{
	double		width;
	double		height;
	double		length;

	// box()
	// {
	// 	System.out.println("class Constructor");
	// 	width = 43;
	// 	height = 4;
	// 	length = 12;
	// }
	box(double w, double h, double l)
	{
		width = w;
		height = h;
		length = l;
	}

	void boxArea()
	{
		System.out.print("Area of box is ");
		System.out.println(width * height);
	}

	void boxVolume()
	{
	
		System.out.print("Volume of the box is ");
		System.out.println(width * height * length);
	}

	double area()
	{
		return (width * height);
	}

	double volume()
	{
		return (width * height * length);
	}

	void setDim(double w, double h, double l)
	{
		this.width = w;
		this.height = h;
		this.length = l;
	}
}

class boxDemo
{
	public static void main(String args[])
	{
		box mybox =  new box(4, 5, 6);
		
		// mybox.height = 421.5352f;
		// mybox.width = 53.4234f;
		// mybox.length = 53.4234f;

		System.out.println("width " + mybox.width);
		System.out.println("height " + mybox.height);
		System.out.println("length " + mybox.length);
		// mybox.boxArea();
		// mybox.boxVolume();
		// System.out.println("The return value of area is " + mybox.area());
		// System.out.println("The return value of volume is " + mybox.volume());

		// double l = 43;
		// double w = 5;
		// double h = 67;
		// mybox.setDim(w, h, l);
		// mybox.boxArea();
		// mybox.boxVolume();
	
	}
}


