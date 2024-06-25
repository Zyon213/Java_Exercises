public class threads extends Thread
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		t.setName("New Thread");
		System.out.println("Name of thread " + t);
		try
		{
			for (int i = 5 ; i > 0; i--)
				System.out.println(i);
				Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error");
		}
	}
}