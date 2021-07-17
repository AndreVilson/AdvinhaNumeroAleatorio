package empresa;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu palpite:");

		int palpite = teclado.nextInt();
		String msg;// mensagem para imprimir, operador Ternário

		int rand1 = (int) (Math.random() * 10000);

		while (palpite != rand1) {

			msg = palpite < rand1 ? "Um pouco mais..." : "Um pouco menos...";// Operador Ternário
			System.out.println(msg);// Imprime resultado do operador Ternário
			/*
			 * if(palpite <10000) { System.out.println("Um pouco mais..."); } else {
			 * System.out.println("Um pouco menos..."); }
			 */
			System.out.println("Digite seu próximo palpite");
			palpite = teclado.nextInt();
		}
		System.out.println("Está correto!");
	}

}
