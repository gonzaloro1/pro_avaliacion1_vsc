package compilador09_16;

import java.util.Scanner;

class compi12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;

		System.out.print("\nIngrese primer valor: ");
		num1 = teclado.nextInt();
		System.out.print("Ingrese segundo valor: ");
		num2 = teclado.nextInt();
		if (num1 > num2) {
			System.out.println("La suma ---------------> " + (num1 + num2));
			System.out.println("La diferencia ---------> " + (num1 - num2));
		} else {
			System.out.println("El producto -----------> " + (num1 * num2));
			System.out.print("La division (entera) --> " + (num2 / num1));
		}
		teclado.close();

	}

}
