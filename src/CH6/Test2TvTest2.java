package CH6;

public class Test2TvTest2 {
	public static void main(String args[]) {
		Tv2[] tvArr = new Tv2[3]; // 길이가 3인 Tv객체 배열

		// Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv2();
			tvArr[i].channel = i + 10; 
		}

		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
		}
	}
}

class Tv2 {
	String color;
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
}