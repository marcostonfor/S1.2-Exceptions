package nivell.uno;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producta> productes = new ArrayList<Producta>();
	private int totalPreu;
	
	public Venda(ArrayList<Producta> productes, int totalPreu) {
		this.productes = productes;
		this.totalPreu = totalPreu;
	}

	public ArrayList<Producta> getProductes() {
		return productes;
	}

	public void setProductes(ArrayList<Producta> productes) {
		this.productes = productes;
	}

	public int getTotalPreu() {
		return totalPreu;
	}

	public void setTotalPreu(int totalPreu) {
		this.totalPreu = totalPreu;
	}
	
	
	public void calcularTotal(int total) throws VenBuidaException {	
		
			if(this.productes.isEmpty()) {
				throw new VenBuidaException("Per fer una venda primer has d’afegir productes");
			}
			this.totalPreu = 0;
			for(Producta producta : productes) {
				this.totalPreu += producta.getPreu();
			}
		}
	
	
	
	public String toString() {
		return "";
	}
}



