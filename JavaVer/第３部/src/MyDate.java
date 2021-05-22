public class MyDate {
	MyDate(String date) {
	}

	public MyDate yesterday() {
		return new MyDate(this.days()-1);
	}
}
