package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Game {
	private int q1, q2, q3;

	public void play() {
		setNum();
	}

	public void setNum() {
		while (true) {
			q1 = (int) Math.floor(Math.random() * 9);
			q2 = (int) Math.floor(Math.random() * 9);
			q3 = (int) Math.floor(Math.random() * 9);
			if (q1 != q2 && q1 != q3 && q2 != q3) {
				break;
			} else {
				q2 = (int) Math.floor(Math.random() * 9);
				q3 = (int) Math.floor(Math.random() * 9);
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		al.add(q1);
		al.add(q2);
		al.add(q3);
		System.out.println(al.get(1));
		for(Integer li : al) {
			System.out.print(li+" ");
		}
		System.out.println();
		getNum();
	}

	public void getNum() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String as;
		try {
			System.out.print("숫자 입력 (a b c) : ");
			as = br.readLine();
			String arr[] = as.split(" ");
			for (String str : arr) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
