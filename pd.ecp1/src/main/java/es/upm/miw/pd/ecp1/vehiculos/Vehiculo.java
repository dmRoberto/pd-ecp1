package es.upm.miw.pd.ecp1.vehiculos;

public abstract class Vehiculo {

	protected int id;
	protected String descripcion;
	
	public Vehiculo(int id) {
		this.id = id;
	}

	public Vehiculo(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public abstract Double precioAlquiler(int dias);
	
	public abstract String toString();

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}



}
