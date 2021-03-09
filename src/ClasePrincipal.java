import recurso.EntradaSalida;
import recurso.Scraping;

public class ClasePrincipal {
public static void main(String[] args) {
	String palabra = EntradaSalida.palabra();
	Scraping.sacarDatosWeb(palabra);
}
}
