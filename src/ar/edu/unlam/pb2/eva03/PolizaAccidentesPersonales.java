package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {

	private List<Persona> beneficiarios;
	private boolean tuvoAlgunAccidente;

	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios = new ArrayList<Persona>();
		this.tuvoAlgunAccidente = false;

	}

	public void setTuvoAlgunAccidente(boolean tuvoAlgunAccidente) {
		this.tuvoAlgunAccidente = tuvoAlgunAccidente;
	}

	protected boolean tuvoAlgunAccidente() {
		return tuvoAlgunAccidente;
	}

	@Override
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario tipoDeBeneficiario) {
		hijo.setTipoDePersona(tipoDeBeneficiario);
		this.beneficiarios.add(hijo);

	}

	@Override
	public int obtenerCantidadDeBeneficiarios() {
		return beneficiarios.size();
	}

	@Override
	public List<Persona> getBeneficiarios() {
		return beneficiarios;
	}

}
