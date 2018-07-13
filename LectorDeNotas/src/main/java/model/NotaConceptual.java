package model;

public class NotaConceptual implements Nota {

	String notaReal;

	public NotaConceptual(String notaReal) {
		this.notaReal = notaReal;
	}

	public Boolean estaAprobada() {
		return notaReal == "B";
	}

}
