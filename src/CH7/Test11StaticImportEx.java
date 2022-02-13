package CH7;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out; // System.out을 out만으로 참조가능

public class Test11StaticImportEx {
	public static void main(String[] args) {
//		System.out.println(Math.random());
		out.println(random());

//		System.out.println("Math.PI :"+Math.PI);
		System.out.println("Math.PI :" + PI);
	}
}
