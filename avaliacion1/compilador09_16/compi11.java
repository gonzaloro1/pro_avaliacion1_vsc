package compilador09_16;

import java.util.Scanner;

class compi11 {

	public static void main(String[] args) {
		float PVP, precio, precioRebajado, nuevoPVP;
		Scanner teclado = new Scanner(System.in);

		System.out.print("\nDame PVP: ");
		PVP = teclado.nextFloat();
		precio = PVP / (float) 1.18;
		precioRebajado = precio * (float) 0.75;
		nuevoPVP = precioRebajado * (float) 1.18;
		System.out.println("Precio ----------> " + precio);
		System.out.println("Precio Rebajado--> " + precioRebajado);
		System.out.println("Nuevo PVP -------> " + nuevoPVP);
		teclado.close();

	}

}
