package CH7;

import java.util.ArrayList;

abstract class Car0 {

	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnoff();

	final public void run() {
		start();
		drive();
		stop();
		turnoff();
		System.out.println("=================");
	}
}

class Sonata extends Car0 {
	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");

	}

	@Override
	public void turnoff() {
		System.out.println("Sonata 시동을끕니다.");

	}
}

class Grandeur extends Car0 {
	@Override
	public void start() {
		System.out.println("Grandeur 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur 멈춥니다.");

	}

	@Override
	public void turnoff() {
		System.out.println("Grandeur 시동을끕니다.");

	}
}

class Avante extends Car0 {
	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");

	}

	@Override
	public void turnoff() {
		System.out.println("Avante 시동을끕니다.");

	}
}

class Genesis extends Car0 {
	@Override
	public void start() {
		System.out.println("Genesis 시동을 켭니다");
	}

	@Override
	public void drive() {
		System.out.println("Genesis 달립니다");
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다.");

	}

	@Override
	public void turnoff() {
		System.out.println("Genesis 시동을끕니다.");

	}
}

public class Test23 {
	public static void main(String[] args) {
		ArrayList<Car0> carList = new ArrayList<Car0>();

		carList.add(new Sonata());
		carList.add(new Grandeur());
		carList.add(new Avante());
		carList.add(new Genesis());

		for (Car0 car : carList) {
			car.run();
		}

	}
}
