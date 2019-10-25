package inpt.yann.benmaissa;

import java.net.URL;
/**
*
* @author SAMOUCHE ISMAIL , JERDAOUI ABDELLATIF, NASSER YAHYA
*/

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClientConvertisseur {

	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:9902/Convertisseur?wsdl");
		QName qname = new QName("http://benmaissa.yann.inpt/" , "ConvertisseurImplService");
		Service service = Service.create(url , qname);
		qname = new QName("http://benmaissa.yann.inpt/" , "ConvertisseurImplPort");
		Convertisseur uc= service.getPort(qname, Convertisseur.class);
		System.out.printf("DC en DF: 37 DC = %f DF %n", uc.celsiusEnFahrenheit(37.0));
	    System.out.printf("CM en PC: 10 CM = %f PC %n", uc.centimetresEnPouces (10));
	    System.out.printf("DF en DC: 212 DF = %f DC %n", uc.fahrenheitEnCelisius(212.0));
	    System.out.printf("PC en CM: 10 PC = %f CM %n", uc.poucesEnCentimetres(10));
	}

}
