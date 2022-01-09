package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Game {
	String[] arr = new String[3];

	ArrayList<String> al = new ArrayList<>();

	String q1, q2, q3;

	public void play() {
		setNum();
	}

	public void setNum() {
		while (true) {
			q1 = String.valueOf((int) Math.floor(Math.random() * 9));
			q2 = String.valueOf((int) Math.floor(Math.random() * 9));
			q3 = String.valueOf((int) Math.floor(Math.random() * 9));
			if (q1 != q2 && q1 != q3 && q2 != q3) {
				break;
			} else {
				q2 = String.valueOf((int) Math.floor(Math.random() * 9));
				q3 = String.valueOf((int) Math.floor(Math.random() * 9));
			}
		}
		al.add(q1);
		al.add(q2);
		al.add(q3);
		for (String li : al) {
			System.out.print(li + " ");
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
			arr = as.split(" ");
//			for (String str : arr) {
//				System.out.println(str);
//			}
			System.out.println(arr[1]);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자 3개를 입력해주세요!");
		} finally {
			int ball = ballCount();
			System.out.println(ball);
		}
	}

	public int ballCount() {
		int count = 0;
		for (String li : al) {
			for (String str : arr) {
				if (li == str) {
					count++;
				}
			}
		}
		return count;
	}
}
