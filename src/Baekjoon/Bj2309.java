package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2309 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] members = new int[9];
		int sum = 0;
		int spy1 = 0, spy2 = 0;

		for (int i = 0; i < members.length; i++) {
			members[i] = Integer.parseInt(br.readLine());
			sum += members[i];
		}

		Arrays.sort(members);

		for (int i = 0; i < members.length - 1; i++) {
			for (int j = i+1; j < members.length; j++) {
				if (sum - members[i] - members[j] == 100) {
					spy1 = i;
					spy2 = j;
					break;
				}
			}
		}

		for (int i = 0; i < members.length; i++) {
			if (i == spy1 || i == spy2) 
				continue;
			System.out.println(members[i]);
		}
	}
}
