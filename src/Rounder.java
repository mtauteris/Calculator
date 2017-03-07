import java.text.DecimalFormat;

public interface Rounder {

	public static String round(Double a) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(a);

	}

}
