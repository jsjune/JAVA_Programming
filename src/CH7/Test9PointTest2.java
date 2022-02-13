package CH7;

public class Test9PointTest2 {
	public static void main(String[] args) {
		Point4D4 p3 = new Point4D4();
		System.out.println("p3.x=" + p3.x);
		System.out.println("p3.y=" + p3.y);
		System.out.println("p3.z=" + p3.z);
	}
}

class Point4 {
	int x = 10;
	int y = 20;

	Point4(int x, int y) {
		// 생성자 첫 줄에서 다른 생성자를 호출하지 않기 떄문에 컴파일러가 'super();'를 여기에 삽입한다.
		this.x = x;
		this.y = y;
	}
}

class Point4D4 extends Point4 {
	int z = 30;

	Point4D4() {
		this(100, 200, 300); // Point3D3(int x, int y, int z)를 호출한다.
	}

	Point4D4(int x, int y, int z) {
		super(x, y); // Point3(int x, int y)를 호출한다.
		this.z = z;
	}
}