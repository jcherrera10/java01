import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digitar Numero:");	
		int numero;
		numero = scanner.nextInt();
		int resultado;
		Cuadrado objeto = new Cuadrado();
		resultado=objeto.calculo(numero);
		System.out.println("El cuadrado del numero es:" + resultado);
		
		
	}

	public int calculo (int a) {
		return a*a;
	}
	

}
