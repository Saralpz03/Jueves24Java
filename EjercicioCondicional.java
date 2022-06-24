package sara2;

import java.util.ArrayList;

public class EjercicioCondicional {

	public static void main(String[] args) {
		
		String empleado="madrid";
		if(empleado != "madrid"){
			System.out.println("Lo siento no tienes viaje");
		}else {
			System.out.println("Tienes viaje");
		}
		
		//OPERADOR TERNARIO(SIMPLIFICA EL CONDICIONAL)
		int a=3;
		int b;
		if(a==3){
			System.out.println(b=2);
		}else {
			System.out.println(b=4);
		}
		System.out.println("La varible \"a\"="+a);
		System.out.println("La varible \"b\"="+b);
		
		String empleado2="madrid";
		int resultado3 = (a==3)?2:4;
		String resultado = (empleado2 != "madrid")?"el empleado es diferente de madrid":"el empleado es igual que madrid";
		System.out.println(resultado);
	}
}
