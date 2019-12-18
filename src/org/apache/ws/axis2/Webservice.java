package org.apache.ws.axis2;

public class Webservice {

	public int add(int a, int b) {
		return a + b;
	}
	
	public double calculMensualite(double c, int n , double taux) {
		double tauxtr= transtaux(taux);
		n=n*12;
		return c*tauxtr/(1-Math.pow(1+tauxtr,-n));	
	}
	public double calculCapital(double c, int n , double taux) {
		double tauxtr= transtaux(taux);
		n=n*12;
		return (c*(1-Math.pow(1+tauxtr,-n))/tauxtr);	
	}
	
	public int calculDuree(double c, double n , double taux) {
		double tauxtr= transtaux(taux);
		return (int)((Math.log(c/(c-n*tauxtr))/Math.log(1+tauxtr))/12);	
	}
	
	private double transtaux(double taux) {
		if(taux==0) {
			return -1;
		}
		return Math.pow(1+(taux/100),(1.0/12))-1;
	}
	
}
