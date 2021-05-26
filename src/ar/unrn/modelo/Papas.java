package ar.unrn.modelo;

public class Papas implements Pedido {

	private Pedido pedido;
	private float precio = 150;

	public Papas(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String descripcion() {
		return this.pedido.descripcion() + ", Papas";
	}

	@Override
	public float precio() {
		return this.pedido.precio() + this.precio;
	}
}