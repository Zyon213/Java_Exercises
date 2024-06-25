class child extends Thread {
	String name;

	child(String sname) {
		super(sname);
		name = sname;
		System.out.println("child thread" + this);
		start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {

				System.out.println(name + " child thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " child thread Interuped");

		}
		System.out.println(name + " Exited child thread");
	}
}

class threadchild {
	public static void main(String args[]) {
		new child("tree");
		new child("door");
		new child("shelf");

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main thread");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread Interupted");

		}
		System.out.println("Exited main thread");
	}
}