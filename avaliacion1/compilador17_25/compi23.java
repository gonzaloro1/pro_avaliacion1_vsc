package compilador17_25;

import java.util.Scanner;

class compi23 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, x, conta1, conta2;
		float sueldo, gastos;
		System.out.print("Cuantos empleados hay: ");
		n = teclado.nextInt();
		conta1 = 0;
		conta2 = 0;
		gastos = 0;
		x = 1;
		while (x <= n) {
			System.out.print("Dame sueldo " + x + ": ");
			sueldo = teclado.nextFloat();
			if (sueldo <= 300)
				conta1 = conta1 + 1;
			else
				conta2 = conta2 + 1;
			gastos = gastos + sueldo;
			x = x + 1;
		}
		System.out.print("Empleados con sueldos entre 100 y 300: ");
		System.out.println(conta1);
		System.out.print("Empleados con sueldos superiores a 300: ");
		System.out.println(conta2);
		System.out.print("Gastos total de la empresa en sueldos: ");
		System.out.println(gastos);
		teclado.close();

	}

}
