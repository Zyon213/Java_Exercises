class mystack{

	int arr[] = new int[10];
	int pos;

	mystack()
	{
		pos = -1;
	}

	void push(int item)
	{
		if (pos > 9)
			System.out.println("Stack is full");
		else
			arr[++pos] = item;
	}

	int  pop()
	{
		if (pos < 0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
			return arr[pos--];
	}

	void display()
	{
		System.out.println(pos);
		for (int i = 0; i <= pos; i++)
			System.out.println(arr[i]);
	}
}

class stack
{
	public static void main(String args[])
	{
		mystack mst = new mystack();

		mst.display();
		mst.push(4);
		mst.push(7);
		mst.push(9);
		mst.display();
		System.out.println(mst.pop());
	}
}