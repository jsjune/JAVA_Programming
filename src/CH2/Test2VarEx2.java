package CH2;

public class Test2VarEx2 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		int tmp = 0; // x값을 임시로 저장할 변수를 선언
		
		System.out.println("x:" + x + " y:" + y);

		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x:" + x + " y:" + y);
	}
}
