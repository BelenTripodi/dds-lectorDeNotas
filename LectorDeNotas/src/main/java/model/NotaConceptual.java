package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class NotaConceptual extends Nota {

	String notaReal;

	public NotaConceptual(String notaReal) {
		this.notaReal = notaReal;
	}

	@Override
	public Boolean estaAprobada() {
		return !(notaReal.equals(NotasConceptuales.M));
	}

	@Override
	public String getNotaReal() {
		return notaReal;
	}
}