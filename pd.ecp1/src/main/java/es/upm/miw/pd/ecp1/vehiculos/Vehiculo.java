package es.upm.miw.pd.ecp1.vehiculos;

public abstract class Vehiculo {
	
	private int id;
	private String descripcion;
	
	public Vehiculo (int id, String descripcion){
		this.id = id;
		this.descripcion = descripcion;
	}
	
	public abstract Double precioAlquiler (int dias);

}
