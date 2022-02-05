package CH3;

public class Test3OperatorEx3 {
	public static void main(String args[]) {
		int a = 1_000_000;
		int b = 2_000_000;
		long c1 = a * b;
		long c2 = (long) a * b;

		System.out.println(c1);
		System.out.println(c2);
	}
}
