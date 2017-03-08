import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("ivesk skaiciu");
		Calculator cal = new Calculator();
		System.out.println(cal.numberConverter.toBinaryform(reader.nextInt()));
	}

}
