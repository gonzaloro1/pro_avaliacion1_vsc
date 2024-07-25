package compilador09_16;

import java.util.Scanner;

class compi10 {

	public static void main(String[] args) {
		int precioCompra;
		float precioVenta, PVP;
		Scanner teclado = new Scanner(System.in);

		System.out.print("\nDame precio de compra: ");
		precioCompra = teclado.nextInt();
		precioVenta = precioCompra * (float) 1.35;
		PVP = precioVenta * (float) 1.18;
		System.out.println("Precio de venta------> " + precioVenta);
		System.out.println("PVP -----------------> " + PVP);
		teclado.close();

	}

}
