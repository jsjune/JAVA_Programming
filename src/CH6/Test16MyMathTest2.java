package CH6;

class MyMath2 {
	long a, b; // 인스턴스변수

	// 인스턴스변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {
		return a + b; // a, b는 인스턴스변수
	}

	long substract() {
		return a - b;
	}

	long multiply() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	// 인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) { // a, b는 지역변수
		return a + b;
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multiply(long a, long b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}
}

public class Test16MyMathTest2 {
	public static void main(String[] args) {
		// 클래스메서드 호출. 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200, 100));
		System.out.println(MyMath2.substract(200, 100));
		System.out.println(MyMath2.multiply(200, 100));
		System.out.println(MyMath2.divide(200, 100));
		
		MyMath2 mm = new MyMath2(); // 인스턴스를 생성
		mm.a = 200;
		mm.b = 100;
		// 인스턴스메서드는 객체생성 후에만 호출이 가능함.
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
