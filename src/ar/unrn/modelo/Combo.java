package ar.unrn.modelo;

public class Combo implements Pedido {

	private String descripcion;
	private float precio;

	public Combo(String descripcion, float precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	@Override
	public String descripcion() {
		return this.descripcion;
	}

	@Override
	public float precio() {
		return this.precio;
	}
}