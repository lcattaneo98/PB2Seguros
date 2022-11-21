package ar.edu.unlam.pb2.eva03;

public class Auto extends BienMaterial{

	private String marca;
	private String modelo;
	private Integer año;
	private Double sumaAsegurada;

	public Auto(String marca, String modelo, Integer año, Double sumaAsegurada) {
	this.marca = marca;
	this.modelo = modelo;
	this.año = año;
	this.sumaAsegurada = sumaAsegurada;
	}

}
