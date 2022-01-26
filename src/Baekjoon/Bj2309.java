package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Bj2309 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] members = new int[9];
		int[] sevenMembers = new int[7];
		int sum=0;
		
		for (int i = 0; i < members.length; i++) {
			members[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(members);
		
		for(int i=0;i<members.length;i++) {
			sum+=members[i];
			if(sum>100) {
				break;
			}
			if(sevenMembers.length>7) {
				break;
			}
			sevenMembers[i]=members[i];
		}
		for(int i:sevenMembers) {
			System.out.println(i);
		}
	}
}
