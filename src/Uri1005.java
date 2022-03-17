import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota1 = sc.nextInt();

		System.out.println("Digite a segunda nota:");
		double nota2 = sc.nextInt();

		double media;
		media = (nota1 * 3.5 + nota2 * 7.5) / 11;
		System.out.printf("A média das notas é: %.2f.", media);

		sc.close();

	}

}
