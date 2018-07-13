package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class NotaConceptual implements Nota {

	String notaReal;

	public NotaConceptual(String notaReal) {
		this.notaReal = notaReal;
	}

	@Override
	public Boolean estaAprobada() {
		return notaReal != "M";
	}

}
