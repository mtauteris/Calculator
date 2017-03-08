import java.text.DecimalFormat;

public class Rounder {

	public static String round(Double a) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(a);

	}

}
