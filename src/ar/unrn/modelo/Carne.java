package ar.unrn.modelo;

public class Carne implements Pedido {

	private Pedido pedido;
	private float precio = 250;

	public Carne(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String descripcion() {
		return this.pedido.descripcion() + ", Carne";
	}

	@Override
	public float precio() {
		return this.pedido.precio() + this.precio;
	}
}