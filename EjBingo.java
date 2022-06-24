package sara2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EjBingo {
	public static void main(String[] args) {
		try {
			int edadpremio=7;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Escibe tu edad");
			int anios=scanner.nextInt() ;
			String resultado = (anios == edadpremio)?"Bingo!! Con 7 años te ha tocado l premio":"upps no hay premio";
			System.out.println(resultado);
		} catch (InputMismatchException ex) {
			System.out.println(ex);
		}
		
	}
}	
