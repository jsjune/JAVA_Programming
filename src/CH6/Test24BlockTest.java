package CH6;

public class Test24BlockTest {
	static { // 클래스 초기화 블럭
		System.out.println("static { }");
	}
	
	{ // 인스턴스 초기화 블럭
		System.out.println("{ }");
	}
	
	public Test24BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("Test24BlockTest bt = new Test24BlockTest();");
		Test24BlockTest bt = new Test24BlockTest();
		
		System.out.println("Test24BlockTest bt2 = new Test24BlockTest();");
		Test24BlockTest bt2 = new Test24BlockTest();
	}
}
