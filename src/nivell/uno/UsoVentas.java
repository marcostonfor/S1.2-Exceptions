package nivell.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoVentas {

	static ArrayList<Producta> compres = new ArrayList<Producta>();
    static Scanner datos = new Scanner(System.in);
	
	public static void main(String[] args) throws VenBuidaException {
		int preu = 0;
		String producta = "";
		int opcion = 0;
		String menu = "0. Salir.\n"
				+ "1. Comprar.";
		
		Venda productes = new Venda(compres, preu);
		do {
			System.out.println(menu);
			opcion = datos.nextInt();
			switch(opcion) {
			case 0:
				System.out.println("Gracias por comprar aquí!");
				break;
			case 1:
				System.out.println("Indíque el producto que desea comprar:\n");
			    producta = datos.next();
			    System.out.println("Ahora anote el precio a pagar:\n");
			    preu = datos.nextInt();
			    Producta element = new Producta(producta, preu);
			    compres.add(element);
				break;
			}
			
		}while(opcion != 0);
		
		
		
		
		try {
		productes.calcularTotal(preu);
		
		}catch (VenBuidaException e)  {
            System.err.println("Error: " + e.getMessage());
        }
		
		try {
			productes.calcularTotal(preu);
			System.out.println("Preu total de la venda: " + productes.getTotalPreu() + "€.");
			System.out.println(compres.get(5));
		} catch (IndexOutOfBoundsException e) {
			 System.out.println("Excepció capturada: " + e.getMessage());
		}
	}

}
