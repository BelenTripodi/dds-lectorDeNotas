package model;

public class NotaNumerica implements Nota {

	Integer notaReal;

	public NotaNumerica(Integer notaReal) {
		this.notaReal = notaReal;
	}

	public Boolean estaAprobada() {
		return notaReal > 6;
	}

}
