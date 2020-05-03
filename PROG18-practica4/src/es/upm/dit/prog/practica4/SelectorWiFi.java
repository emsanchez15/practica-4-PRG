package es.upm.dit.prog.practica4;

public class SelectorWiFi implements SelectorLocalizacion {
	
	private WiFi red;
	private double umbral;
	
	public SelectorWiFi( WiFi red, double umbral) {
		this.red = red;
		this.umbral = umbral;
	}
	
	public boolean esValida(Localizacion loc) {
	if (loc != null && red != null) {
		Lectura [] lecturas = loc.copiaDeLecturas();
		for (int i=0; i< lecturas.length; i++) {
			if(lecturas[i].getPotencia() >= umbral && this.red.equals(lecturas[i].getRed())) {
				return true;
			}
		}
	}
	return false;
}
	
}
