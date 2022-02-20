package CH7;

interface Repairable {
}

class Unitt {
	int hitPoint; // 현재 체력
	final int MAX_HP; // 최고 체력

	Unitt(int hp) {
		MAX_HP = hp;
	}
	// ...
}

class GroundUnit extends Unitt {
	GroundUnit(int hp) {
		// 조상클래스의 생성자 Unit(int hp)를 호출한다.
		super(hp);
	}
}

class AirUnit extends Unitt {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150); // Tank의 HP는 150이다.
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Tank";
	}
	// ...
}

class Dropship extends AirUnit implements Repairable {
	Dropship() {
		super(125);
		hitPoint = MAX_HP;
	}

	public String toString() {
		return "Dropship";
	}
	// ...
}

class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitPoint = MAX_HP;
	}
	// ...
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	void repair(Repairable r) {
		if (r instanceof Unitt) {
			Unitt u = (Unitt) r;
			while (u.hitPoint != u.MAX_HP) {
				/* Unit의 HP를 증가시킨다. */
				u.hitPoint++;
			}

			System.out.println(u.toString() + "의 수리가 끝났습니다.");
		}
	}
	// ...
}

public class test26RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();

		Marine marine = new Marine();
		SCV scv = new SCV();

		scv.repair(tank);
		scv.repair(dropship);
//		scv.repair(marine);

	}

}
