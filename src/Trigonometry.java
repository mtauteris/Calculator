
public class Trigonometry {

	public static Double sin(int x) {
		return Math.sin(Math.toRadians(x));

	}

	public static Double cos(int x) {

		return Math.cos(Math.toRadians(x));

	}

	public static Double tan(int x) {
		return Math.tan(Math.toRadians(x));
	}

	public static Double ctg(int x) {
		return 1 / tan(x);
	}

}
