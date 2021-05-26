package ar.unrn.modelo;

public class Queso implements Pedido {

	private Pedido pedido;
	private float precio = 120;

	public Queso(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String descripcion() {
		return this.pedido.descripcion() + ", Queso";
	}

	@Override
	public float precio() {
		return this.pedido.precio() + this.precio;
	}
}