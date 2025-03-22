package nivell.tres;

import java.util.Scanner;

public class Cine {
	private int files;
	private int ButacaXFila;
	private GestioButacas gestioSeients;
	private GestioCine gestioSala;
	private static Scanner datos = new Scanner(System.in);
	
	public Cine() {
		this.gestioSeients = new GestioButacas();
		this.gestioSala = new GestioCine(this);
		demanarDadesInicials();
	}

	public int getFiles() {
		return files;
	}

	public void setFiles(int files) {
		this.files = files;
	}

	public int getButacaXFila() {
		return ButacaXFila;
	}
	
	public void setButacaXFila(int butacaXFila) {
		ButacaXFila = butacaXFila;
	}
	
	public GestioButacas getGestioSeients() {
		return gestioSeients;
	}


	public void setGestioSeients(GestioButacas gestioSeients) {
		this.gestioSeients = gestioSeients;
	}

	public GestioCine getGestioSala() {
		return gestioSala;
	}
	
	public void setGestioSala(GestioCine gestioSala) {
		this.gestioSala = gestioSala;
	}
	
	public static Scanner getDatos() {
		return datos;
	}

	public static void setDatos(Scanner datos) {
		Cine.datos = datos;
	}




	public void demanarDadesInicials() {
		System.out.println("Indique el numero de filas de la sala de cine");
		this.files = datos.nextInt();
		this.setFiles(this.files);
		System.out.println("Indique el numero debutacas");
		this.ButacaXFila = datos.nextInt();
		this.setButacaXFila(this.ButacaXFila);		
	}
	
	public void inici() throws ExcepcionFilaIncorrecta, ExcepcionButacaIncorrecta, ExcepcionNomPersonaIncorrecta {
		this.gestioSala.menu();		
	}
	
	
	public String toString() {
		return "La sala de cine";
	}
	
	
	
}
