class child implements Runnable {
	Thread t;
	int ii;

	child(int i) {
		ii = i;
		String name = "child " + ii;
		t = new Thread(this, name);
		System.out.println(t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("child " + ii + " counter " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child " + ii + " child Interupted");

		}
		System.out.println("child " + ii + " Exited child");
	}
}

public class multichild {

	public static void main(String args[]) {
		for (int i = 5; i > 0; i--) {
			new child(i);
		}

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main Interputed");

		}
		System.out.println("Exit main");
	}
}