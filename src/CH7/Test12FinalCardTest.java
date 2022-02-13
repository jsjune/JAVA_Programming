package CH7;

class Card2 {
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;

	Card2(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}

	Card2() {
		this("HEART", 1);
	}

	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class Test12FinalCardTest {
	public static void main(String[] args) {
		Card2 c = new Card2("Heart", 10);
//		c.NUMBER = 5; // 에러!!
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); // System.out.println(c.toString());
		// 참조변수의 출력이나 덧셈연산자를 이용한 참조변수와 문자열의 결합에는 toString()이 자동적으로 호출되어 참조변수를 문자열로 대치한 후 처리한다.
	}
}
