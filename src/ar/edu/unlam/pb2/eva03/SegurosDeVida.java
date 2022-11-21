package ar.edu.unlam.pb2.eva03;

import java.util.List;

public interface SegurosDeVida {
	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario tipoDeBeneficiario);
	public int obtenerCantidadDeBeneficiarios();
	public List<Persona> getBeneficiarios();
}
