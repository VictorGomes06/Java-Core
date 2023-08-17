package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Start_Statico_1 {
	public static final	double PI = 3.14159;
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = leitor.nextDouble();
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.printf("Circunferencs : %.2s%n", c);
		System.out.printf("Volume : %.2s%n", v);
		System.out.printf("PI value : %.2s%n", PI);
		leitor.close();
	}
	public static double circumference(double radius) {
		
		return 2.0 * PI * radius;
	}
	private static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;

	}

}
