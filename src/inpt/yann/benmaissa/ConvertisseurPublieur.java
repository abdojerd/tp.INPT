package inpt.yann.benmaissa;

import javax.xml.ws.Endpoint;

public class ConvertisseurPublieur {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9902/Convertisseur", new ConvertisseurImpl());
		System.out.println("Serveur demarre");
	}

}
