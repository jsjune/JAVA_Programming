package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj10807_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] V = new int[201];
		for(int i=0;i<N;i++) {
			V[sc.nextInt()+100]++;
		}
		System.out.println(V[sc.nextInt()+100]);
		System.out.println(Arrays.toString(V));
	}
}
