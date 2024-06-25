class CallMe {
	synchronized void Call(String msg) {
		System.out.print("[ " + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("child Intrupted");
		}
		System.out.println(" ]");
	}

	synchronized void display() {
		System.out.print("[ ");
		try {
			for (int i = 0; i < 15; i++) {

				System.out.print(" * ");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("child Intrupted");
		}
		System.out.println(" ]");
	}
}

class Talk {
	synchronized void voice(String sound) {
		System.out.print("[ ");
		try {
			for (int i = 0; i < 4; i++) {
				System.out.print(sound + " ");
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.print("child Interupted");
		}
		System.out.println(" ]");
	}
}

class Dish
{
	synchronized void MyDish(String food)
	{
		System.out.println(food + " start eating");
		try {
			System.out.println("*****eating******");
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("child Interupted");

		}
		System.out.println(food + " finshed Eating");
	}
}

class Eat implements Runnable {
	Thread T;
	String Food;
	Dish D;

	Eat(String foods) {
		Food = foods;
		T = new Thread(this, Food);
		D = new Dish();
		T.start();
	}

	public void run() {
		D.MyDish(Food);
	}
}

class Caller implements Runnable {
	String Msg;
	CallMe Target;
	Talk Sound;
	Thread T;
	Eat E1, E2, E3;

	Caller(CallMe target, Talk voice, String msg) {
		Target = target;
		Msg = msg;
		Sound = voice;
		T = new Thread(this);
		E1 = new Eat("Ingera");
		E2 = new Eat("Genfo");
		E3 = new Eat("Bread");
		T.start();
	}

	// synchronized void waiting()
	// {

	// }

	public void run() {
		// Target.Call(Msg);
		try
		{
			E1.T.join();
			E2.T.join();
			E3.T.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Eat interupted");
		}
		System.out.println("Eat Exited");
	}
}

class sync {
	public static void main(String args[]) {
		CallMe c = new CallMe();
		Talk t = new Talk();
		Caller c1 = new Caller(c, t, "First Caller");
		Caller c2 = new Caller(c, t,  "Second Caller");
		Caller c3 = new Caller(c, t,  "Thrid Caller");

		try {
			c1.T.join();
			c2.T.join();
			c3.T.join();

		} catch (InterruptedException e) {
			System.out.println("Thread intrupted");
		}
		System.out.println("Thread Exited");
	}
}
