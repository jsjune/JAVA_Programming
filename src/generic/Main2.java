package generic;

class ClassName2<K, V> {
	private K first;
	private V second;

	void set(K fst, V scd) {
		this.first = fst;
		this.second = scd;
	}

	K getFirst() {
		return first;
	}

	V getSecond() {
		return second;
	}
}

public class Main2 {
	public static void main(String[] args) {

		ClassName2<String, Integer> a = new ClassName2<String, Integer>();

		a.set("10", 10);

		System.out.println("first data : " + a.getFirst());
		System.out.println("K Type : " + a.getFirst().getClass().getName());
		System.out.println("Second data : " + a.getSecond());
		System.out.println("V Type : " + a.getSecond().getClass().getName());

	}
}
