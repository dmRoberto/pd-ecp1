package es.upm.miw.pd.ecp1.vehiculos;

public class Bicicleta extends Vehiculo {

	public Bicicleta(int id) {
		super(id);
	}

	public Bicicleta(int id, String descripcion) {
		super(id, descripcion);
	}

	@Override
	public Double precioAlquiler(int dias) {
		Double precio = 0.0;
		for (int i = 1; i<=dias;i++){
			if (i < 3){
				precio += 3;
			}else{
				precio += 2;
			}
		}
		return precio;
	}

	@Override
	public String toString() {
		return "ID: " + id + " - Tipo vehiculo: " + TipoVehiculo.BICICLETA.name()
				+ " - Descripcion: " + descripcion;
	}

}
