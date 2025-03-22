package nivell.dos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
	private static Scanner scanner = new Scanner(System.in);

	public static byte llegirByte(String missatge) {
		while (true) {
			try {
				System.out.print(missatge);
				return scanner.nextByte();
			} catch (InputMismatchException e) {
				System.out.println("Error: Has d'introduir un byte vàlid.");
				scanner.next(); 
			}
		}
	}

	public static int llegirInt(String missatge) {
		while (true) {
			try {
				System.out.print(missatge);
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: Has d'introduir un enter vàlid.");
				scanner.next(); 
			}
		}
	}

	public static float llegirFloat(String missatge) {
		while (true) {
			try {
				System.out.print(missatge);
				return scanner.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Error de format: Has d'introduir un float ben format (usa ',' per decimals).");
				scanner.next();
			}
		}
	}

	public static double llegirDouble(String missatge) {
		while (true) {
			try {
				System.out.print(missatge);
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error: Has d'introduir un double vàlid.");
				scanner.next();
			}
		}
	}

	public static char llegirChar(String missatge) {
		while (true) {
			try {
				System.out.print(missatge);
				String entrada = scanner.next();
				if (entrada.length() != 1) {
					throw new Exception("Error: Has d'introduir un únic caracter.");
				}
				return entrada.charAt(0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static String llegirString(String missatge) {
		System.out.print(missatge);
		return scanner.nextLine();
	}

	public static boolean llegirSiNo(String missatge) {
		while (true) {
			System.out.print(missatge);
			String entrada = scanner.next().toLowerCase();
			if (entrada.equals("s")) {
				return true;
			} else if (entrada.equals("n")) {
				return false;
			} else {
				System.out.println("Error: Has d'introduir 's' o 'n'.");
			}
		}
	}
}
