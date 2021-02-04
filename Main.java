import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean continuar = true;
		int opcion;
		
		double valorDeA, valorDeB, resultado = 0;
		
		//bloque de instancias
		Scanner leer = new Scanner(System.in);
		Suma objSuma = new Suma();
		
		do{
			
			System.out.println("Bienvenido al menú");
			System.out.println("1.- Suma");
			System.out.println("2.- Resta");
			System.out.println("3.- Multiplicación");
			System.out.println("4.- División");
			System.out.println("5.- Salir");
			opcion = leer.nextInt();
			
			switch (opcion) {
			case 1:
				
				System.out.println("Dame el valor de A");
				valorDeA = leer.nextDouble();
				
				System.out.println("Dame el valor de B");
				valorDeB = leer.nextDouble();
				
				resultado = objSuma.metodoSuma(valorDeA, valorDeB, resultado);
				
				System.out.println("El resultado de tu operación es: "+resultado);
				break;
				
			case 2:
				//Falta crear el objeto y mandar los parámetros para retornar el resultado
				break;
				
			case 3:
				//Falta crear el objeto y mandar los parámetros para retornar el resultado
				break;
				
			case 4:
				//Falta crear el objeto y mandar los parámetros para retornar el resultado
				break;
				
			case 5:
				continuar = false;
				break;

			default:
				break;
			}
			
		}while(continuar);
	}

}
