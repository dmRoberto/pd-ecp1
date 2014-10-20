package es.upm.miw.pd.ecp1.vehiculos;

import java.util.Map;

import upm.jbb.IO;

public class ControladorCalculoAlquiler {

	private Map<Integer, Vehiculo> vehiculos;

	public ControladorCalculoAlquiler(Map<Integer, Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}

	public void calcularPrecio() {
		
		int identificador = (int) IO.in.select(vehiculos.keySet().toArray(), "Seleccione el ID del vehiculo: ");
		int numeroDias = IO.in.readInt("Indique el numero de dias de alquiler: ");
		Vehiculo vehiculo = vehiculos.get(identificador);

		IO.out.println("El precio de alquiler: "
				+ vehiculo.precioAlquiler(numeroDias) + "€");
	}

}
