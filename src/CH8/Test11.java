package CH8;

public class Test11 {
	public static void main(String[] args) {
		try {
			method();
		}catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}
	
	static void method() throws Exception{
		try {
			throw new Exception(); // 예외를 발생시킴
		}catch(Exception e) {
			System.out.println("method메서드에서 예외가 처리되었습니다.");
			throw e; // 다시 예외를 발생시킨다.
		}
	}
}
