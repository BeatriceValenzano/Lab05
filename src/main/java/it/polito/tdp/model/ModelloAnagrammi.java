package it.polito.tdp.model;

import java.util.*;

public class ModelloAnagrammi {

	public List<String> anagrammi(String parola) {

//		il livello sarà la lunghezza della parola
		if(parola.length() == 1) {
			LinkedList<String> soluzione = new LinkedList<>();
			soluzione.add(parola);
			return soluzione;
		}
		LinkedList<String> soluzione = new LinkedList<>();
		for(int i=0; i<parola.length(); i++) {
			char lettera = parola.charAt(i);
			List<String> parts = anagrammi(parola.substring(0,i)+parola.substring(i+1));
			for(String s : parts) {
				soluzione.add(lettera+s);
			}
		}
		return soluzione;
	}
	
}
