package ar.edu.unlam.pb2.eva03;

public class Persona {

	private String nombre;
	private Integer dni;
	private Integer edad;
	private TipoDeBeneficiario tipoDePersona;

	public Persona(String nombre, Integer dni, Integer edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public TipoDeBeneficiario getTipoDePersona() {
		return tipoDePersona;
	}

	public void setTipoDePersona(TipoDeBeneficiario tipoDePersona) {
		this.tipoDePersona = tipoDePersona;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", tipoDePersona=" + tipoDePersona
				+ "]";
	}

}
