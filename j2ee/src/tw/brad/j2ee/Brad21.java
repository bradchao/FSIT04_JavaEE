package tw.brad.j2ee;

public class Brad21 {
	int x, y;
	public Brad21(String x, String y) {
		this.x = Integer.parseInt(x);
		this.y = Integer.parseInt(y);
	}
	public int add() {
		return x + y + 100;
	}
}
