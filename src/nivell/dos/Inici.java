package nivell.dos;




public class Inici {

	public static void main(String[] args) {
		byte edat = Entrada.llegirByte("Introdueix la teva edat: ");
        int nivell = Entrada.llegirInt("Introdueix el teu nivell (entero): ");
        float altura = Entrada.llegirFloat("Introdueix la teva altura (float): ");
        double pes = Entrada.llegirDouble("Introdueix el teu pes (double): ");
        char inicial = Entrada.llegirChar("Introdueix la inicial del teu nom: ");
        String nom = Entrada.llegirString("Introdueix el teu nom: ");
        boolean resposta = Entrada.llegirSiNo("Vols continuar? (s/n): ");

        
        System.out.println("Edat: " + edat);
        System.out.println("Nivell: " + nivell);
        System.out.println("Altura: " + altura);
        System.out.println("Pes: " + pes);
        System.out.println("Inicial del nom: " + inicial);
        System.out.println("Nom: " + nom);
        System.out.println("Continuar: " + (resposta ? "Sí" : "No"));
	}



}
