package ar.unrn.modelo;

public class ComboBasico implements Pedido {

	private Pedido combo;

	public ComboBasico(Pedido combo) {
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