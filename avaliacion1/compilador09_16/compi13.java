package compilador09_16;

import java.util.Scanner;

class compi13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nota1, nota2, nota3;
		float media;
		
		System.out.print("Ingrese primera nota:");
		nota1 = teclado.nextInt();
		System.out.print("Ingrese segunda nota:");
		nota2 = teclado.nextInt();
		System.out.print("Ingrese tercera nota:");
		nota3 = teclado.nextInt();
		media = (nota1 + nota2 + nota3) / (float) 3;
		System.out.println("Su media ---> " + media);
		if (media >= 7)
			System.out.print("PROMOCIONADO");
		teclado.close();

	}

}
