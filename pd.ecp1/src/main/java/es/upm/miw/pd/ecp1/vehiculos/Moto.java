package es.upm.miw.pd.ecp1.vehiculos;

public class Moto extends Vehiculo {

	public Moto(int id) {
		super(id);
	}

	public Moto(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public Double precioAlquiler(int dias) {
		Double precio = 0.0;
		int factor;

		if (dias > 7) {
			factor = 7;
		} else {
			factor = 8;
		}
		for (int i = 1; i <= dias; i++) {
			precio += factor;
		}
		return precio;
	}

	@Override
	public String toString() {
		return "ID: " + id + " - Tipo vehiculo: " + TipoVehiculo.MOTO.name()
				+ " - Descripcion: " + descripcion;
	}

}
