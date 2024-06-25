class Child implements Runnable {
	Thread T;
	String Name;

	Child(String Tname) {
		Name = Tname;
		T = new Thread(this, Name);
		T.start();
	}

	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Name + " child count " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(Name + " child Interuptd");

		}
		System.out.println(Name + " child Exited*********");
	}
}

class joinThread {
	public static void main(String args[]) {
		Child c1 = new Child("Door");
		Child c2 = new Child("Chair");
		Child c3 = new Child("Table");

		System.out.println("Is child alive " + c1.T.isAlive());
		System.out.println("Is child alive " + c2.T.isAlive());
		System.out.println("Is child alive " + c3.T.isAlive());

		try {
			c1.T.join();
			c2.T.join();
			c3.T.join();
		} catch (InterruptedException e) {
			System.out.println("chidl is Interupted");
		}
		System.out.println("Main Exited*****");
		System.out.println("Is child alive " + c1.T.isAlive());
		System.out.println("Is child alive " + c2.T.isAlive());
		System.out.println("Is child alive " + c3.T.isAlive());
	}
}
