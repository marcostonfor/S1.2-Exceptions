package nivell.tres;

public class Butaca {
	private int numFila;
	private int numSeient;
	private String nomReserva;
	
	public Butaca(int numFila, int numSeient, String nomReserva) {
		this.numFila = numFila;
		this.numSeient = numSeient;
		this.nomReserva = nomReserva;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumSeient() {
		return numSeient;
	}

	public void setNumSeient(int numSeient) {
		this.numSeient = numSeient;
	}

	public String getNomReserva() {
		return nomReserva;
	}

	public void setNomReserva(String nomReserva) {
		this.nomReserva = nomReserva;
	}
	
	public void igualdad() {
		
	}
	
	public String toString() {
		return "Fila: " + this.numFila + " Seient: " + this.numSeient + " Persona: " + this.nomReserva + ".";
	}
	
	
	
	
	
	
	
	
}
