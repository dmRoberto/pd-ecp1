package es.upm.miw.pd.ecp1.vehiculos;

import java.util.Map;

import upm.jbb.IO;

public class ControladorAltaVehiculos {
	
	private Map<Integer, Vehiculo> vehiculos;
	
	public ControladorAltaVehiculos (Map<Integer, Vehiculo> vehiculos){
		this.vehiculos = vehiculos;
	}

	public void darDeAltaVehiculo (){
		TipoVehiculo tipo = (TipoVehiculo) IO.in.select(TipoVehiculo.values(), "Tipo de vehiculo");
		Vehiculo vehiculo = FactoriaVehiculos.getFactory().getVehiculo(tipo);
		vehiculo = (Vehiculo) IO.in.setters(vehiculo, "Introduzca los datos del vehiculo");
		vehiculos.put(vehiculo.getId(), vehiculo);
	}
	
}
