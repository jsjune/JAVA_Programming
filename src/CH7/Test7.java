package CH7;

class Point2 {
	int x, y;

	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Point3D extends Point2 {
	int z;

	String getLocation() { // 오버라이딩
		// return "x :" + x + ", y:" + y + ",z :" + z;
		return super.getLocation() + ", z :" + z; // 조상의 메서드 호출
	}
}

public class Test7 {

}
