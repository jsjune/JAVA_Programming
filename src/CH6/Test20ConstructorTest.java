package CH6;

class Data{
	int value;
}

class Dataa{
	int value;
	
	Dataa(int x){ // 매개변수가 있는 생성자
		value = x;
	}
}

public class Test20ConstructorTest {
	public static void main(String[] args) {
		Data d1 = new Data();
//		Data2 d2 = new Data2(); // compile error발생
	}
}
