package es.upm.miw.pd.ecp1.vehiculos;

public class Moto extends Vehiculo{

	public Moto(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public Double precioAlquiler(int dias) {
		return 0.0;
	}

}
