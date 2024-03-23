import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();

		// triangulo 1

		System.out.println("informe um lado tT1:");
		t1.a1 = sc.nextDouble();

		System.out.println("informe um lado tT2:");
		t1.a2 = sc.nextDouble();

		System.out.println("informe um lado tT3:");
		t1.a3 = sc.nextDouble();

		// triangulo 2

		System.out.println("informe um lado tT4:");
		t2.a1 = sc.nextDouble();

		System.out.println("informe um lado tT5:");
		t2.a2 = sc.nextDouble();

		System.out.println("informe um lado tT6:");
		t2.a3 = sc.nextDouble();

		double p1 = (L1 + L2 + L3) / 2; // <-
		double p2 = (L4 + L5 + L6) / 2;

		double areaX = Math.sqrt(p1 * (p1 - L1) * (p1 - L2) * (p1 - L3));
		double areaY = Math.sqrt(p2 * (p2 - L4) * (p2 - L5) * (p2 - L6));

		sc.close();

	}

}
