package Choo;

public class hw5 {
	public static void main(String[] args) {
		new Sync1Thread("�Ӵ�1 : ").start();
		new Sync1Thread("�Ӵ�2 : ").start();
	}
}
class Sync1Thread extends Thread {
	static String proverb[] = { "Time", "is", "money" };

	public Sync1Thread(String id) {
		super(id);
	}

	public void run() {
		String name = getName();
		for (int i = 0; i < proverb.length; ++i) {
			try {
				Thread.sleep((long) (1000 * Math.random()));
			} catch (InterruptedException x) {
			}
			System.out.println(name + proverb[i]);
		}
	}
}