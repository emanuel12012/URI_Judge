import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {

		// Produto simples

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int a = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int b = sc.nextInt();

		System.out.println("Produto = " + (a * b));

		sc.close();

	}

}
