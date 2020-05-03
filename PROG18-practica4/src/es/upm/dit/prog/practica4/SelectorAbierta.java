package es.upm.dit.prog.practica4;

public class SelectorAbierta implements SelectorLocalizacion {
	private double umbral;
	
	public SelectorAbierta(double umbral) {
		this.umbral=umbral;
	}
	
	public boolean esValida(Localizacion loc) {
		if(loc != null) {
			Lectura [] lecturas= loc.copiaDeLecturas();
			for(int i=0;i<lecturas.length;i++) {
				if(lecturas != null && lecturas[i].getPotencia() >= umbral && lecturas[i].getRed().getSeguridad() == Seguridad.ABIERTA) {
					return true;
				}
			}
		}
		return false;
	}

}
