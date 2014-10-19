package es.upm.miw.pd.ecp1.vehiculos;

public class Coche extends Vehiculo{
	
	private CategoriaCoche categoria;

	public Coche(int id, String descripcion, CategoriaCoche categoria) {
		super(id, descripcion);
		this.categoria = categoria;
	}

	@Override
	public Double precioAlquiler(int dias) {
		return 0.0;
	}
	

}

