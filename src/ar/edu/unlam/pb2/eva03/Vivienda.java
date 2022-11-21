package ar.edu.unlam.pb2.eva03;

public class Vivienda extends BienMaterial {

	private String direccion;
	private String barrio;
	private String localidad;
	private String provincia;

	public Vivienda(String direccion, String barrio, String localidad, String provincia) {
		this.direccion = direccion;
		this.barrio = barrio;
		this.localidad = localidad;
		this.provincia = provincia;
		
	}

}
