package model;

import org.uqbar.commons.utils.Observable;

@Observable
public class NotaNumerica extends Nota {

	Integer notaReal;

	public NotaNumerica(Integer notaReal) {
		this.notaReal = notaReal;
	}

	@Override
	public Boolean estaAprobada() {
		return notaReal > 6;
	}

}
