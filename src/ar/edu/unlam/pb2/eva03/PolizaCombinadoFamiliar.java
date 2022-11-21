package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales, SegurosDeVida {

	private List<Persona> beneficiarios;
	private BienMaterial bienAsegurado;

	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima,
			Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.beneficiarios = new ArrayList<Persona>();
	}

	@Override
	public void agregarBienAsegurado(BienMaterial bien) {
		this.bienAsegurado = bien;

	}

	@Override
	public void agregarBeneficiario(Persona beneficiario, TipoDeBeneficiario tipoDeBeneficiario) {
		beneficiario.setTipoDePersona(tipoDeBeneficiario);
		beneficiarios.add(beneficiario);

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
