package CH8;

public class Test8 {
	public static void main(String[] args) {
		try {
			method();
		} catch (Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}

	static void method() throws Exception {
		throw new Exception();
	}
}
