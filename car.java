class mycar{
	int width;
	int height;

	mycar(int w, int h)
	{
		width = w;
		height = h;
	}

	void multiply(int w, int h)
	{
		w *= 5;
		h += 6;
		System.out.println("Width " + w);
		System.out.println("height " + h);
	}
	mycar duplicate()
	{
		width *= 5;
		height += 6;
		mycar ncar = new mycar(width, height);
		return ncar;
	}

	void display()
	{
		System.out.println("Width " + width);
		System.out.println("height " + height);
	}
}

public class car{

	public static void main(String args[])
	{
		int w, h;
		w = 4;
		h = 5;
		mycar car1 = new mycar(w, h);
		car1.multiply(w, h);
		mycar car2;
		car1.display();

		car2 = car1.duplicate();
		car2.display();
		car1.display();
	}

}