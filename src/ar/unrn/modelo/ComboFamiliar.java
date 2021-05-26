package ar.unrn.modelo;

public class ComboFamiliar implements Pedido {

	private Pedido combo;

	public ComboFamiliar(Pedido combo) {
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