package compilador09_16;

//import java.util.Scanner;

class compi09 {

	public static void main(String[] args) {
		int num1, num2;
		java.util.Scanner teclado = new java.util.Scanner(System.in);

		System.out.print("\nDame numero 1: ");
		num1 = teclado.nextInt();
		System.out.print("Dame numero 2: ");
		num2 = teclado.nextInt();
		System.out.println("A suma e ------------>" + (num1 + num2));
		System.out.println("A resta e ----------->" + (num1 - num2) + "  (numero1-numero2)");
		System.out.println("A multiplicacion e -->" + (num1 * num2));
		System.out.println("A division entera e ->" + (num1 / num2) + "  (numero1/numero2)");
		System.out.println("O modulo e ---------->" + (num1 % num2) + "  (numero1%numero2)");
		System.out.println("A division real e --->" + (num1 / (float) num2) + "  (numero1/numero2)");
		System.out.println("A media real e ------>" + (num1 + num2) / (float) 2);
		teclado.close();

	}

}
