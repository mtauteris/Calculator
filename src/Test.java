import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("ivesk skaiciu");
		Trigonometry tri = new Trigonometry();
		System.out.println(tri.sin(reader.nextLong()));
	}

}
