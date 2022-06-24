package sara2;

public class Varibles {

	public static void main(String[] args) {
//		int a=5;
//		
//		if(a==5) {
//			int b=8;
//			System.out.println(b);
//		}
		
		//OPERADOR DE NEGACION
		
		boolean a = true;
		System.out.println(a);
		a =! a;
		System.out.println(a);
		
		//
		boolean c=false;
		if(c==true) {
			System.out.println("El valor de c es true con ==true");
		}if(c==false){
			System.out.println("El valor de c es false con ==false");
		}if(c!=true) {
			System.out.println("El valor de c es false con !=true");
		}if(c!=false) {
			System.out.println("El valor de c es true con !=false");
		}if(c) {
			System.out.println("El valor de c es true con c");
		}if(!c) {
			System.out.println("El valor de c es true con !c");
		}
		
	}

}
