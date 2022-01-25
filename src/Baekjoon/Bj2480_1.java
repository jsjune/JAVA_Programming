package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2480_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		int[] value = new int[3];

		for (int i = 0; i < input.length; i++) {
			value[i] = Integer.parseInt(input[i]);
		}

		if (value[0] == value[1] && value[1] == value[2]) {
			System.out.println(10000 + value[0] * 1000);
		} else if (value[0] == value[1] || value[0] == value[2]) {
			System.out.println(1000 + value[0] * 100);
		} else if (value[1] == value[2]) {
			System.out.println(1000 + value[1] * 100);
		} else {
			Arrays.sort(value);
			System.out.println(value[2] * 100);
		}
	}
}
