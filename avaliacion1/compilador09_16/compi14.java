package compilador09_16;

import java.util.Scanner;

class compi14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;

		System.out.print("Dame un entero entre 1 y 99: ");
		num = teclado.nextInt();
		if (num < 10)
			System.out.print("Tiene UN digito");
		else
			System.out.print("Tiene DOS digitos");
		teclado.close();

	}

}
