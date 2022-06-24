package sara2;

public class EjEcepciones {
	public static void main(String[] args) {
		try {
			for(int i=-5;i<5;i++) {
				int c=5/i;
				System.out.println(c);
			}
		} catch (ArithmeticException ex) {
			System.out.println("Excepcion aritmetica: "+ex);
		}
	}
}
