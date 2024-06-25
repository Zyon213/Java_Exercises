class mybox{

	double 	width;
	double 	height;
	double 	depth;

	mybox()
	{
		width = -1;
		height = -1;
		depth = -1;
	}

	mybox(mybox box)
	{
		width = box.width;
		height = box.height;
		depth = box.depth;
	}

	mybox(double len)
	{
		width = height = depth = len;
	}

	mybox(double w, double h, double d)
	{
		width = w;
		height = h;
		depth = d;
	}

	double volume()
	{
		return width * height * depth;
	}
}

class cube
{
	public static void main(String args[])
	{
		mybox box = new mybox();
		System.out.println("volume is " + box.volume());

		mybox box1 = new mybox(5);
		System.out.println("volume is " + box1.volume());

		mybox box2 = new mybox(4, 5, 6);
		System.out.println("volume is " + box2.volume());

		mybox box3 = new mybox(5,6,7);
		mybox box4 = new mybox(box3);

		System.out.println("volume is " + box4.volume());
	}
}