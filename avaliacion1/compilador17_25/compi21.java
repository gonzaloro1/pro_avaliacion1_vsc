package compilador17_25;

import java.util.Scanner;

class compi21 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int i, nota, conta1, conta2;
		
		conta1 = 0;
		conta2 = 0;
		i = 1;
		while (i <= 7) {
			System.out.print("Dame nota " + i + ": ");
			nota = teclado.nextInt();
			if (nota >= 6)
				conta1 = conta1 + 1;
			else
				conta2 = conta2 + 1;
			i = i + 1;
		}
		System.out.print("Alumnos con nota mayor o igual que 6: ");
		System.out.println(conta1);
		System.out.print("Alumons con nota menor que 6: ");
		System.out.print(conta2);
		teclado.close();

	}

}
