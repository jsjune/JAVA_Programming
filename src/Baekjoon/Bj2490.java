package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2490 {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum1 =0;
		int sum2 =0;
		int sum3 =0;
		
		String[] input1 =br.readLine().split(" "); 
		String[] input2 =br.readLine().split(" "); 
		String[] input3 =br.readLine().split(" "); 
		int[] nums1 = new int[4];
		int[] nums2 = new int[4];
		int[] nums3 = new int[4];
		
		for(int i=0;i<input1.length;i++) {
			nums1[i]=Integer.parseInt(input1[i]);
		}
		for(int i=0;i<nums1.length;i++) {
			sum1+=nums1[i];
		}
		if(sum1==0)System.out.println("D");
		if(sum1==1)System.out.println("C");
		if(sum1==2)System.out.println("B");
		if(sum1==3)System.out.println("A");
		if(sum1==4)System.out.println("E");
		for(int i=0;i<input2.length;i++) {
			nums2[i]=Integer.parseInt(input2[i]);
		}
		for(int i=0;i<nums2.length;i++) {
			sum2+=nums2[i];
		}
		if(sum2==0)System.out.println("D");
		if(sum2==1)System.out.println("C");
		if(sum2==2)System.out.println("B");
		if(sum2==3)System.out.println("A");
		if(sum2==4)System.out.println("E");
		for(int i=0;i<input3.length;i++) {
			nums3[i]=Integer.parseInt(input3[i]);
		}
		for(int i=0;i<nums3.length;i++) {
			sum3+=nums3[i];
		}
		if(sum3==0)System.out.println("D");
		if(sum3==1)System.out.println("C");
		if(sum3==2)System.out.println("B");
		if(sum3==3)System.out.println("A");
		if(sum3==4)System.out.println("E");
		
	}
}
