package recurso;

import java.util.Scanner;

public class EntradaSalida {
	static Scanner sc = new Scanner(System.in);

	public static String palabra() {
		System.out.println("Introduzca la palabra a buscar");
		String url = sc.nextLine();
		return url;
	}
}
