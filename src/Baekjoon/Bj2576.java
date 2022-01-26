package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class Bj2576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> numbers = new ArrayList<>();

		int cnt = 7;
		for (int i = 0; i < cnt; i++) {
			numbers.add(Integer.parseInt(br.readLine()));
		}

		Iterator it = numbers.iterator();
		while (it.hasNext()) {
			int value = (int) it.next();
			if (value % 2 == 0) {
				it.remove();
			}
		}
		if (numbers.size() == 0) {
			System.out.println(-1);
		} else {
			int sum = 0;
			for (int num : numbers) {
				sum += num;
			}
			System.out.println(sum);

			int min = numbers.get(0);
			for (int i = 1; i < numbers.size(); i++) {
				if (numbers.get(i) < min) {
					min = numbers.get(i);
				}
			}
			System.out.println(min);
		}
	}
}
