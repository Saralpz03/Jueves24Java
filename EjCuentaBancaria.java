package sara2;

import java.util.Scanner;

public class EjCuentaBancaria {

	public static void main(String[] args) {
		String nombre="";
		String numeroTrasferencia = "";
		double cantidadCuenta = 0;
		double dineroSacar=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe tu nombre");
		nombre =sc.nextLine();
		System.out.println("Escribe tu numero de transferencia");
		numeroTrasferencia = sc.nextLine();
		System.out.println("Escribe la cantidad de la cuenta");
		cantidadCuenta = sc.nextDouble();
		System.out.println("Escribe cuanto quieres sacar");
		dineroSacar =sc.nextDouble();
		System.out.println("Hola "+nombre+" has sacado "+dineroSacar+" el numero de tu transferencia es "+numeroTrasferencia+" y te ha quedado tanta "+cantidadCuenta);
	}

}
