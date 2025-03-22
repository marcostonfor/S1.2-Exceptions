package nivell.tres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class GestioCine {
	private static Cine sala ;
	private static Scanner datos = new Scanner(System.in);
	private ArrayList<Butaca> reserva = new ArrayList<Butaca>();

	public GestioCine(Cine sala) {
		GestioCine.sala = sala;
	}

	public Cine getSala() {
		return sala;
	}

	public static void setSala(Cine sala) {
		GestioCine.sala = sala;
	}

	public static Scanner getDatos() {
		return datos;
	}

	public static void setDatos(Scanner datos) {
		GestioCine.datos = datos;
	}

	public String menu() throws ExcepcionFilaIncorrecta, ExcepcionButacaIncorrecta, ExcepcionNomPersonaIncorrecta {
		String menu = "0. Salir.\n" + "1. Mostrar todas las butacas reservadas.\n"
				+ "2. Mostrar las butacas reservadas por una persona.\n" + "3. Reservar butaca.\n"
				+ "4. Anular la reserva.\n" + "5. Anular todas las reservas de una persona.";
		int opcio = -1;
		while (opcio != 0) {
			System.out.println(menu);
			opcio = datos.nextInt();
			switch (opcio) {
			case 0:
				break;
			case 1:
				mostarButacasReservadas();
				break;
			case 2:
				butacasReservadasUnaPersona();
				break;
			case 3:
				reservarButaca();
				break;
			}
		}

		return menu;
	}

	private void butacasReservadasUnaPersona() {
		// TODO Auto-generated method stub
		
	}

	private void mostarButacasReservadas() {
		// TODO Auto-generated method stub
		
	}

	private void reservarButaca() throws ExcepcionFilaIncorrecta, ExcepcionButacaIncorrecta, ExcepcionNomPersonaIncorrecta {		
		int filaButaca = 0;
		int numeroButaca = 0;
		String nomReserva = "";
		System.out.println("Indique la fila dónde quíere la butaca.");
		filaButaca = datos.nextInt();
		introduirFila(filaButaca);
		System.out.println("Indique el número de butaca a ocupar en la fila " + filaButaca);
		numeroButaca = datos.nextInt();
		introduirButaca(numeroButaca);
		System.out.println("Indique su nombre por favor.");
		nomReserva = datos.nextLine();
		introduirPersona(nomReserva);
		Butaca fila = new Butaca(filaButaca, numeroButaca, nomReserva);
		reserva.add(fila);
		System.out.println(nomReserva + " a reservado la butaca " + numeroButaca + " en la fila " + filaButaca + ".");

	}
	
	private void introduirPersona(String nomPersona) throws ExcepcionNomPersonaIncorrecta {
		this.sala = new Cine();
		System.out.println("Indique el nombre de la persona que reserva.");
		nomPersona = datos.nextLine();
		if (nomPersona.matches(".*\\d.*")) {
			throw new ExcepcionNomPersonaIncorrecta("El string '" + nomPersona + "' no puede contener números.");
		}
	}
	
	private int introduirFila(int numeroFila) throws ExcepcionFilaIncorrecta {		
		// this.sala = new Cine();
		System.out.println("indique un numero de fila");
		numeroFila = datos.nextInt();
		if(numeroFila > 0  || numeroFila < this.sala.getFiles()) {
            throw new ExcepcionFilaIncorrecta("El número de fila " + numeroFila + " no és vàlid. Ha d'estar entre 1 i " + this.sala.getFiles() + ".");
		} else {
			return numeroFila;
		}
	}
	
	private void introduirButaca(int numero) throws ExcepcionButacaIncorrecta {
		this.sala = new Cine();
		System.out.println("indique un numero de butaca");
		numero = datos.nextInt();	
		if(numero > 1 || numero < this.sala.getButacaXFila()) {
			throw new ExcepcionButacaIncorrecta("El número de butaca " + numero + " no es válido. Ha de estar entre 1 y " + this.sala.getButacaXFila());
		}
	}
}
