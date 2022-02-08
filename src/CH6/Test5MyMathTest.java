package CH6;

public class Test5MyMathTest {
	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5, 5);
		long result2 = mm.substract(5, 3);
		long result3 = mm.multiply(5, 3);
		double result4 = mm.divide(5, 3);
		
		System.out.printf("add(5, 3) = %d%n",result1);
		System.out.printf("substract(5, 3) = %d%n",result2);
		System.out.printf("multiply(5, 3) = %d%n",result3);
		System.out.printf("divide(5, 3) = %f%n",result4);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}

	long substract(long a, long b) {
		return a - b;
	}

	long multiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}
}
