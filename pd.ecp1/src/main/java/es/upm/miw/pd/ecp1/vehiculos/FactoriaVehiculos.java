package es.upm.miw.pd.ecp1.vehiculos;

public class FactoriaVehiculos {

	private static FactoriaVehiculos factoriaVehiculos = null;
	private int ultimoId;

	private FactoriaVehiculos() {
		this.ultimoId = -1;
	}

	public Vehiculo getVehiculo(TipoVehiculo tipo) {
		ultimoId++;
		switch (tipo) {
		case COCHE:
			return new Coche(ultimoId);
		case MOTO:
			return new Moto(ultimoId);
		case BICICLETA:
			return new Bicicleta(ultimoId);
		default:
			return null;
		}

	}

	public static FactoriaVehiculos getFactory() {
		if (factoriaVehiculos == null) {
			factoriaVehiculos = new FactoriaVehiculos();
		}
		return factoriaVehiculos;
	}

}
