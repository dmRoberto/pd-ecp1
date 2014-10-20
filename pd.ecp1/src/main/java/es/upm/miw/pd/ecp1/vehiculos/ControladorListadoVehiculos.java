package es.upm.miw.pd.ecp1.vehiculos;

import java.util.Map;

import upm.jbb.IO;

public class ControladorListadoVehiculos {

	private Map<Integer, Vehiculo> vehiculos;

	public ControladorListadoVehiculos(Map<Integer, Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void listarVehiculos() {
		IO.out.println("=====================");
		for (Vehiculo vehiculo : vehiculos.values()) {
			IO.out.println("► " + vehiculo.toString());
		}
		IO.out.println("=====================");
	}

}
