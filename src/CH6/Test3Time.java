package CH6;

class Time {
	private int hour;
	private int minute;
	private float second;

	int getHour() {
		return hour;
	}

	int getMinute() {
		return minute;
	}

	float getSecond() {
		return second;
	}

	void setHour(int h) {
		if (h < 0 || h > 23)
			;
		hour = h;
	}

	void setMinute(int m) {
		if (m < 0 || m > 59)
			;
		minute = m;
	}

	void setSecond(float s) {
		if (s < 0.0f || s > 59.99f)
			;
		second = s;
	}
}

public class Test3Time {
	public static void main(String[] args) {
		Time T = new Time();
		T.setHour(2);
		T.setMinute(20);
		T.setSecond(45);
		int hour = T.getHour();
		int minute = T.getMinute();
		float second = T.getSecond();
		System.out.printf("%d시 %d분 %f초",hour,minute,second);
	}
}
