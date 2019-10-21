package inpt.yann.benmaissa;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Convertisseur {
	@WebMethod double celsiusEnFahrenheit(double degres);
	@WebMethod double centimetresEnPouces(double cm);
	@WebMethod double fahrenheitEnCelisius(double degres);
	@WebMethod double poucesEnCentimetres(double pc);

}
