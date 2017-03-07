/**
 * Created by Mokinys on 2017.03.07.
 */
public class NumberConverter {

    private String toBinaryform(int number) {
    return Integer.toBinaryString(number);
    }

    private String toHexadecimal (int number) {
        return Integer.toHexString(number);

    }

    private String toOctal (int number) {
        return Integer.toOctalString(number);

    }

}
