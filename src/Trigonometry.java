
public class Trigonometry {

	public Double sin(int x) {
		return Math.sin(Math.toRadians(x));

	}

	public Double cos(int x) {

		return Math.cos(Math.toRadians(x));

	}

	public Double tan(int x) {
		return Math.tan(Math.toRadians(x));
	}

	public Double ctg(int x) {
		return 1 / tan(x);
	}

}
