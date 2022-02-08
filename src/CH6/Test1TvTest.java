package CH6;

class Tv1 {
	// TV의 속성(멤버 변수)
	String color;
	boolean power;
	int channel;

	// TV의 기능(메서드)
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

public class Test1TvTest {
	public static void main(String[] args) {
		Tv1 t; // TV인스턴스를 참조하기 위한 변수 t를 선언, TV클래스 타입의 참조변수 t를 선언
		t = new Tv1(); // TV인스턴스를 생성
		t.channel = 7;
		t.channelDown(); // TV인스턴스의 메서드 channelDown()을 호출
		System.out.println("현재 채널은 " + t.channel + " 입니다.");
		
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();
		System.out.println("t1의 cahnnel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 cahnnel값은 " + t2.channel + "입니다.");
		
		t2=t1; // t1이 저장하고 있는 값(주소)을 t2에 저장한다.
		t1.channel=7;
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 cahnnel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 cahnnel값은 " + t2.channel + "입니다.");
	}
}
