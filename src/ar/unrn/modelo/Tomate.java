package ar.unrn.modelo;

public class Tomate implements Pedido {

	private Pedido pedido;
	private float precio = 50;

	public Tomate(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String descripcion() {
		return this.pedido.descripcion() + ", Tomate";
	}

	@Override
	public float precio() {
		return this.pedido.precio() + this.precio;
	}
}