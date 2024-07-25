package compilador09_16;

import java.util.Scanner;

class compi15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2, num3;

		System.out.print("Dame primer valor:");
		num1 = teclado.nextInt();
		System.out.print("Dame segundo valor:");
		num2 = teclado.nextInt();
		System.out.print("Dame tercer valor:");
		num3 = teclado.nextInt();
		if (num1 > num2)
			if (num1 > num3)
				System.out.print("EL MAYOR ---> " + num1);
			else
				System.out.println("EL MAYOR ---> " + num3);
		else if (num2 > num3)
			System.out.print("EL MAYOR ---> " + num2);
		else
			System.out.print("EL MAYOR ---> " + num3);
		teclado.close();

	}

}
