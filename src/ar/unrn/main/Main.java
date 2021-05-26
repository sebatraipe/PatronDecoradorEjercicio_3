package ar.unrn.main;

import ar.unrn.modelo.Carne;
import ar.unrn.modelo.Combo;
import ar.unrn.modelo.ComboBasico;
import ar.unrn.modelo.ComboEspecial;
import ar.unrn.modelo.ComboFamiliar;
import ar.unrn.modelo.Papas;
import ar.unrn.modelo.Pedido;
import ar.unrn.modelo.Tomate;

public class Main {

	public static void main(String[] args) {

		Pedido pedido1 = new ComboBasico(new Tomate(new Combo("Hamburguesa", 500)));
		System.out.println(pedido1.descripcion() + " - " + pedido1.precio());

		Pedido pedido2 = new ComboFamiliar(new Carne(new Combo("Milanea", 750)));
		System.out.println(pedido2.descripcion() + " - " + pedido2.precio());

		Pedido pedido3 = new ComboEspecial(new Papas(new Combo("Hamburguesa", 500)));
		System.out.println(pedido3.descripcion() + " - " + pedido3.precio());

	}
}
