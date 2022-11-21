package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private BienMaterial auto;
	private boolean fueRobado;

	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima, Double premio) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima, premio);
		this.fueRobado = false;
	}
	
	public boolean fueRobado() {
		return fueRobado;
	}

	public void setFueRobado(boolean fueRobado) {
		this.fueRobado = fueRobado;
	}

	@Override
	public void agregarBienAsegurado(BienMaterial bien) {
		this.auto = bien;
	}

	public BienMaterial getAuto() {
		return auto;
	}

}
