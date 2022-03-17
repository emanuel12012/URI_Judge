import java.util.Scanner;

public class Uri1002 {
	public static void main(String[] args) {

		// Area do círculo

		double n = 3.14159;

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o raio do círculo? (R)");
		int r = sc.nextInt();

		double a = (r * r) * n;
		System.out.printf("A área é: %f", a);
	}
}
