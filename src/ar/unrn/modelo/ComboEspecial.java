package ar.unrn.modelo;

public class ComboEspecial implements Pedido {

	private Pedido combo;

	public ComboEspecial(Pedido combo) {
		this.combo = combo;
	}

	@Override
	public String descripcion() {
		return this.combo.descripcion();
	}

	@Override
	public float precio() {
		return this.combo.precio();
	}
}