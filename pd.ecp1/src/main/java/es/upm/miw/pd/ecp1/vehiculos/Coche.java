package es.upm.miw.pd.ecp1.vehiculos;

public class Coche extends Vehiculo {

	private CategoriaCoche categoria;

	public Coche(int id) {
		super(id);
	}

	public Coche(int id, String descripcion, CategoriaCoche categoria) {
		super(id, descripcion);
		this.categoria = categoria;
	}

	@Override
	public Double precioAlquiler(int dias) {
		Double precio = 0.0;
		for (int i = 1; i<=dias;i++){
			if (i < 4){
				precio += categoria.precioBase()*1d;
			}else if (i < 8){
				precio += categoria.precioBase()*0.8d;
			}else{
				precio += categoria.precioBase()*0.5d;
			}
		}
		return precio;
	}

	public CategoriaCoche getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaCoche categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "ID: " + id + " - Tipo vehiculo: " + TipoVehiculo.COCHE.name()
				+ " - Categoria: " + categoria.name() + " - Descripcion: "
				+ descripcion;
	}

}
