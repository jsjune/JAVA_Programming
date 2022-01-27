package CH2;

public class Test10FloatToBinEx {
	public static void main(String[] args) {
		float f = 9.1234567f;
		int i = Float.floatToIntBits(f); // float타입의 값을 int타입의 값으로 해석해서 반환
		
		System.out.printf("%f%n",f);
		System.out.printf("%X%n",i); // 16진수로 출력
		// 1.001000111111001101011101 -> 1.001000111111001101011110 으로 반올림되서
		// 4111F9AD -> 4111F9AE
	}
}
