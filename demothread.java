class thread01 implements Runnable {
	Thread t;

	thread01() {
		t = new Thread(this, "Demo thread");
		System.out.println("child thread " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {

				System.out.println("child " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("child Interupted");
		}
		System.out.println("Exiting first thread");

	}
}

class thread02 implements Runnable {
	Thread t1;

	thread02() {
		t1 = new Thread(this, "other thread");
		System.out.println("other thread " + t1);
		t1.start();
	}

	public void run() {
		// new thread02();
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("other thread " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("other child interupted");
		}
		System.out.println("exiting second child");

	}
}

class thread03 implements Runnable {
	Thread t3;

	thread03() {
		t3 = new Thread(this, "third child");
		System.out.println("third child " + t3);
		t3.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("third child " + i);
				Thread.sleep(200);

			}
		} catch (InterruptedException e) {
			System.out.println("Interupted third child ");
		}
		System.out.println("Exiting third child ");
	}
}

class demothread {
	public static void main(String args[]) {
		new thread01();
		new thread02();
		new thread03();

		// System.out.println(Thread.currentThread());
		try {
			for (int i = 5; i > 0; i--) {

				System.out.println("main thread " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("main thread Interupted");
		}
		System.out.println("main thread exited");
	}
}
