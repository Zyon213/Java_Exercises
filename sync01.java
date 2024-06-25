class MyBook {
	synchronized void read(String name) {
		System.out.println(name + " Reading Started");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Reading Interupted");
		}
		System.out.println(name + " Reading Finished");
	}
}

class MyWork implements Runnable {
	MyBook Book;
	Thread T;
	String Name;

	MyWork(MyBook book, String name) {
		Book = book;
		Name = name;
		T = new Thread(this);
		T.start();
	}

	public void run() {
		Book.read(Name);
	}
}

class MyHobby implements Runnable {
	Thread T;
	String Name;
	MyBook Book;

	MyHobby(MyBook book, String name) {
		Book = book;
		Name = name;
		T = new Thread(this);
		T.start();
	}

	public void run() {
		Book.read(Name);
	}
}

class sync01 {
	public static void main(String args[]) {
		MyBook book = new MyBook();
		int i, j;
		String Names[] = { "One", "Two", "Three", "Four" };
		String Plants[] = { "*****Tree", "*****Grass", "*****Flower", "*****Vegetable" };
		MyHobby hobby[] = new MyHobby[Names.length];
		MyWork work[] = new MyWork[Plants.length];

		for (i = 0; i < Names.length; i++) {
			hobby[i] = new MyHobby(book, Names[i]);
			{
				for (j = 0; j < Plants.length; j++)
					work[j] = new MyWork(book, Plants[j]);
			}
		}

		try {
			for (i = 0; i < Names.length; i++) {
				hobby[i].T.join();
			}
			{
				for (j = 0; j < Plants.length; j++)
					work[j].T.join();
			}
		} catch (InterruptedException e) {
			System.out.println("Interupted");
		}
		System.out.println("Main exited");
	}
}