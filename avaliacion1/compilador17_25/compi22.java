package compilador17_25;

import java.util.Scanner;

class compi22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, x;
		float altura, suma, promedio;

		System.out.print("Cuantos alumnos hay: ");
		n = teclado.nextInt();
		suma = 0;
		x = 1;
		while (x <= n) {
			System.out.print("Dame altura " + x + ": ");
			altura = teclado.nextFloat();
			suma = suma + altura;
			x = x + 1;
		}
		promedio = suma / n;
		System.out.print("Altura promedio:");
		System.out.print(promedio);
		teclado.close();

	}

}
