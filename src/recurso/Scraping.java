package recurso;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping {

	public static void sacarDatosWeb(String palabra) {

		Document documento;
		try {
			documento = Jsoup.connect("https://www.wordreference.com/es/en/translation.asp?spen=" + palabra).get();

			Element elemento_palbra = documento.selectFirst(".WRD .FrWrd>strong");
			Element elemento_informal = documento.selectFirst(".even .ToWrd");
			Element elemento_usos = documento.selectFirst(".even .FrEx");
			Element elemento_usosIngles = documento.selectFirst(".even .ToEx");
			
			
			String palabraBuscada = elemento_palbra.text();
			String traduccion = elemento_informal.text();
			String usoPalbra = elemento_usos.text();
			String usuIngles = elemento_usosIngles.text();
			System.out.println("Has buscado: "+palabraBuscada);
			System.out.println("La traduccion es: "+traduccion);
			System.out.println("Ejemplos de uso: "+usoPalbra);
			System.out.println("Ejemplos de uso en ingles : "+usuIngles);
			String nombre_autor = "";
			if (elemento_palbra != null) {
				nombre_autor = elemento_palbra.text();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
