package CH7;

public class Test15CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe; // up-casting : 자손타입 FireEngine에서 조상타입 Car로 변환 : car = (Car)fe; 생략된 형태
//		car.water(); // 컴파일 에러!! Car타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine) car; // down-casting 조상타입 Car에서 자손타입 FireEngin으로 변환		fe2.water();
		fe2.water();
	}
}

class Car {
	String color;
	int door;

	void drive() {
		System.out.println("drive, Brrrr~");
	}

	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}