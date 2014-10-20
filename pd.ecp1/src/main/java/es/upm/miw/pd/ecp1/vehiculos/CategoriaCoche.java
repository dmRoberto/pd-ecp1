package es.upm.miw.pd.ecp1.vehiculos;

public enum CategoriaCoche {
	A(10), 
	B(15),
	C(20);

	private final double precioBase;

	CategoriaCoche(double precio) {
		this.precioBase = precio;
	}

	public Double precioBase() {
		return this.precioBase;
	}
}
