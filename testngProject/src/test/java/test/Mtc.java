package test;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println("Thread is running " + getId());
	}
}

public class Mtc {

	public static void main(String[] args) {

		Thread1 t1 = new Thread1();
		Thread1 t2 = new Thread1();
		Thread1 t3 = new Thread1();

		t1.start();
		t2.start();
		t3.start();

	}

}
