package nivell.tres;

public class Inicio {

	public static void main(String[] args) throws ExcepcionFilaIncorrecta, ExcepcionButacaIncorrecta, ExcepcionNomPersonaIncorrecta {
		GestioCine.setSala(new Cine());
		Cine nouCinema = new Cine();
		nouCinema.inici();		
	}

}
