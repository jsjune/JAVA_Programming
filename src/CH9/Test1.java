package CH9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(2000000);
		LinkedList ll = new LinkedList();
		
		System.out.println(add1(al));
		System.out.println(add1(ll));
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000;i++) list.add(1+"");
		long end = System.currentTimeMillis();
		return end - start;
	}
}
