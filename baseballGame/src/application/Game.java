package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	private int q1, q2, q3;
	int arr1[];

	public void play() {
		setNum();
	}
	
	public void setNum() {
		while (true) {
			q1 = (int) Math.floor(Math.random() * 9);
			q2 = (int) Math.floor(Math.random() * 9);
			q3 = (int) Math.floor(Math.random() * 9);
			if(q1 != q2 && q1 != q3 && q2 != q3) {
				break;
			} else {
				q2 = (int) Math.floor(Math.random() * 9);
				q3 = (int) Math.floor(Math.random() * 9);
			}
		}
		for(int i : arr1) {
			System.out.println(i);
		}
		getNum();
	}
	
	public void getNum() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String as;
		try {
			System.out.print("숫자 입력 (a b c) : ");
			as = br.readLine();
			String arr[] = as.split(" ");
			for(String str : arr) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
