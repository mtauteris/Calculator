import java.text.DecimalFormat;

public interface Rounder {

	public static String round(String a) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(a);

	}

}
