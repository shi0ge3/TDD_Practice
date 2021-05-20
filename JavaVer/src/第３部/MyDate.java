package 第３部;

public class MyDate {
	public MyDate yesterday() {
		return new MyDate(this.days()-1);
	}
}
