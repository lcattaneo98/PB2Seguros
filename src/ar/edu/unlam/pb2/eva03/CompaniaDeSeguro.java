package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;

import java.util.Set;

public class CompaniaDeSeguro {

	private String nombre;
	private Set<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizas = new HashSet<Poliza>();
	}

	public void agregarPoliza(Poliza poliza) {
		this.polizas.add(poliza);

	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}

	public void denunciarSiniestro(int numeroDePoliza) throws PolizaInexistente {
		
		if (getPoliza(numeroDePoliza) instanceof PolizaDeAuto) {
			((PolizaDeAuto) getPoliza(numeroDePoliza)).setFueRobado(true);
		} else if (getPoliza(numeroDePoliza) instanceof PolizaAccidentesPersonales){
			((PolizaAccidentesPersonales) getPoliza(numeroDePoliza)).setTuvoAlgunAccidente(true);
		}
		
	
	}

	public Poliza getPoliza(int numeroDePoliza) throws PolizaInexistente {
		for (Poliza poliza : polizas) {
			if (poliza.getNumeroDePoliza() == numeroDePoliza) {
				return poliza;
			}
		}
		throw new PolizaInexistente();

	}

}
