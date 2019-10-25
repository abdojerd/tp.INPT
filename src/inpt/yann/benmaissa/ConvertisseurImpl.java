package inpt.yann.benmaissa;

import javax.jws.WebService;
/**
*
* @author SAMOUCHE ISMAIL , JERDAOUI ABDELLATIF, NASSER YAHYA
*/

@WebService(endpointInterface = "inpt.yann.benmaissa.Convertisseur")
public class ConvertisseurImpl implements Convertisseur{

	@Override
	public double celsiusEnFahrenheit(double degres) {
		// TODO Auto-generated method stub
		return degres * 9.0 / 5.0 + 32;
	}

	@Override
	public double centimetresEnPouces(double pouces) {
		// TODO Auto-generated method stub
		return pouces / 2.54;
	}

	@Override
	public double fahrenheitEnCelisius(double degres) {
		// TODO Auto-generated method stub
		return (degres-32) * 5.0 / 9.0;
	}

	@Override
	public double poucesEnCentimetres(double pouces ) {
		// TODO Auto-generated method stub
		return pouces * 2.54;
	}

}
