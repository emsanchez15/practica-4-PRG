package es.upm.dit.prog.practica4;

import java.util.Arrays;

public class Registro {
	
	private Localizacion [] locs;
	
	public Registro (int i) {
		this.locs = new Localizacion[i]; 
	}
	
	@Override
	public String toString() {
		return "Registro [locs=" + Arrays.toString(locs) + "]";
	}

	public boolean add(Localizacion l) {
		for (int i=0; i< locs.length; i++) {
			if (l != null && locs[i] == null) {
				locs[i] = l;
				return true;
			}
		}
		return false;
	}
	
	public Localizacion getLocalizacion(int n) {
		for (int i=0; i<locs.length; i++) {
			if(n>=0 && n<=locs.length-1 && n==i) {
				return locs[i];
			}
		}
		return null;
	}
	
	
	Localizacion[] getLocalizaciones (SelectorLocalizacion s){
		if(s!= null && locs.length>0) {
			int n=0;
			for (int i=0; i< locs.length; i++) {
				if (s.esValida(locs[i])) {
					n++;
				}
			}
			if(n==0) {
				return new Localizacion[0];
			}
			Localizacion [] locs2 = new Localizacion[n];
			
			n = 0;
			for (int i=0; i< locs.length; i++) {
				if (s.esValida(locs[i])) {
					locs2[n] = locs[i];
					n++;
				}
			}
			return locs2;
		}
		
		return new Localizacion[0];
	}
	
}
