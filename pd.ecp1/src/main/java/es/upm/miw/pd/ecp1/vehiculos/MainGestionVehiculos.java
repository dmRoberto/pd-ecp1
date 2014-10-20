package es.upm.miw.pd.ecp1.vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import upm.jbb.IO;


public class MainGestionVehiculos {
	
	private static Map<Integer, Vehiculo> vehiculos = new HashMap<Integer, Vehiculo>();

	public static void main(String[] args) {
		IO.out.addController(new ControladorAltaVehiculos(vehiculos));
		IO.out.addController(new ControladorCalculoAlquiler(vehiculos));
		IO.out.addController(new ControladorListadoVehiculos(vehiculos));
	}

}
