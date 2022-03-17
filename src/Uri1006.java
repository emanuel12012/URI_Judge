import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextInt();

		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextInt();

		System.out.println("Digite a terceira nota:");
		double nota3 = sc.nextInt();

		double media;
		media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
		System.out.printf("A média das notas é: %.1f.", media);

		sc.close();
	}

}
