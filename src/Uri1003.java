import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {

		// Soma simples

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de A: ");
		int a = sc.nextInt();

		System.out.println("Digite o valor de A: ");
		int b = sc.nextInt();

		float soma = a + b;
		System.out.printf("O resultado da soma é: %.0f", +soma);

	}
}