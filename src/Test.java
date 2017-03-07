import java.util.Scanner;

public class Test implements Rounder {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("ivesk skaiciu");
		Trigonometry tri = new Trigonometry();
		System.out.println(round(tri.cos(reader.nextInt())));
	}

}
