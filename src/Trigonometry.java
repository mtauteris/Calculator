
public class Trigonometry {
	private Double a;
	private Long factor3 = (long) (3 * 2);
	private Long factor5 = 4 * 5 * factor3;
	private Long factor7 = 7 * 6 * factor5;
	private Long factor9 = 9 * 8 * factor7;

	public Double sin(Long x) {
		a = x / 180.0 * 3.14;

		return (a - ((a * a * a) / factor3) - ((a * a * a * a * a) / factor5));

	}

}
