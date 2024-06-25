class child implements Runnable {
	String name;
	Thread t;

	child(String sname) {
		name = sname;
		t = new Thread(this, name);
		System.out.println("child thread " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " child thread " + i);
				Thread.sleep(500);

			}
		} catch (InterruptedException e) {
			System.out.println(name + " child thread Interputed");

		}
		System.out.println(name + " child thread Exited");
	}
}

class joinChild {

	public static void main(String args[]) {
		child c1 = new child("Tree");
		child c2 = new child("Door");
		child c3 = new child("Chair");

		System.out.println("checking child " + c1.t.getName() + " " + c1.t.isAlive());
		System.out.println("checking child " + c2.t.getName() + " " + c2.t.isAlive());
		System.out.println("checking child " + c3.t.getName() + " " + c3.t.isAlive());

		try {
			c1.t.join();
			c2.t.join();
			c3.t.join();
		} catch (InterruptedException e) {
			System.out.println("child is Interuputed");

		}
		System.out.println("Main chid Exited");

		System.out.println("checking child " + c1.t.getName() + " " + c1.t.isAlive());
		System.out.println("checking child " + c2.t.getName() + " " + c2.t.isAlive());
		System.out.println("checking child " + c3.t.getName() + " " + c3.t.isAlive());
	}
}