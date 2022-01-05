package application;

public class Game {
	public void play() {
		double q1 = Math.floor(Math.random() * 9);
		double q2 = Math.floor(Math.random() * 9);
		double q3 = Math.floor(Math.random() * 9);
		if (q1 == q2) {
			q2 = Math.floor(Math.random() * 9);
		}
		System.out.println(q1 + " " + q2 + " " + q3);
	}
}
